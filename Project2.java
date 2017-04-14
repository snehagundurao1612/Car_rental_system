package DBPRO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Project2 {
	static BufferedReader br = null;
	static BufferedReader br1 = null;
	static BufferedReader br2 = null;
	static BufferedReader br3 = null;
	static BufferedReader br4 = null;
	static BufferedReader br5 = null;
	static BufferedReader br6 = null;
	static BufferedReader br7 = null;
	static BufferedReader br8 = null;
	static PreparedStatement stmt = null;

	public static Connection startConnection() throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proj2", "root",
				"sneVVS222$");
		return connection;

	}

	public static void insertTable1() throws IOException, SQLException, ClassNotFoundException {

		Connection conn;
		conn = startConnection();
		String query = "";
		String line = "";
		br = new BufferedReader(new FileReader("D:\\Databases\\Input_Data\\Customer.csv"));

		while ((line = br.readLine()) != null) {
			query = "INSERT INTO CUSTOMER VALUES(" + line + ");";

			stmt = (PreparedStatement) conn.prepareStatement(query);
			stmt.executeUpdate(query);
		}
	}

	public static void insertTable2() throws IOException, SQLException, ClassNotFoundException {
		Connection conn;
		conn = startConnection();
		String query = "";
		String line = "";
		br1 = new BufferedReader(new FileReader("D:\\Databases\\Input_Data\\car_1.csv"));
		while ((line = br1.readLine()) != null) {

			query = "INSERT INTO CAR VALUES(" + line + ");";

			stmt = (PreparedStatement) conn.prepareStatement(query);
			stmt.executeUpdate(query);
		}
	}

	public static void insertTable3() throws IOException, SQLException, ClassNotFoundException {
		Connection conn;
		conn = startConnection();
		String query = "";
		String line = "";
		br2 = new BufferedReader(new FileReader("D:\\Databases\\Input_Data\\Rentals.csv"));
		while ((line = br2.readLine()) != null) {

			query = "INSERT INTO RENTALS VALUES(" + line + ");";
			stmt = (PreparedStatement) conn.prepareStatement(query);
			stmt.executeUpdate(query);
		}
	}

	public static void insertTable4() throws IOException, SQLException, ClassNotFoundException {
		Connection conn;
		conn = startConnection();
		String query = "";
		String line = "";
		br3 = new BufferedReader(new FileReader("D:\\Databases\\Input_Data\\owner.csv"));
		while ((line = br3.readLine()) != null) {
			query = "INSERT INTO OWNER VALUES(" + line + ");";
			stmt = (PreparedStatement) conn.prepareStatement(query);
			stmt.executeUpdate(query);
		}
	}

	public static void insertTable5() throws IOException, SQLException, ClassNotFoundException {
		Connection conn;
		conn = startConnection();
		String query = "";
		String line = "";
		br4 = new BufferedReader(new FileReader("D:\\Databases\\Input_Data\\Daily_rental.csv"));
		while ((line = br4.readLine()) != null) {
			query = "INSERT INTO DAILY_RENTAL VALUES(" + line + ");";
			//System.out.println(query);
			stmt = (PreparedStatement) conn.prepareStatement(query);
			stmt.executeUpdate(query);
		}
	}

	public static void insertTable6() throws IOException, SQLException, ClassNotFoundException {
		Connection conn;
		conn = startConnection();
		String query = "";
		String line = "";
		br5 = new BufferedReader(new FileReader("D:\\Databases\\Input_Data\\Weekly_rental.csv"));
		while ((line = br5.readLine()) != null) {
			query = "INSERT INTO WEEKLY_RENTAL VALUES(" + line + ");";
			stmt = (PreparedStatement) conn.prepareStatement(query);
			stmt.executeUpdate(query);
		}
	}

	public static void insertTable7() throws IOException, SQLException, ClassNotFoundException {
		Connection conn;
		conn = startConnection();
		String query = "";
		String line = "";
		br6 = new BufferedReader(new FileReader("D:\\Databases\\Input_Data\\Rental_company.csv"));
		while ((line = br6.readLine()) != null) {
			query = "INSERT INTO RENTAL_COMPANY VALUES(" + line + ");";
			stmt = (PreparedStatement) conn.prepareStatement(query);
			stmt.executeUpdate(query);
		}
	}

	public static void insertTable8() throws IOException, SQLException, ClassNotFoundException {
		Connection conn;
		conn = startConnection();
		String query = "";
		String line = "";
		br7 = new BufferedReader(new FileReader("D:\\Databases\\Input_Data\\Bank.csv"));
		while ((line = br7.readLine()) != null) {
			query = "INSERT INTO BANK VALUES(" + line + ");";
			stmt = (PreparedStatement) conn.prepareStatement(query);
			stmt.executeUpdate(query);
		}
	}

	public static void insertTable9() throws IOException, SQLException, ClassNotFoundException {
		Connection conn;
		conn = startConnection();
		String query = "";
		String line = "";
		br8 = new BufferedReader(new FileReader("D:\\Databases\\Input_Data\\Individual.csv"));
		while ((line = br8.readLine()) != null) {
			query = "INSERT INTO INDIVIDUAL VALUES(" + line + ");";
			stmt = (PreparedStatement) conn.prepareStatement(query);
			stmt.executeUpdate(query);
		}
	}

	public static void main(String arg[]) {

		try {
			insertTable1();
			insertTable2();
			insertTable3();
			insertTable4();
			insertTable5();
			insertTable6();
			insertTable7();
			insertTable8();
			insertTable9();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
