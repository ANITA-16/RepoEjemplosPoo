package proyecto_db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Proyecto_DB {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:DB_Test1.db");
        Statement statement =connection.createStatement();
        statement.executeUpdate("insert into Estudiante values('Iam' , 10)");
        ResultSet resultset = statement.executeQuery("select * from Estudiante");
        while(resultset.next()){
            System.out.println(resultset.getString("nombreEstudiante") + ", " +
                                                   resultset.getString("nota1"));
              
        }
        
    }
    
    
}
