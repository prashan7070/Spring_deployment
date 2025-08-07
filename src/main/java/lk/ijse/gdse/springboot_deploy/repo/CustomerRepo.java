package lk.ijse.gdse.springboot_deploy.repo;

import lk.ijse.gdse.springboot_deploy.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer , Integer> {
}
