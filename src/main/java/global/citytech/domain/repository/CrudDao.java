package global.citytech.domain.repository;

import global.citytech.domain.entity.Entity;

import java.util.List;
import java.util.Optional;

/**
 * @author rajudhital on 5/1/19
 * @project quarkus
 */
public interface CrudDao<T extends Entity> {

    Optional<T> insert(T entity);

    Optional<T> update(T entity);

    Optional<List<T>> findAll();

    Optional<List<T>> findListByFilterCriteria(FilterCriteria criteria);

    Optional<T> findByCriteria(FilterCriteria criteria);
}
