package cellc.za.configs.products.controllers;

import cellc.za.configs.products.constants.Channels;
import cellc.za.configs.products.constants.Messages;
import cellc.za.configs.products.entities.ProductConfig;
import cellc.za.configs.products.repoitories.*;
import cellc.za.configs.products.services.MessageService;
import cellc.za.configs.products.services.impl.ProductConfigServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(ProductConfigViewController.BASE_URL)
public class ProductConfigViewController {

    public static final String BASE_URL ="/view";

    private ProductConfigServiceImpl productConfigService ;
    private ChannelRepository channelRepository;
    private ExpiryWindowRepository expiryWindowRepository;
    private OppTypeRepository oppTypeRepository;
    private QueuesRepository queuesRepository;

    //messages
    private MessageService messageService;

    public @Autowired ProductConfigViewController(ProductConfigServiceImpl productConfigService,
                                                  ChannelRepository channelRepository,
                                                  ExpiryWindowRepository expiryWindowRepository,
                                                  MessageService messageService,
                                                  OppTypeRepository oppTypeRepository,
                                                  QueuesRepository queuesRepository){
        this.productConfigService   = productConfigService;
        this.channelRepository      = channelRepository;
        this.expiryWindowRepository = expiryWindowRepository;
        this.messageService         = messageService;
        this.oppTypeRepository      = oppTypeRepository;
        this.queuesRepository       = queuesRepository;
    }

    //Home Page
    @GetMapping("/create")
    public String createView(Model model){
        model.addAttribute("product",productConfigService.viewProducts());
        model.addAttribute("count",productConfigService.countProducts());
        return "manageProducts";
    }

    //Add product Form
    @PostMapping("/add") public String addProduct(Messages messages,
                                                 ProductConfig product,
                             @RequestParam("operation") String operation,
                             @RequestParam("tarrif")    String tarrif,
                             @RequestParam("prodDesc")  String prodDesc,
                             @RequestParam("channel")   String channel,
                             @RequestParam("expiry")    Integer expiry,
                             @RequestParam("route")     String route,
                             @RequestParam("subType")   String subType,
                             @RequestParam("sms")       String clientSMS ){
         String pc_operation = operation.toUpperCase();
         //set SMSs
         messages = messageService.findMessageById(1L);
         product.setPc_SMS1(messages.getMessageDesc());
         messages = messageService.findMessageById(2L);
         product.setPc_SMS2(messages.getMessageDesc());
         messages = messageService.findMessageById(3L);
         product.setPc_SMS3(messages.getMessageDesc());

         //set Results
         messages = messageService.findMessageById(6L);//result1
         product.setPc_result1(messages.getMessageDesc());
         messages = messageService.findMessageById(7L);//result2
         product.setPc_result2(messages.getMessageDesc());
         messages = messageService.findMessageById(8L);//result3
         product.setPc_result3(messages.getMessageDesc());
         messages = messageService.findMessageById(9L);//result4
         product.setPc_result4(messages.getMessageDesc());
         messages = messageService.findMessageById(10L);//result5
         product.setPc_result5(messages.getMessageDesc());
         messages = messageService.findMessageById(11L);//result6
         product.setPc_result6(messages.getMessageDesc());

         product.setPc_SMS4(clientSMS);//sms4
         product.setPc_operation(pc_operation);
         product.setPc_prod_code(pc_operation);
         product.setPc_prod_desc(prodDesc);
         product.setPc_expiry_window(expiry);
         product.setPc_channel(channel);
         product.setPc_sub_type_list(subType);

         if (product.getPc_sub_type_list().equals("stPre,stHyb")) {
             //sms5 prepaid
             messages = messageService.findMessageById(5L);
             product.setPc_SMS5(messages.getMessageDesc());
             product.setPc_exc_flag("NO");
         }
         else {
             //sms5 postpaid
             messages = messageService.findMessageById(12L);
             product.setPc_SMS5(messages.getMessageDesc());
             product.setPc_exc_flag("YES");
         }

         if (route.equalsIgnoreCase("CRM")){
             product.setPc_tarrif_plan_id("1");
             product.setPc_opp_type("ADD");
             if (product.getPc_channel().
                    equalsIgnoreCase("USSD")) {
                 product.setPc_queue("VAS");
             }
             else{
                product.setPc_queue("VAS_NEW");
             }
         }
         else if (route.equalsIgnoreCase("CBS")){
            product.setPc_tarrif_plan_id(tarrif);
            product.setPc_opp_type("CB040");
            product.setPc_queue("BUNDLE");
         }
         productConfigService.addProduct(product);

         return "redirect:/view/added";
    }
    //delete
    @PostMapping("/delete")
    public String deleteProductById(@RequestParam("uid") Long pc_uid,Model model){
        model.addAttribute("product",new ProductConfig());
        productConfigService.deleteProductById(pc_uid);
        return "redirect:/view/added";
    }
    //Updated Product List Page
    @GetMapping("/added")
    public String test(Model model){
        model.addAttribute("product",productConfigService.viewProducts());
        model.addAttribute("count",productConfigService.countProducts());
        return "manageProducts";
    }
    //
    @GetMapping(path="/edit/")
    public String updateUserView(Model model ,ProductConfig product,Long id) {
        model.addAttribute("channel",channelRepository.findAll());
        Channels channels = new Channels();
        channels.setChannel(channelRepository.findById(id).toString());

        product.setPc_channel(channels.getChannel());
        model.addAttribute("product",productConfigService.addProduct(product));

        return "redirect:/view/view";
    }

    @GetMapping("findOne")
    public @ResponseBody Optional<ProductConfig> findOneProduct(Long id) {
        return productConfigService.searchProductById(id);
    }


    @GetMapping("products")
    public String viewAllProducts(Model model) {
        model.addAttribute("product",productConfigService.viewProducts());
        return "/view/create";
    }

}



