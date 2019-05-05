import java.sql.Connection;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) throws SQLException {


        for (int i = 0; i < 10; i++) {
            Connection conn=MyDataSource.getConncetion();
            conn.close();
            System.out.println(conn);
        }

        for (int i = 0; i < 10; i++) {
            Connection conn=MyDataSource.getConncetion();
            conn.close();
            System.out.println(conn);
        }
    }
}
