package com.diazbumma.jdbc;

import java.sql.*;

public class ShowReviews {

    static final String MYSQL_DB_NAME = "posting_w10_tv_reviews";
    static final String MYSQL_USER = "root";
    static final String MYSQL_PASSWORD = "develpass";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(("jdbc:mysql://localhost:3306/" + MYSQL_DB_NAME), MYSQL_USER, MYSQL_PASSWORD);

            Statement statement = connection.createStatement();

            String query = "SELECT\n" +
                    "title,\n" +
                    "rating,\n" +
                    "CONCAT(first_name, ' ', last_name) AS reviewer\n" +
                    "FROM series\n" +
                    "INNER JOIN reviews\n" +
                    "ON series.id = reviews.series_id\n" +
                    "INNER JOIN reviewers\n" +
                    "ON reviews.reviewer_id = reviewers.id\n" +
                    "ORDER BY title;";

            ResultSet resultSet = statement.executeQuery(query);

            System.out.println("Show movie/tv show reviews:");
            while(resultSet.next()) {

                System.out.println("Title: " + resultSet.getString("title") + "\n"
                        + "Rating: " + resultSet.getFloat("rating") + "\n"
                        + "Reviewer: " + resultSet.getString("reviewer") + "\n"
                        + "==========================="
                );
            }

            connection.close();

        } catch(Exception e){
            System.out.println(e);
        }
    }
}
