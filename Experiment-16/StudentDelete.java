
import java.sql.*;

public class StudentDelete {
    public static void main(String[] args) {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "DELETE FROM Student WHERE RollNo = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 1);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Student record deleted successfully.");
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
