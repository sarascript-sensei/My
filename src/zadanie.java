import java.sql.*;
import java.util.Scanner;

public class zadanie {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/test";
    String name_db = "Sara";
    String password = "12345s";

        try(Connection conn = DriverManager.getConnection(url,name_db,password);
            Statement myState = conn.createStatement()
                )
                {
                System.out.println("Таблица создана!!");


                Scanner in = new Scanner(System.in);

                System.out.println("Впишите название книги: ");
                String nameInsert = in.next();

                System.out.println("Впишите автора : ");
                String authorInsert = in.next();

                System.out.println("Впишите количество страниц ");
                int how_many_strInsert = in.nextInt();

                System.out.println("Впишите год выпуска: ");
                int publishYearInsert = in.nextInt();


                myState.executeUpdate("Insert into books set name = '"+nameInsert+"',author='"+authorInsert+"',how_many_str="+how_many_strInsert+",publish_year="+publishYearInsert+" ");

                System.out.println("========All books data===");

                ResultSet set3 = myState.executeQuery("Select * from books");

                while (set3.next())
                {
                System.out.println("Название книги: " + set3.getString("name") + ". Имя автора: " + set3.getString("author")  + ". Количество страниц: " + set3.getString("how_many_str")  + ". Год выпуска: " + set3.getString("publish_year") );
                }


                }

                }
                }
