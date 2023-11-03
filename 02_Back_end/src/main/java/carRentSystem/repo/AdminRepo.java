package carRentSystem.repo;


import carRentSystem.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdminRepo extends JpaRepository<Admin, String> {
}
