/*
 * Duy Duong Le (Harry)
 * Email: duonglevancouver@gmail.com
 * Linkedin: linkedin.com/in/duy-duong-le-274612184/
 * Github: github.com/duyduongle
 * Date of Completion: February 07, 2024
 * */
package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
	
	//This method will read data from a CSV file and return as a list
	public static List<String[]> read(String file) {
		List<String[]> data = new LinkedList<String[]>();
		String dataRow;
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			System.out.println("COULD NOT FIND FILE");
			e.printStackTrace();
		}
		try {
			while ((dataRow = br.readLine()) != null) {
			       String[] dataRecords = dataRow.split(",");
			       data.add(dataRecords);
			}
		} catch (IOException e) {
			System.out.println("COULD NOT READ FILE");
			e.printStackTrace();
		}
		
		return data;
	}

}
