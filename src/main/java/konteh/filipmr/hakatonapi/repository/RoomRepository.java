package konteh.filipmr.hakatonapi.repository;

import konteh.filipmr.hakatonapi.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
