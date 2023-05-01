import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        
    
        System.out.println("Hello, World!");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_planning","root","D9188018422d");
            Statement statement = connection.createStatement();
            ResultSet resultSet=statement.executeQuery("SELECT * FROM caterer");
            while (resultSet.next()) {
                ResultSetMetaData metaData = resultSet.getMetaData();
                int columnCount = metaData.getColumnCount();
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(resultSet.getString(i) + "\t");
                }
                System.out.println();
            }
            

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

    

