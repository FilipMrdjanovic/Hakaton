package konteh.filipmr.hakatonapi.controller;

import konteh.filipmr.hakatonapi.entity.Faculty;
import konteh.filipmr.hakatonapi.entity.Room;
import konteh.filipmr.hakatonapi.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class RoomController {
    @Autowired
    private RoomService roomService;

    @GetMapping(value = "/rooms")
    public ResponseEntity getRooms() {
        final List<Room> retVal = roomService.getAll().stream()
                .map(Room::new)
                .collect(Collectors.toList());

        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }
}
