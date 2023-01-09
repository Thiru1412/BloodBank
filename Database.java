package bloodbank;
import java.util.*;
import java.sql.*;

public abstract class Database{
	
	String query ="";
	public abstract void insertData() throws Exception;
	public abstract void displayData() throws Exception;
	public abstract void displayAvailability() throws Exception;

}
