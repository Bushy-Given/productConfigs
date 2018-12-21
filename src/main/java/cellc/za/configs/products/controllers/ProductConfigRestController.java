package cellc.za.configs.products.controllers;

import cellc.za.configs.products.constants.Constants;
import cellc.za.configs.products.entities.ProductConfig;
import cellc.za.configs.products.services.impl.ProductConfigServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
/**
 *
 * @author Bushy Netshidaulu
 */
@RestController
@RequestMapping(ProductConfigRestController.BASE_URL)
public class ProductConfigRestController {

    public static final String BASE_URL = Constants.BASE_URL;
    public static final String CONTROLLER_NAME = ProductConfigViewController.class.getSimpleName();

    private ProductConfigServiceImpl productConfigService ;

    public @Autowired ProductConfigRestController(ProductConfigServiceImpl productConfigService){
        this.productConfigService = productConfigService;
    }

    @PostMapping("add")
    public ProductConfig addProduct(@RequestBody ProductConfig product){
        return productConfigService.addProduct(product);
    }
    @PutMapping("edit/{pc_uid}")
    public ProductConfig editProduct(@RequestBody ProductConfig product,
                                     @PathVariable("pc_uid") Long id){
        product.setPc_uid(id);
        return productConfigService.addProduct(product);
    }
    @GetMapping("search/{pc_uid}")
    public Optional<ProductConfig> searchProductById(@PathVariable Long pc_uid){
        return productConfigService.searchProductById(pc_uid);
    }
    @DeleteMapping("remove/{pc_uid}")
    public void deleteProductById(@PathVariable Long pc_uid){
        productConfigService.deleteProductById(pc_uid);
    }
    @GetMapping("exist/{pc_uid}")
    public boolean checkProductIfExistById(@PathVariable Long pc_uid){
        return productConfigService.checkProductIfExistById(pc_uid);
    }
    @GetMapping("count")
    public long countProducts(){
        return productConfigService.countProducts();
    }
    @GetMapping("productcode/{code}")
    public Iterable<ProductConfig> findByProductCode(@PathVariable String code) {
        return productConfigService.findByProdCode(code);
    }
    @GetMapping("products")
    public Iterable<ProductConfig> viewAllProducts(){
        return productConfigService.viewProducts();
    }
    @PostMapping("all")
    public Iterable<ProductConfig> addAllProducts(@RequestBody Iterable<ProductConfig> p){
        return productConfigService.saveAllProducts(p);
    }

}
