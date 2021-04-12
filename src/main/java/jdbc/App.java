package jdbc;


import java.net.ConnectException;
import java.sql.*;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
        Statement statement = connection.createStatement();
        //statement.execute("insert into `pa812`.`user`(first_name, last_name, email, age) values ('Sergey', 'Korolov', 'korolov@gmail.com', 114)");
        //statement.execute("insert into `pa812`.`user`(first_name, last_name, email, age) values ('Linus', 'Torvalds', 'linux@gmail.com', 51)");
       ResultSet resultSet =statement.executeQuery("select * from `pa812`.`user`");

       while (resultSet.next()){


           System.out.println(resultSet.getString("id") + " "+
                   resultSet.getString("first_name") + " "+
                   resultSet.getString("last_name")+ " "+
                   resultSet.getString("email") + " "+
                   resultSet.getString("age"));
       }

        //System.out.println("resultSet = " + resultSet);
    }
}
