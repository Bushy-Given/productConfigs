package cellc.za.configs.products.repoitories;

import cellc.za.configs.products.constants.Channels;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelRepository extends CrudRepository<Channels,Long> {
}
