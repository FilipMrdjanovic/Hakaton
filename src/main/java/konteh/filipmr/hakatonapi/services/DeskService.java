package konteh.filipmr.hakatonapi.services;

import konteh.filipmr.hakatonapi.entity.Desk;
import konteh.filipmr.hakatonapi.repository.DeskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeskService {
    @Autowired
    private DeskRepository deskRepository;

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
}
