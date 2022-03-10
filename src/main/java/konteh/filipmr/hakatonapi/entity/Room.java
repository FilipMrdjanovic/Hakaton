package konteh.filipmr.hakatonapi.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity

@Table(name = "room")
public class Room implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @OneToMany
    private List<Desk> desks;

    public Room(Long id, String name, List<Desk> desks) {
        this.id = id;
        this.name = name;
        this.desks = desks;
    }

    public Long getId() {
        return id;
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

    public List<Desk> getDesks() {
        return desks;
    }

    public void setDesks(List<Desk> desks) {
        this.desks = desks;
    }

    public Room(Room room) {
        this.id = room.getId();
        this.name = room.getName();
        this.desks = room.getDesks();
    }
}
