package Project.Supplementry.Userdetails.service;

import Project.Supplementry.Userdetails.Userdetails;
import Project.Supplementry.Userdetails.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public String register(Userdetails user) {
        if (userRepo.existsByUsername(user.getUsername())) {
            return "Username already exists!";
        }
        user.setPassword(encoder.encode(user.getPassword()));
        userRepo.save(user);
        return "Success";
    }

    public boolean login(String username, String password) {
        Userdetails user = userRepo.findByUsername(username);
        return user != null && encoder.matches(password, user.getPassword());
    }
}

