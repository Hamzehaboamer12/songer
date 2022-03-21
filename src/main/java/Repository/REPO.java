package Repository;

import classes.Albums;
import org.springframework.data.repository.CrudRepository;

public interface REPO extends CrudRepository<Albums,Long> {
}
