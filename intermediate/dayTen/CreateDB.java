package intermediate.dayTen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB {

    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:./intermediate/dayTen/productsDB";

    // Database credentials
    static final String USER = "sa";
    static final String PASS = "";

    public boolean createDatabase() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        //Statement stmt = null;
        
            // STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // STEP 2: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            //try with resources....
            try (Statement stmt=conn.createStatement();) {
            // STEP 3: Execute a query
            System.out.println("Creating table in given database...");
            //stmt = conn.createStatement();
            String sql = "CREATE TABLE Products " +
                    "( id INTEGER AUTO_INCREMENT not NULL, " +
                    " product_name VARCHAR(255), " +
                    " product_description VARCHAR(255), " +
                    " price DECIMAL(6,2), " +
                    " quantity INTEGER, " +
                    " PRIMARY KEY (id) )";

            int rowcount = stmt.executeUpdate(sql);
            System.out.println();
            System.out.printf("Success - %d - rows affected.\n", rowcount);

            System.out.println(sql + "Created table in given database...");

            // STEP 4: Clean-up environment
            // stmt.close();
            // conn.close();
            return true;
        } catch (Exception  se) {
            // Handle errors for JDBC
            System.out.println("An error has occurred.");
            System.out.println("See full details below.");
            se.printStackTrace();
            return false;
        } 
    }
}

/**
 * DROP TABLE IF EXISTS Products;
CREATE TABLE Products (id INTEGER AUTO_INCREMENT not NULL, product_name VARCHAR(255),  product_description VARCHAR(255),price DECIMAL(6,2), quantity INTEGER);
select * from products;
INSERT INTO PRODUCTS  VALUES (1, 'SAMSUNG 2-door Stainless Steel Refrigerator', 'Add a functional yet appealing touch to your kitchen space with the SAMSUNG French door refrigerator with ice dispenser. Supported by functions like Power Freeze, Surround Air and much more, this home appliance is versatile and user-friendly. ', 8000.00, 10);
 */

