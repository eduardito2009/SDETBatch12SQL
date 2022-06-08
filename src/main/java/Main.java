import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        //connection string usually provided by DBA
        String dbURL = "jdbc:mysql://3.237.189.167:3306/syntaxhrm_mysql";
        //jdbc java api is a collection of interfaces and classes
        //mysql This is the name of the database that we will be working with
        //3.237.189.167 Ip of the server where we have the database
        //3306 port on which the database is active
        //syntaxhrm_mysql name of the database or schema
        String userName = "syntax_hrm";
        String password = "syntaxhrm123";
        //User Name and passwords will be use to track and give different access levels

        Connection connection= DriverManager.getConnection(dbURL,userName,password);
        // Statement is responsible for taking your queries executing on the database and bringing
        //the results back
        Statement statement = connection.createStatement();
        String query = "select * from employee";
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            String empiId = resultSet.getString("empid");
            String salary = resultSet.getString("salary");
            String grade = resultSet.getString("grade");
            String department = resultSet.getString("department");
            System.out.println(empiId+" "+ salary+ " "+ grade+ " "+ department);
        }
    }
}
