package core;

import core.Entities.Droits;
import core.Entities.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.sql.PreparedStatement;
import java.sql.Statement;

import core.JsonManager;
import core.Configuration;

public class Main {


	public static void main (String arg[]) {

		Droits write = new Droits(1, 1, "write", "Orange");
		Droits read = new Droits(1, 0, "read", "Orange");
		Droits move = new Droits(1, 1, "move", "Orange");
		
		ArrayList<Droits> totoDroit = new ArrayList();
		totoDroit.add(write);
		totoDroit.add(read);
		
		ArrayList<Droits> tataDroit = new ArrayList();
		tataDroit.add(read);
		tataDroit.add(move);
		
		User toto = new User("Toto", "Jean", "totoJ", "jeanT", totoDroit);
		User tata = new User("Tata", "Camille", "tataC", "CamilleT", tataDroit);
		

		Connection connect = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
		Configuration configuration = new Configuration();
		JsonManager jsonManager = JsonManager.getInstance();
		//ArrayList<String> result = jsonManager.readFromFile("conf.prog", "../../", result);

		String url = "jdbc:mysql://localhost:3306/TPGit";
		String username = "tpgit";
		String password = "pwd";
		
		System.out.println("Connecting database ...");
		
		try(Connection connection = (Connection) DriverManager.getConnection(url, username, password))
		{
			System.out.println("Database connected");
		}catch(SQLException e)
		{
			throw new IllegalStateException("Cannot connect to database", e);
		}
		
		try
		{
			preparedStatement = connect
	                .prepareStatement("SELECT * from User");
			resultSet = preparedStatement.executeQuery();
			
			writeMetaData(resultSet);
		}catch(Exception e)
		{
			
		}

		
		
	}
		
		

}