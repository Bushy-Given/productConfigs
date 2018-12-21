package cellc.za.configs.products.configs;

import javax.validation.constraints.NotNull;
/**
 *
 * @author Bushy Netshidaulu
 */
public class OracleDataSource {

    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private String url;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
