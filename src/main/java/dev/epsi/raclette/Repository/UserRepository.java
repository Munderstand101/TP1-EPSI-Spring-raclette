package dev.epsi.raclette.Repository;

import dev.epsi.raclette.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Munderstand
 * @created 13/03/2023 - 08:52
 * @project raclette
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {}