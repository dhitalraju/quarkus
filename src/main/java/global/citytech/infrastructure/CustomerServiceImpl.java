package global.citytech.infrastructure;

import global.citytech.domain.entity.Customer;
import global.citytech.domain.service.CustomerService;

import javax.enterprise.context.Dependent;
import java.util.List;
import java.util.Optional;

/**
 * @author rajudhital on 5/1/19
 * @project quarkus
 */
@Dependent
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Optional<List<Customer>> getCustomerList() {
        return Optional.empty();
    }
}
