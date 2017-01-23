package utils;


import objects.Bottle;
import tables.LiquidsDao;

import java.time.LocalDate;
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

    public static void setDateClose (ArrayList<Bottle> bottles, LiquidsDao liquidsDao, int id, LocalDate dateClose) {
        if (liquidsDao.setDataClose(id, dateClose)) {
            bottles.get(id-1).setDateClose(dateClose);
            System.out.println("Дата успешно добавленна");
        } else {
            System.out.println("Произошла ошибка при добавлении даты");
        }
    }

    public static int getAvarageOfLiquid (ArrayList<Bottle> bottles) {
        int statistic[] = new int[2];
        statistic[0] = statistic[1] = 0;
        if (!bottles.isEmpty()) {
            for (Bottle bottle : bottles) {
                if (bottle.getDateClose() != null) {
                    statistic[0] += bottle.getCapacity() /
                            (1 + bottle.getDateClose().getDayOfYear() - bottle.getDateBuy().getDayOfYear());
                    statistic[1] += 1;
                }
            }
        }
        return statistic[0] / statistic[1];
    }
}
