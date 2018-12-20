package cellc.za.configs.products.repoitories;

import cellc.za.configs.products.constants.Queues;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueuesRepository extends CrudRepository<Queues,Long>{

}
