package dao;

//cntl+shift+o
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioDAO {

	final String DB_URL = "jdbc:mysql://localhost/Pokedex";
	final String USER = "Irene"; // Nombre de usuario que se crea en users and privileges
	final String PASS = "irene";

	public void Consulta() {
		final String QUERY = "SELECT usersname, password from users";

		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(QUERY);) {
			while (rs.next()) {
				// Display values
				System.out.println("Username: " + rs.getString("usersname"));
				System.out.println(", Password: " + rs.getString("password"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean login(String usersname, String password) {
		final String QUERY = "SELECT usersname, password from users where "
				+ "usersname = '" + usersname + "' and "
				+ "password = '" + password + "'";

		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(QUERY);) {
				return rs.next();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}