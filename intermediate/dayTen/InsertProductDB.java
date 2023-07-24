package intermediate.dayTen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertProductDB {

    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:./intermediate/dayTen/productsDB";

    // Database credentials
    static final String USER = "sa";
    static final String PASS = "";

    public boolean insertDatabase() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        // Statement stmt = null;

        // STEP 1: Register JDBC driver
        Class.forName(JDBC_DRIVER);

        // STEP 2: Open a connection
        System.out.println("Connecting to database...");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        // try with resources....
        try (Statement stmt = conn.createStatement();) {
            // STEP 3: Execute a query
            System.out.println("Creating table in given database...");
            // stmt = conn.createStatement();
            String sql = "INSERT INTO Products VALUES (1,'refrigerator', 'SAMSUNG 2-door Stainless Steel Refrigerator', 'Add a functional yet appealing touch to your kitchen space with the SAMSUNG French door refrigerator with ice dispenser.', 8000.00, 10)";
            int rowcount = stmt.executeUpdate(sql);
            System.out.printf("Success - %d - rows affected.\n", rowcount);

            sql = "INSERT INTO PRODUCTS " +
                    "VALUES (2, 'stove', 'Frigidaire FFEF3054TS 30 Freestanding Electric Range - Stainless Steel','Cook up a great meal with the Frigidaire 30 freestanding electric range. ', 7000.00, 20)";
            rowcount = stmt.executeUpdate(sql);
            System.out.printf("Success - %d - rows affected.\n", rowcount);

            sql = "INSERT INTO PRODUCTS " +
                    "VALUES (3, 'vacuum cleaner','Kenmore BC4027 UltraPlush Bagged Canister Vacuum Cleaner','Ultra-plush cleaning system provides exceptional clean on dense carpets.',5000.00,12)";
            rowcount = stmt.executeUpdate(sql);
            System.out.printf("Success - %d - rows affected.\n", rowcount);

            sql = "INSERT INTO PRODUCTS " +
                    "VALUES (4, 'refrigerator','Haier HRB15N3BGS 15 Cu. Ft. Bottom-Freezer Refrigerator - Stainless Steel',' Perfect for giving your foods the right environment, this refrigerator comes with Quick Cool and Quick Freeze to make sure your newly stored foods get cold fast',4999.99,6)";
            rowcount = stmt.executeUpdate(sql);
            System.out.printf("Success - %d - rows affected.\n", rowcount);

            sql = "INSERT INTO PRODUCTS " +
                    "VALUES (5, 'stove','Broan 283003 30\" Range Hood - Stainless','The space-saving design of this range hood lets you make the most of your precious under-the-counter cabinet space while the sleek trim complements any cooktop style or color',999.99,9)";
            rowcount = stmt.executeUpdate(sql);
            System.out.printf("Success - %d - rows affected.\n", rowcount);

            sql = "INSERT INTO PRODUCTS " +
                    "VALUES (6, 'smart TV','Samsung QN43LS03BAFXZA QN43LS03B 43\" Class LS03B The Frame Smart TV','Binge watch HD movies with the Samsung 43\" Class LS03B The Frame Smart TV.',799.99,9)";
            rowcount = stmt.executeUpdate(sql);
            System.out.printf("Success - %d - rows affected.\n", rowcount);

            sql = "INSERT INTO PRODUCTS " +
                    "VALUES (7, 'smart TV','Sony XR65A80L 65 Inch BRAVIA XR A80L 4K OLED Smart TV','All Your Game Settings in One Place ',799.99,9)";
            rowcount = stmt.executeUpdate(sql);
            System.out.printf("Success - %d - rows affected.\n", rowcount);

            sql = "INSERT INTO PRODUCTS " +
                    "VALUES (8, 'games','Sony PlayStation 5 Console With Spiderman Miles Morales Game And Accessories Kit','Explore uncharted virtual territories and slay dragons with this sleek Sony PlayStation 5 gaming console',799.99,9)";
            rowcount = stmt.executeUpdate(sql);
            System.out.printf("Success - %d - rows affected.\n", rowcount);

            sql = "INSERT INTO PRODUCTS " +
                    "VALUES (9, 'games','Microsoft Xbox Series X 1TB Console With Madden 21 Game And Accessories Kit','Get total control on your favorite game with the Microsoft Xbox Series X',799.99,9)";
            rowcount = stmt.executeUpdate(sql);
            System.out.printf("Success - %d - rows affected.\n", rowcount);

            sql = "INSERT INTO PRODUCTS " +
                    "VALUES (10, 'computers','Apple 13.3\" MacBook Pro With M1 8-Core Processor - Space Gray','This portable device is powered by Apple M1 8-Core processor and is loaded with features that enable you to manage your photos, videos and other data systematically and keep your device clutter free',1999.99,9)";
            rowcount = stmt.executeUpdate(sql);
            System.out.printf("Success - %d - rows affected.\n", rowcount);




            System.out.println(sql + "Data inserted in given database...");

            // STEP 4: Clean-up environment
            // stmt.close();
            // conn.close();
            return true;
        } catch (Exception se) {
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
 * CREATE TABLE Products (id INTEGER AUTO_INCREMENT not NULL, product_name
 * VARCHAR(255), product_description VARCHAR(255),price DECIMAL(6,2), quantity
 * INTEGER);
 * select * from products;
 * INSERT INTO PRODUCTS VALUES (1, 'SAMSUNG 2-door Stainless Steel
 * Refrigerator', 'Add a functional yet appealing touch to your kitchen space
 * with the SAMSUNG French door refrigerator with ice dispenser. Supported by
 * functions like Power Freeze, Surround Air and much more, this home appliance
 * is versatile and user-friendly. ', 8000.00, 10);
 */
