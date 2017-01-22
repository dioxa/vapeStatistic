import objects.Bottle;
import tables.LiquidsDao;
import utils.DbConnection;
import utils.CoreUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) throws Exception {
        DbConnection dbConnection = new DbConnection();
        LiquidsDao liquidsDao = new LiquidsDao(dbConnection.getConnection());
        ArrayList<Bottle> bottles = new ArrayList<>(liquidsDao.getLiquds());

        Scanner in = new Scanner(System.in);
        int choice = 1;
        while (choice != 0) {
            if (choice == 1) {
                CoreUtils.printLiquidList(bottles);
            } else if (choice == 2) {
                CoreUtils.addBottleAtList(bottles, liquidsDao, new Bottle(in.next(), in.nextInt(),
                        LocalDate.of(in.nextInt(), in.nextInt(), in.nextInt())));
            }
            choice = in.nextInt();
        }

    }
}