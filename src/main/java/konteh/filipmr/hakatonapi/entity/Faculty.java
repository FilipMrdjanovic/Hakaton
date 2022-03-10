package konteh.filipmr.hakatonapi.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.List;

@Entity
@Table(name = "faculty")
public class Faculty implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private Time opens;
    @Column
    private Time closes;
    @OneToMany
    private List<Room> rooms;

    public Long getId() {
        return id;
    }

    public Faculty(Long id, String name, Time opens, Time closes, List<Room> rooms) {
        this.id = id;
        this.name = name;
        this.opens = opens;
        this.closes = closes;
        this.rooms = rooms;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Time getOpens() {
        return opens;
    }

    public void setOpens(Time opens) {
        this.opens = opens;
    }

    public Time getCloses() {
        return closes;
    }

    public void setCloses(Time closes) {
        this.closes = closes;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public Faculty(Faculty faculty) {
        this.id = faculty.getId();
        this.name = faculty.getName();
        this.opens = faculty.getOpens();
        this.closes = faculty.getCloses();
        this.rooms = faculty.getRooms();
    }
}
