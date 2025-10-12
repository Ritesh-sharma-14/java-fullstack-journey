import java.util.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

Public class Main{
    Public static void main(String[] args){
         //database URL  
       String url = "jdbc:mysql://localhost:3306/Students";

       //Database credentials
       String username = " ";
       String password = " ";

      //Establish the connection
      try(Connection connection = DriverManager.getConnection(url,username,password)){
          System.out.println("Connected to the database");
          //perform database operation here 
      }catch(SQLException e){
            System.err.println("Connection failed:" +e.getMessage());
        }
    }
}


        
