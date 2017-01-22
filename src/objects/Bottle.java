package objects;

import java.time.LocalDate;

public class Bottle {


    private String name;

    private int capacity;

    private LocalDate dateBuy;

    private LocalDate dateClose;

    public Bottle(String name, int capacity, LocalDate dateBuy) {
        this.name = name;
        this.capacity = capacity;
        this.dateBuy = dateBuy;
    }

    public String toString() {
        return name + " " + capacity + " " + dateBuy;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public LocalDate getDateBuy() {
        return dateBuy;
    }

    public LocalDate getDateClose() {
        return dateClose;
    }
}
