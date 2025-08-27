package gruppe6.kea.jpaonetoone.Repositories;

import gruppe6.kea.jpaonetoone.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User,Integer> {
}
