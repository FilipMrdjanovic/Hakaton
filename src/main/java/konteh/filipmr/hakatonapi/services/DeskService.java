package konteh.filipmr.hakatonapi.services;

import konteh.filipmr.hakatonapi.entity.Desk;
import konteh.filipmr.hakatonapi.entity.Room;
import konteh.filipmr.hakatonapi.repository.DeskRepository;
import konteh.filipmr.hakatonapi.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class DeskService {
    @Autowired
    private DeskRepository deskRepository;
    @Autowired
    private RoomRepository roomRepository;

    public Desk createDesk(Desk desk){
        Desk newDesk = new Desk();
        newDesk.setOrdered(desk.getOrdered());
        return deskRepository.save(newDesk);
    }

    public List<Desk> getAll(){
        return deskRepository.findAll();
    }

    public void deleteDesk(Long id){
        deskRepository.deleteById(id);
    }

    public List<Desk> getAllByRoomName(String name) {
        Room temp = roomRepository.findRoomByName(name);
        return deskRepository.findAllByRoomId(temp.getId());
    }
}
