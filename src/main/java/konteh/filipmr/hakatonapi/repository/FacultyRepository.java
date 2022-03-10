package konteh.filipmr.hakatonapi.repository;

import konteh.filipmr.hakatonapi.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
}
