package cellc.za.configs.products.constants;
/**
 *
 * @author Bushy Netshidaulu
 */
public class Constants {
    public static final String FIND_BY_SMS_ID ="SELECT * FROM PC_MESSAGES  WHERE ID = ?1";
    public static final String FIND_BY_PRODUCT_CODE ="SELECT * FROM PC_PRODUCT_CONFIG  WHERE pc_prod_code = ?1";
    public static final String BASE_URL = "productconfig/";
}
