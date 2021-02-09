package com.diazbumma.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Create table and starter data
 */
public class CreateTable {

    static final String MYSQL_DB_NAME = "posting_w10_tv_reviews";
    static final String MYSQL_USER = "root";
    static final String MYSQL_PASSWORD = "develpass";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(("jdbc:mysql://localhost:3306/" + MYSQL_DB_NAME), MYSQL_USER, MYSQL_PASSWORD);

            Statement statement = connection.createStatement();

            String reviewersTable = "CREATE TABLE reviewers (\n" +
                    "id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,\n" +
                    "first_name VARCHAR(255),\n" +
                    "last_name VARCHAR(255)\n" +
                    ");";

            String seriesTable = "CREATE TABLE series (\n" +
                    "id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,\n" +
                    "title VARCHAR(255),\n" +
                    "released_year YEAR(4),\n" +
                    "genre VARCHAR(100)\n" +
                    ");";

            String reviewsTable = "CREATE TABLE reviews (\n" +
                    "id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,\n" +
                    "rating DECIMAL(2,1),\n" +
                    "series_id INT,\n" +
                    "reviewer_id INT,\n" +
                    "FOREIGN KEY (series_id) REFERENCES series(id),\n" +
                    "FOREIGN KEY (reviewer_id) REFERENCES reviewers(id)\n" +
                    ");";

            statement.execute(reviewersTable);
            statement.execute(seriesTable);
            statement.execute(reviewsTable);

            System.out.println("Tables created.");

            String starterSeries = "\n" +
                    "INSERT INTO series (title, released_year, genre) VALUES\n" +
                    "  ('Archer', 2009, 'Animation'),\n" +
                    "  ('Arrested Development', 2003, 'Comedy'),\n" +
                    "  (\"Bob's Burgers\", 2011, 'Animation'),\n" +
                    "  ('Bojack Horseman', 2014, 'Animation'),\n" +
                    "  (\"Breaking Bad\", 2008, 'Drama'),\n" +
                    "  ('Curb Your Enthusiasm', 2000, 'Comedy'),\n" +
                    "  (\"Fargo\", 2014, 'Drama'),\n" +
                    "  ('Freaks and Geeks', 1999, 'Comedy'),\n" +
                    "  ('General Hospital', 1963, 'Drama'),\n" +
                    "  ('Halt and Catch Fire', 2014, 'Drama'),\n" +
                    "  ('Malcolm In The Middle', 2000, 'Comedy'),\n" +
                    "  ('Pushing Daisies', 2007, 'Comedy'),\n" +
                    "  ('Seinfeld', 1989, 'Comedy'),\n" +
                    "  ('Stranger Things', 2016, 'Drama');\n";

            String starterReviewers = "INSERT INTO reviewers (first_name, last_name) VALUES\n" +
                    "  ('Thomas', 'Stoneman'),\n" +
                    "  ('Wyatt', 'Skaggs'),\n" +
                    "  ('Kimbra', 'Masters'),\n" +
                    "  ('Domingo', 'Cortes'),\n" +
                    "  ('Colt', 'Steele'),\n" +
                    "  ('Pinkie', 'Petit'),\n" +
                    "  ('Marlon', 'Crafford');";

            String starterReviews = "\n" +
                    "INSERT INTO reviews(series_id, reviewer_id, rating) VALUES\n" +
                    "  (1,1,8.0),(1,2,7.5),(1,3,8.5),(1,4,7.7),(1,5,8.9),\n" +
                    "  (2,1,8.1),(2,4,6.0),(2,3,8.0),(2,6,8.4),(2,5,9.9),\n" +
                    "  (3,1,7.0),(3,6,7.5),(3,4,8.0),(3,3,7.1),(3,5,8.0),\n" +
                    "  (4,1,7.5),(4,3,7.8),(4,4,8.3),(4,2,7.6),(4,5,8.5),\n" +
                    "  (5,1,9.5),(5,3,9.0),(5,4,9.1),(5,2,9.3),(5,5,9.9),\n" +
                    "  (6,2,6.5),(6,3,7.8),(6,4,8.8),(6,2,8.4),(6,5,9.1),\n" +
                    "  (7,2,9.1),(7,5,9.7),\n" +
                    "  (8,4,8.5),(8,2,7.8),(8,6,8.8),(8,5,9.3),\n" +
                    "  (9,2,5.5),(9,3,6.8),(9,4,5.8),(9,6,4.3),(9,5,4.5),\n" +
                    "  (10,5,9.9),\n" +
                    "  (13,3,8.0),(13,4,7.2),\n" +
                    "  (14,2,8.5),(14,3,8.9),(14,4,8.9);";

            statement.execute(starterSeries);
            statement.execute(starterReviewers);
            statement.execute(starterReviews);

            System.out.println("Starter data created.");

            connection.close();

        } catch(Exception e){
            System.out.println(e);
        }
    }
}
