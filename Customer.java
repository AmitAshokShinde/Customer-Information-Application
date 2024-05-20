// in this their are sql driver which connect to the sql table to add form data in the sql table
package appcode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;

public class Customer {

	public int insertOpr(String custname, String custaddr, String custmobno, String custemail) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "root");

			java.sql.Statement stmt = con.createStatement();

//			ResultSet rs = stmt.executeQuery("select * from custtable");
			String query="insert into custtable values('"+custname+"','"+ custaddr+"','"+ custmobno+"','"+custemail+"')";

			System.out.println("Insert Query is: "+query);
			
			stmt.executeUpdate(query);

		} catch (Exception e) {
			System.out.println(e); 
		}
		return 0;

	}

	public ResultSet searchOpr(String name) {
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "root");

			java.sql.Statement stmt = con.createStatement();

			rs = stmt.executeQuery("select * from custtable where custname='" + name + "'");

		} catch (Exception e) {
			System.out.println(e);
		}

		return rs;
	}

}