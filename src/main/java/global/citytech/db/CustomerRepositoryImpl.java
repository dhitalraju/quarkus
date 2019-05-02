package global.citytech.db;

import global.citytech.domain.entity.Customer;
import global.citytech.domain.repository.CustomerRepository;
import global.citytech.domain.repository.FilterCriteria;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

/**
 * @author rajudhital on 5/1/19
 * @project quarkus
 */
@Dependent
public class CustomerRepositoryImpl implements CustomerRepository {

    private DataSource dataSource;

    @Inject
    public CustomerRepositoryImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Optional<Customer> insert(Customer entity) {
        return Optional.empty();
    }

    @Override
    public Optional<Customer> update(Customer entity) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Customer>> findAll() {
        return Optional.empty();
    }

    @Override
    public Optional<List<Customer>> findListByFilterCriteria(FilterCriteria criteria) {
        return Optional.empty();
    }

    @Override
    public Optional<Customer> findByCriteria(FilterCriteria criteria) {
        return Optional.empty();
    }
}
