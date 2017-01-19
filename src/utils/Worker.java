package utils;


import objects.Bottle;
import tables.Liquids;

import java.util.ArrayList;

public class Worker {

    public static void printLiquidList (ArrayList<Bottle> bottles) {
        if (!bottles.isEmpty()) {
            for (Bottle bottle : bottles) {
                System.out.println(bottle.forPrint());
            }
        }
    }

    public static void addBottleAtList (ArrayList<Bottle> bottles, Liquids liquids, Bottle newBottle) {
        if (liquids.addLiquid(bottles.size(), newBottle)) {
            bottles.add(newBottle);
            System.out.println("Жидкость успешно добавленна");
        } else {
            System.out.println("Произошла ошибка при добавлении жидкости");
        }
    }
}
