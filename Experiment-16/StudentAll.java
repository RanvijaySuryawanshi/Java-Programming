import java.sql.*;

public class StudentAll {
    public static void main(String[] args) {
        try {
            Connection con = DBConnection.getConnection();

            Statement stmt = con.createStatement();

            String sql = "SELECT * FROM Student";

            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Student Records:");

            while (rs.next()) {
                System.out.println(
                    "Roll No: " + rs.getInt("RollNo") +
                    ", Name: " + rs.getString("Name") +
                    ", Percentage: " + rs.getFloat("Percentage")
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
