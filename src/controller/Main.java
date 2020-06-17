package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws ClassNotFoundException, SQLException, IOException {
		ConnectionManager con=new ConnectionManager();
//	Connection con=null;
//		con=ConnectionManager.getConnection();
//	con =cn.getConnection();
		if(con!=null)
		{
			System.out.println("Connection establised");
		}
		else
		{
			System.out.println("Check your connection");
		}
		
	}
}
