package src.interfaces;

import java.sql.*;
public class half_of_factorial {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/test";
        String username = "Sara";
        String password = "12345s";

        try(Connection conn = DriverManager.getConnection(url,username,password);
            Statement myState = conn.createStatement()
        ){
            PreparedStatement ps = conn.prepareStatement("Select*" +
                    "from market where price>400");

            myState.executeUpdate("Create table if not exists market(id int not null auto_increment," +
                    "productCategory varchar(50)," +
                    "productname varchar(50)," +
                    "price int," +
                    "brand varchar");

            System.out.println("Table was Created!");
            ResultSet resultSet = ps.executeQuery();
            int id = resultSet.getInt("id");
            String productCategory = resultSet.getString("productCategory");
            String productname = resultSet.getString("productname");
            int price = resultSet.getInt("price");
            String brand = resultSet.getString("brand");
            ps.setString(1,productCategory);
            ps.setString(2,productname);
            ps.setInt(3,price);
            ps.setString(4,brand);

            myState.executeUpdate("Insert into market (productCategory,productname,price,brand) values" +
                    "('Напиток','Пепси',25, 'Coca-Cola')," +
                    "('Полуфабрикаты','Колбаса', 600,'Салих')," +
                    "('Полуфабрикаты','Сосиски', 750,'Салих')," +
                    "('Полуфабрикаты','Сыр', 300,'Салих')," +
                    "('Молочная продукция','Молоко', 50,'Веселый молочник')," +
                    "('Молочная продукция','Кефир', 50,'Веселый молочник')," +
                    "('Молочная продукция','Йогурт', 50,'Веселый молочник')," +
                    "('Конфеты и печенье', 'Печенье',70,'Юбилейное')");



            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                System.out.println("\nНазвание категории: " + rs.getString("productCategory") + "\nНазвание продукта: " + rs.getString("productname") + "\nЦена: " + rs.getString("price") + "\nБренд: " + rs.getString("brand") );
            }
        }

    }
}