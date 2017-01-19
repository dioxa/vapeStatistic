package objects;

import java.time.LocalDateTime;

public class Bottle {


    private String name;

    private int capacity;

    private LocalDateTime dateBuy;

    private LocalDateTime dateClose;

    public Bottle(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String forPrint() {
        return name + " " + capacity;
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
}
