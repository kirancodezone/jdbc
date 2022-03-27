package whatsapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WhatsappTester {

	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = DriverManager.getConnection("jdbc:mysql:///xworkz", "root", "root");
		Statement st = con.createStatement();
		String query = "insert into student values(103,'appu','65948756')";
		int execute = st.executeUpdate(query);
		System.out.println("values inserted : " + execute);
		// ResultSet executeQuery = st.executeQuery(query);
//		while (executeQuery.next()) {
//			System.out.print(
//					executeQuery.getString(1) + " " + executeQuery.getString(2) + " " + executeQuery.getString(3));
//		}

		st.close();
		con.close();

	}

}
