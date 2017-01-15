package Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table (name = "liquid")
public class Liquid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;

    @Column (name = "name", nullable = false)
    private String name;

    @Column (name = "capacity", nullable = false)
    private int capacity;

    @Column (name = "dateBuy")
    private LocalDateTime dateBuy;

    @Column (name = "dateEnd")
    private LocalDateTime dateClose;

    public Liquid() {}

    public Liquid(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public LocalDateTime getDateBuy() {
        return dateBuy;
    }

    public LocalDateTime getDateClose() {
        return dateClose;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setDateBuy(LocalDateTime dateBuy) {
        this.dateBuy = dateBuy;
    }

    public void setDateClose(LocalDateTime dateClose) {
        this.dateClose = dateClose;
    }
}
