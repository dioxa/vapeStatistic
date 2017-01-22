package tables;

import objects.Bottle;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class LiquidsDao {

    private Connection connection;

    public LiquidsDao(Connection connection) {
        this.connection = connection;
    }

    public List<Bottle> getLiquds () {
        ArrayList<Bottle> table = new ArrayList<>();
            try (Statement stmt = connection.createStatement())  {
                ResultSet result = stmt.executeQuery("SELECT * FROM liquid");
                while (result.next()) {
                    table.add(new Bottle(result.getString("name"), result.getInt("capacity"),  result.getDate("dateBuy").toLocalDate()));
                }
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        if (!table.isEmpty()) {
            return table;
        } else {
            System.out.println("Таблица пуста");
            return table;
        }
    }

    public boolean addLiquid (int id, Bottle bottle) {
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate("INSERT INTO liquid(id, name, capacity, dateBuy) VALUES (" + id+1 + ",'" + bottle.getName() + "',"
                    + bottle.getCapacity() + ", '" + bottle.getDateBuy() + "')");
        } catch (SQLException e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
            return false;
        }
        return true;
    }
}
