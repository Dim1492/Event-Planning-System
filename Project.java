import java.sql.*;
import java.util.*;
public class Project{
    
    public static void main(String[] args) throws Exception {
        
        
        try{
            Scanner scan=new Scanner(System.in);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_planning","root","D9188018422d");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your details to register:");
        System.out.println("Enter Username: ");
        String username=sc.nextLine();
        System.out.println("Enter password:");
        String password=sc.nextLine();
       Statement statement=connection.createStatement();
        statement.execute("INSERT INTO user values (username,password)");
        ResultSet resultSet = statement.executeQuery("Select * from user");
        while(resultSet.next()){
        System.out.println(resultSet.getString(2)+"\t"+resultSet.getString(3));
            // Statement statement = connection.createStatement();
            // ResultSet resultSet=statement.executeQuery("SELECT * FROM caterer");
            // while (resultSet.next()) {
            //     ResultSetMetaData metaData = resultSet.getMetaData();
            //     int columnCount = metaData.getColumnCount();
            //     for (int i = 1; i <= columnCount; i++) {
            //         System.out.print(resultSet.getString(i) + "\t");
            //     }
            //     System.out.println();
            // }
            

        }}

        catch(Exception e){
            System.out.println(e);
        }
    }
    }

   


        
    
