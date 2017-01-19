package tables;

import objects.Bottle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Liquids {

    private Connection connection;

    public Liquids(Connection connection) {
        this.connection = connection;
    }

    public List<Bottle> getLiquds () {
        ArrayList<Bottle> table = new ArrayList<>();
            try (Statement stmt = connection.createStatement())  {
                ResultSet result = stmt.executeQuery("SELECT id, name, capacity FROM liquid");
                while (result.next()) {
                    table.add(new Bottle(result.getString("name"), result.getInt("capacity")));
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
            stmt.executeUpdate("INSERT INTO liquid(id, name, capacity) VALUES (" + id+1 + ",'" + bottle.getName() + "',"
                    + bottle.getCapacity() + ")");
        } catch (SQLException e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
            return false;
        }
        return true;
    }
}
