package konteh.filipmr.hakatonapi.repository;

import konteh.filipmr.hakatonapi.entity.Desk;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeskRepository extends JpaRepository<Desk, Long> {
    public List<Desk> findAllByRoomId(Long id);
}
