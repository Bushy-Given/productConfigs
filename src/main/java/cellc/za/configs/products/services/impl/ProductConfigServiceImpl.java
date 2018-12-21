package cellc.za.configs.products.services.impl;

import cellc.za.configs.products.entities.ProductConfig;
import cellc.za.configs.products.repoitories.ProductConfigRepository;
import cellc.za.configs.products.services.ProductConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
/**
 *
 * @author Bushy Netshidaulu
 */
@Service
public class ProductConfigServiceImpl implements ProductConfigService {

    private ProductConfigRepository productConfigRepository;

    public  @Autowired ProductConfigServiceImpl(ProductConfigRepository productConfigRepository){
        this.productConfigRepository = productConfigRepository;
    }
    @Override
    public Iterable<ProductConfig> saveAllProducts(Iterable<ProductConfig> products){
        return productConfigRepository.saveAll(products);
    }
    @Override
    public ProductConfig addProduct(ProductConfig product){
        return productConfigRepository.save(product);
    }
    @Override
    public Optional<ProductConfig> searchProductById(Long pc_uid){
        return productConfigRepository.findById(pc_uid);
    }
    @Override
    public void deleteProductById(Long pc_uid){
        productConfigRepository.deleteById(pc_uid);
    }
    @Override
    public boolean checkProductIfExistById(Long pc_uid){
        return productConfigRepository.existsById(pc_uid);
    }
    @Override
    public long countProducts(){
        return productConfigRepository.count();
    }
    @Override
    public Iterable<ProductConfig> findByProdCode(String prodCode) {
        return productConfigRepository.findByPc_prod_code(prodCode);
    }
    @Override
    public Iterable<ProductConfig> viewProducts(){
        return productConfigRepository.findAll();
    }
}
