package com.hybernet.VehicleRentalService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.hybernet.VehicleRentalService.entity.Bike;
import com.hybernet.VehicleRentalService.entity.Booking;
import com.hybernet.VehicleRentalService.entity.User;




/**
 * Hello world!
 *
 */
public class App 
{
	
	public static User userLogin(Session s,String userEmail,String userPassword)
	{
	
		
		
		
		Query<User> query=s.createQuery("from user_table where userEmail and userPassword",User.class);
		query.setParameter("userEmail", userEmail);
		query.setParameter("userPassword", userPassword);
		
		return query.uniqueResult();
		
		
		
		
	}
	
	public static void userSignin(Session s)
	{
		Scanner scr=new Scanner(System.in);
		
		 System.out.println("Enter your Email");
		 String userEmail=scr.nextLine();
		 System.out.println("Enter your Password");
		 String userPassword=scr.nextLine();
		 System.out.println("Enter your Name");
		 String userName =scr.nextLine();
		 System.out.println("Enter your Gender");
		 String userGender=scr.nextLine();
		 System.out.println("Enter your Phone Number");
		 String userPhoneno=scr.nextLine();
	
		
		User u1=new User(userEmail,userPassword,userName,userGender,userPhoneno);
		s.save(u1);  
		s.beginTransaction().commit();
		
		//System.out.println("New user Added");
		System.out.println("Welcome"+userName);
	}
	
	public static void getBike() throws SQLException
	{
		
		   String url = "jdbc:mysql://localhost:3306/vrs";
	        String user = "root";
	        String password = "1234";

	        
	        String sqlQuery = "SELECT * FROM bike_table";
		
		try (
	          
	            Connection connection = DriverManager.getConnection(url, user, password);
				PreparedStatement statement = connection.prepareStatement(sqlQuery);
				ResultSet resultSet = statement.executeQuery();
	        ) {
	            
	            while (resultSet.next()) {
	               
	                int bid = resultSet.getInt("bike_id");
	                String bname = resultSet.getString("bike_name");
	                String brNo=resultSet.getString("bike_registration_number");
	                String bcolor=resultSet.getString("bike_color");
	                System.out.println("ID: " + bid + ", Bike Name: " + bname+", Bike Registration Number: "+brNo+", Bike Color: "+bcolor);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	}
	
	public static void getCar() throws SQLException
	{
		
		    String url = "jdbc:mysql://localhost:3306/vrs";
	        String user = "root";
	        String password = "1234";

	        
	        String sqlQuery = "SELECT * FROM car_table";
		
		try (
	          
	            Connection connection = DriverManager.getConnection(url, user, password);
				PreparedStatement statement = connection.prepareStatement(sqlQuery);
				ResultSet resultSet = statement.executeQuery();
	        ) {
	            
	            while (resultSet.next()) {
	               
	                int cid = resultSet.getInt("car_id");
	                String cname = resultSet.getString("car_name");
	                String crNo = resultSet.getString("car_registration_number");
	                String ccolor = resultSet.getString("car_color");
	                String csno = resultSet.getString("car_Seat_no");
	                System.out.println("ID: " + cid + ", Car Name: " + cname+", Car_Registration_Number: "+crNo+", Car color: "+ccolor+", Car Seat Number: "+csno);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	}
	
	public static void booking()
	{
		Scanner scr=new Scanner(System.in);
		
		Configuration confg=new Configuration().configure().addAnnotatedClass(Booking.class);
    	SessionFactory ssff=confg.buildSessionFactory();
    	Session ss=ssff.openSession();
		
		System.out.println("Enter your Address");
		 String Address=scr.nextLine();
		 System.out.println("Enter your License No");
		 String LicenseNo=scr.nextLine();
		 System.out.println("Enter your Pickup Date");
		 String PickupDate =scr.nextLine();
		 System.out.println("Enter your Drop Date");
		 String DropDate=scr.nextLine();
		 
	
		
		Booking b1=new Booking(Address,LicenseNo,PickupDate,DropDate);
		ss.save(b1);  
		ss.beginTransaction().commit();
		
		//System.out.println("New user Added");
		System.out.println("Booking Succesful");
		
		
	}
	
	
    public static void main( String[] args ) throws SQLException
    {
        
        Configuration conf=new Configuration().configure().addAnnotatedClass(User.class);
    	SessionFactory ss=conf.buildSessionFactory();
    	Session s=ss.openSession();
    	
    	Scanner scr=new Scanner(System.in);
    	//System.out.println("Enter Your Data");
    	
    	System.out.println( "Welcome To Vehicle Rental Service" );
    	userSignin(s);
    	
    	System.out.println("Select Which Vehicle You Want to Rent \n 1=Bike\t2=Car");
    	System.out.println("Choose 1 or 2");
    	int choise=scr.nextInt();
    	
    	if(choise==1)
    	{
    		getBike();
    	}
    	else if(choise==2)
    	{
    		getCar();
    	}
    	else
    	{
    		System.out.println("Please select from 1 or 2");
    	}
    	
    	System.out.println("Enter further Details For Booking");
    	booking();
    	
    	
    	//User userLogin=userLogin(s, "bhagyashreeaware08@gmail.com",  "bhagu1234");
    	 //getBike(s);
    	 
    }

	
}
