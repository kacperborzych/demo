package pl.application.person.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.application.person.enity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    public User findUserByLName(String lName);

    public User finUserById(Long id);
}
