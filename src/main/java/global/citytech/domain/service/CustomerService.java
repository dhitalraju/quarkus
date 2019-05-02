package global.citytech.domain.service;

import global.citytech.domain.entity.Customer;

import java.util.List;
import java.util.Optional;

/**
 * @author rajudhital on 5/1/19
 * @project quarkus
 */
public interface CustomerService {

     Optional<List<Customer>> getCustomerList();
}
