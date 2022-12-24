package mysqldemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/* 1.CREATE CONNECTION
 * 2.CREATE STATEMENT
 * 3.EXECUTE STATEMENT
 * 4.STORE DATA IN RESULT SET
 * 5.CLOSE CONEECTION
 */
public class MySqlSelectCommands {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//1.CREATE CONNECTION 
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		//2. Create statement/query
		  Statement stmt=con.createStatement();
		  //String s="INSERT INTO STUDENT VALUES(106,'SMITH',70)";
		  //String s="update student set sname='david' where sno =103";
		  String s="select sno,sname,marks from student";
		//3. execute statement  4. STORE RESULT SET DATA
		  ResultSet rs=stmt.executeQuery(s);
		  while (rs.next())
		  {int no=rs.getInt("sno");
		  String name=rs.getString("sname");
		  int point=rs.getInt("marks");
		  System.out.println(no+" "+name+" "+point);
		  }
		//5. close connection
		  con.close();
		//6. CONFIRMATION THAT IT EXECUTED
		  System.out.println("query executed"); 
	}

}
