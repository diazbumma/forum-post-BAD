package com.diazbumma.jdbc;

import java.sql.*;
import java.text.SimpleDateFormat;

public class SortMovieByYear {

    static final String MYSQL_DB_NAME = "posting_w10_tv_reviews";
    static final String MYSQL_USER = "root";
    static final String MYSQL_PASSWORD = "develpass";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(("jdbc:mysql://localhost:3306/" + MYSQL_DB_NAME), MYSQL_USER, MYSQL_PASSWORD);

            Statement statement = connection.createStatement();

            String query = "SELECT title, genre, released_year FROM series\n" +
                    "ORDER BY released_year DESC;";

            ResultSet resultSet = statement.executeQuery(query);

            System.out.println("TV Show ordered by year released:");
            while(resultSet.next()) {
                Date date = resultSet.getDate("released_year");
                SimpleDateFormat df = new SimpleDateFormat("yyyy");

                System.out.println("Title: " + resultSet.getString("title") + "\n"
                        + "Genre: " + resultSet.getString("genre") + "\n"
                        + "Year: " + df.format(date) + "\n"
                        + "==========================="
                );
            }

            connection.close();

        } catch(Exception e){
            System.out.println(e);
        }
    }
}
