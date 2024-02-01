package com.mongle.main;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.mongle.database.DataBase;
import com.mongle.service.AttendanceCheck;
import com.mongle.service.invest.Stock;
import com.mongle.yourapp.LogIn;
import com.mongle.yourapp.SignUp;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		DataBase.dataLoad();
		DataBase.loadPrivateUsers(LogIn.primaryKey);
		//LogIn.LogIn();
		//MainMenu.MainMenu();
		//SignUp.signUp();
		
		//Stock.stockService();
		//AttendanceCheck.attendanceCheckService();
		
		
		
		
		
		
		
		
		
	}//main
}
