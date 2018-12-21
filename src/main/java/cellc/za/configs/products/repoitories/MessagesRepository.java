package cellc.za.configs.products.repoitories;

import cellc.za.configs.products.constants.Constants;
import cellc.za.configs.products.constants.Messages;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Bushy Netshidaulu
 */
@Repository
public interface MessagesRepository extends CrudRepository<Messages,Long> {
    @Query(value = Constants.FIND_BY_SMS_ID,nativeQuery = true)
    Messages findMessageById(long id);
}
