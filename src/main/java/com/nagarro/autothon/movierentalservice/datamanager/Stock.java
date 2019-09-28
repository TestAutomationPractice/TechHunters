package com.nagarro.autothon.movierentalservice.datamanager;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.codoid.products.fillo.Connection;

public class Stock {
	
	public static Recordset getDataSet(String packagename,String testCaseName) throws FilloException
	{
	
	Fillo fillo=new Fillo();
	
   String filepath=System.getProperty("user.dir")+"\\"+"DataFiles"+"\\"+"INT_AppData.xlsx";
	
	Connection connection= fillo.getConnection(filepath);
	
	
	String strQuery="Select * from "+packagename+" where TestCaseName='"+testCaseName+"'";
	
	System.out.println("Printing data reading query "+strQuery);
	
	Recordset recordset=connection.executeQuery(strQuery);
	
	
	
	return recordset;
	
	
		
	}
	
	
	
	public static  String getParametreValue(Recordset dataset,String parametre) throws FilloException
	{
		
		while(dataset.next()){}
		
		
		return dataset.getField(parametre);
		
		
		
	
		
	}
	
	public static String getparamValue(Recordset dataset,String param) throws FilloException
	{
while(dataset.next()){}
		
		
		return dataset.getField(param);
		
	
	
}
}





