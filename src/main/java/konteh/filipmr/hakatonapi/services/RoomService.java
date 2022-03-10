package konteh.filipmr.hakatonapi.services;

import konteh.filipmr.hakatonapi.entity.Room;
import konteh.filipmr.hakatonapi.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getAll(){
        return roomRepository.findAll();
    }
}
