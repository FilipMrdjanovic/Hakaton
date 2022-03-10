package konteh.filipmr.hakatonapi.services;

import konteh.filipmr.hakatonapi.entity.Faculty;
import konteh.filipmr.hakatonapi.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyService {
    @Autowired
    private FacultyRepository facultyRepository;

    public List<Faculty> getAll(){
        return facultyRepository.findAll();
    }
}
