package objects;

import java.time.LocalDate;

public class Bottle {


    private String name;

    private int capacity;

    private LocalDate dateBuy;

    private LocalDate dateClose = null;

    public Bottle(String name, int capacity, LocalDate dateBuy) {
        this.name = name;
        this.capacity = capacity;
        this.dateBuy = dateBuy;
    }

    public Bottle(String name, int capacity, LocalDate dateBuy, LocalDate dateClose) {
        this.name = name;
        this.capacity = capacity;
        this.dateBuy = dateBuy;
        this.dateClose = dateClose;
    }

    public String toString() {
        return name + " " + capacity + " " + dateBuy + " " + dateClose;
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

    public void setDateClose(LocalDate dateClose) {
        this.dateClose = dateClose;
    }
}
