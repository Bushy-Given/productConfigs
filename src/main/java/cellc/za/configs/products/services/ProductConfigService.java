package cellc.za.configs.products.services;

import cellc.za.configs.products.entities.ProductConfig;

import java.util.Optional;

public interface ProductConfigService {

    ProductConfig addProduct(ProductConfig product);
    Optional<ProductConfig> searchProductById(Long pc_uid);
    void deleteProductById(Long pc_uid);
    boolean checkProductIfExistById(Long pc_uid);
    long countProducts();
    Iterable<ProductConfig> findByProdCode(String prodCode);
    Iterable<ProductConfig> viewProducts();
}
