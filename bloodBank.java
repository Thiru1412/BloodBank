package bloodbank;
import java.sql.*;
import java.util.*;

public class bloodBank {

	public static void main(String[] args) {
	try {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/bloodbank","root","Thirumalai_14");
		Statement st=con.createStatement();
		System.out.println("1.Donor Registration"+"\n"+"2.Search for Donor"+"\n"+"3.Blood Availability"+"\n"+"4.Set Threshold for Blood Groups"+"\n"+"5.Show Threshold Configuration");
		System.out.print("\nEnter Your Choice : ");
		int choice = sc.nextInt();
		Donor donor = new Donor();
		Threshold threshold = new Threshold();
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
		case 4:
			threshold.setThreshold();
			break;
		case 5:
			threshold.showConfiguration();
			break;
			
		}
	}
	catch(Exception e){
		System.out.println("Exception : "+e);
	}
	}
}
