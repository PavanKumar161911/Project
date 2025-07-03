package Project.Supplementry.Userdetails.repository;

import Project.Supplementry.Userdetails.Userdetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Userdetails, Integer> {
    Userdetails findByUsername(String username);
    boolean existsByUsername(String username);
}
