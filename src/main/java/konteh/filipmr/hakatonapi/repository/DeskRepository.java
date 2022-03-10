package konteh.filipmr.hakatonapi.repository;

import konteh.filipmr.hakatonapi.entity.Desk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeskRepository extends JpaRepository<Desk, Long> {
}
