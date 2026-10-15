
import java.sql.*;

public class StudentDisplay {
    public static void main(String[] args) {
        try {
            Connection con = DBConnection.getConnection();

            Statement stmt = con.createStatement();

            String sql = "SELECT RollNo, Name FROM Student WHERE Percentage > 70";

            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Students scoring above 70%:");

            while (rs.next()) {
                System.out.println(
                    "Roll No: " + rs.getInt("RollNo") +
                    ", Name: " + rs.getString("Name")
                );
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
