/**
 * 
 */
package com.bonc.zw.client;

import java.io.IOException;
import java.sql.SQLException;

import com.bonc.zw.excel.SaveData2DB;


/**
 * @author Hongten
 * @created 2014-5-18
 */
public class Client {

	public static void main(String[] args) throws IOException, SQLException {
		SaveData2DB saveData2DB = new SaveData2DB();
		saveData2DB.save();
		System.out.println("end");
	}
}
