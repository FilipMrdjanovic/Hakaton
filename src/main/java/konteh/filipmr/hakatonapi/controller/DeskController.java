package konteh.filipmr.hakatonapi.controller;

import konteh.filipmr.hakatonapi.entity.Desk;
import konteh.filipmr.hakatonapi.services.DeskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class DeskController {
    @Autowired
    private DeskService deskService;

    @PostMapping(value = "/post/desks")
    public ResponseEntity createDesk(@RequestBody Desk desk) {
        deskService.createDesk(desk);

        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping(value = "/desks")
    public ResponseEntity getDesks() {
        final List<Desk> retVal = deskService.getAll().stream()
                .map(Desk::new)
                .collect(Collectors.toList());

        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @GetMapping(value = "/desks?room={room}")
    public ResponseEntity getDesksWhereRoom(@PathVariable String name) {
        final List<Desk> retVal = deskService.getAllByRoomName(name).stream()
                .map(Desk::new)
                .collect(Collectors.toList());

        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @DeleteMapping(value = "/desks/{id}")
    public void deleteDesk(@PathVariable Long id) {
        deskService.deleteDesk(id);
    }

}
