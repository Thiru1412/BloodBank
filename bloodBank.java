package bloodbank;
import java.sql.*;
import java.util.*;

public class bloodBank {

	public static void main(String[] args) {
	try {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		Statement st=con.createStatement();
		System.out.println("1.Donor Registration"+"\n"+"2.Search for Donor"+"\n"+"3.Blood Availability");
		System.out.print("Enter Your Choice : ");
		int choice = sc.nextInt(); // getting choice
		Donor donor = new Donor(); // creating an object for class Donor 
		switch(choice) {
		case 1:
			donor.getDetails();
			donor.insertData();
			break;
		case 2:
			donor.displayData();
			break;
		case 3:
			donor.displayAvailability();
			break;
		
		}
	}
	catch(Exception e){
		System.out.println("Exception : "+e);
	}
	}

}
