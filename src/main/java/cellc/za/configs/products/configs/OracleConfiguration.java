package cellc.za.configs.products.configs;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.validation.constraints.NotNull;
/**
 *
 * @author Bushy Netshidaulu
 */
@Configuration
@ConfigurationProperties("oracle")
public class OracleConfiguration {
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

   /* @Bean
    DataSource dataSource() throws SQLException {

        OracleDataSource dataSource = new OracleDataSource();
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setUrl(url);
        //dataSource.setImplicitCachingEnabled(true);
       // dataSource.setFastConnectionFailoverEnabled(true);
        return dataSource;
    }*/
}