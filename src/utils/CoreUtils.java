package utils;


import objects.Bottle;
import tables.LiquidsDao;

import java.util.ArrayList;

public class CoreUtils {

    public static void printLiquidList (ArrayList<Bottle> bottles) {
        if (!bottles.isEmpty()) {
            for (Bottle bottle : bottles) {
                System.out.println(bottle);
            }
        }
    }

    public static void addBottleAtList (ArrayList<Bottle> bottles, LiquidsDao liquidsDao, Bottle newBottle) {
        if (liquidsDao.addLiquid(bottles.size(), newBottle)) {
            bottles.add(newBottle);
            System.out.println("Жидкость успешно добавленна");
        } else {
            System.out.println("Произошла ошибка при добавлении жидкости");
        }
    }
}
