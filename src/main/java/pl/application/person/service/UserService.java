package pl.application.person.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.application.person.enity.User;
import pl.application.person.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void addNewUser (User user){
        userRepository.saveAndFlush(user);
    }
}
