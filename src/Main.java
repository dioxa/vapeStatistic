import com.sun.org.apache.xpath.internal.SourceTree;
import objects.Bottle;
import tables.Liquids;
import utils.DBConnection;
import utils.Worker;

import javax.xml.bind.SchemaOutputResolver;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) throws Exception {
        DBConnection dbConnection = new DBConnection();
        Liquids liquids = new Liquids(dbConnection.getConnection());
        ArrayList<Bottle> bottles = new ArrayList<>(liquids.getLiquds());

        Scanner in = new Scanner(System.in);
        int choice = 1;
        while (choice != 0) {
            if (choice == 1) {
                Worker.printLiquidList(bottles);
            } else if (choice == 2) {
                Worker.addBottleAtList(bottles, liquids, new Bottle(in.next(), in.nextInt()));
            }
            choice = in.nextInt();
        }

    }
}