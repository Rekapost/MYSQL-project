package mysqldemos;

import java.sql.Connection;     // Package from java.sql
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/* CREATE CONNECTION
 * CREATE STATEMENT
 * EXECUTE STATEMENT
 * CLOSE CONEECTION
 */
public class MySqlCommands {

	public static void main(String[] args) throws SQLException
	{
		// TODO Auto-generated method stub
		//1.CREATE CONNECTION 
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		//2. Create statement/query
		  Statement stmt=con.createStatement();
		  //String s="INSERT INTO STUDENT VALUES(106,'SMITH',70)";
		  //String s="update student set sname='david' where sno =103";
		  String s="delete from student where sno=103";
		//3. execute statement
		  stmt.execute(s);
		//4. close connection
		  con.close();
		//5. CONFIRMATION THAT IT EXECUTED
		  System.out.println("query executed");
		  

	}

}
