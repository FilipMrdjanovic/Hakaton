package konteh.filipmr.hakatonapi.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "desk")
public class Desk implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = true)
    private int ordered;

/*    public Desk(Long id, int ordered) {
        this.id = id;
        this.ordered = ordered;
    }*/

    public Desk() {
    }

    public Desk(Desk desk) {
        this.id = desk.getId();
        this.ordered = desk.getOrdered();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOrdered() {
        return ordered;
    }

    public void setOrdered(int ordered) {
        this.ordered = ordered;
    }
}
