import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao {
	Connection con = null;
	Statement stmt = null;
	
	public Dao() throws ClassNotFoundException {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/Registration","root","root");
			stmt = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		return this.con;
	}
	
	public Statement getStatement()
	{
		return this.stmt;
	}
	
	public ResultSet getInfo() throws SQLException {
		String query = "select * from userinfo";
		ResultSet rs = stmt.executeQuery(query);
		return rs;
	}
	
	public void setInfo(String name, String username, String passwd, String mobNo) throws SQLException {
		String query = "INSERT INTO userinfo values('"+name+"','"+username+"','"+passwd+"','"+mobNo+"')";
		stmt.executeQuery(query);
	}
}
