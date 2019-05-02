package global.citytech.db;

import com.jolbox.bonecp.BoneCPDataSource;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.sql.DataSource;

/**
 * @author rajudhital on 5/1/19
 * @project quarkus
 */
@Dependent
public class DataSourceFactory {


    @ConfigProperty(name = "db.url")
    public String url;
    @ConfigProperty(name = "db.username")
    public String userName;
    @ConfigProperty(name = "db.password")
    public String password;
    @ConfigProperty(name = "db.driver")
    public String driver;

    @ApplicationScoped
    @Produces
    public DataSource getDataSource() {
        BoneCPDataSource dataSource = new BoneCPDataSource();
        dataSource.setDriverClass(driver);
        dataSource.setJdbcUrl(url);
        dataSource.setUser(userName);
        dataSource.setPassword(password);
        return dataSource;
    }
}
