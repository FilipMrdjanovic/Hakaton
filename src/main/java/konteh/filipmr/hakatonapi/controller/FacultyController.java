package konteh.filipmr.hakatonapi.controller;

import konteh.filipmr.hakatonapi.entity.Desk;
import konteh.filipmr.hakatonapi.entity.Faculty;
import konteh.filipmr.hakatonapi.services.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class FacultyController {
    @Autowired
    private FacultyService facultyService;

    @GetMapping(value = "/faculties")
    public ResponseEntity getFaculties() {
        final List<Faculty> retVal = facultyService.getAll().stream()
                .map(Faculty::new)
                .collect(Collectors.toList());

        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }
}
