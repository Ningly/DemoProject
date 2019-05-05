import java.sql.Connection;
import java.sql.DriverManager;

public class JDbcUtil {
    public static Connection getConnection() {
        Connection conn = null;
        //1. 加载与注册JDBC驱动
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //2. 得到连接
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=Tutoral", "sa", "Sa123456");
        } catch (Exception e) {

        }
        return conn;
    }
}
