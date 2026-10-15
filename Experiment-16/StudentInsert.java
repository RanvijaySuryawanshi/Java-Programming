
import java.sql.*;

public class StudentInsert {
    public static void main(String[] args) {
        try {
            Connection con = DBConnection.getConnection();

            Statement stmt = con.createStatement();

            stmt.executeUpdate(
                "CREATE TABLE IF NOT EXISTS Student (" +
                "RollNo INT PRIMARY KEY, " +
                "Name VARCHAR(50), " +
                "Percentage FLOAT)"
            );

            System.out.println("Table created successfully.");

            int result = stmt.executeUpdate(
                "INSERT IGNORE INTO Student VALUES (1, 'Rahul', 85.5)"
            );

            if (result > 0) {
                System.out.println("Record inserted successfully.");
            } else {
                System.out.println("Record already exists.");
            }

            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
