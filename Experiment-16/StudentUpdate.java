
import java.sql.*;

public class StudentUpdate {
    public static void main(String[] args) {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "UPDATE Student SET Percentage = ? WHERE RollNo = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setFloat(1, 90.0f);
            ps.setInt(2, 1);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Student percentage updated successfully.");
            } else {
                System.out.println("Student not found.");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
