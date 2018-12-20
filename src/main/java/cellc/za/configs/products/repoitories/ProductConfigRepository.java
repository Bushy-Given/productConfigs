package cellc.za.configs.products.repoitories;

import cellc.za.configs.products.constants.Constants;
import cellc.za.configs.products.entities.ProductConfig;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductConfigRepository extends CrudRepository<ProductConfig,Long> {

    @Query(value = Constants.FIND_BY_PRODUCT_CODE, nativeQuery = true)
    Iterable<ProductConfig> findByPc_prod_code(String pc_prod_code);
}
