import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateSheet {

	public static void main(String[] args) throws Exception {
	
		
		
		
		
		XSSFWorkbook workbook = new XSSFWorkbook();//craeet an objcet of workbook
	try {
		FileOutputStream out = new FileOutputStream(new File("C:\\Users\\IBM_ADMIN\\Documents\\New2.xlsx"));
		//workbook.createSheet("Nusrath ahmed");
		workbook.write(out);
		out.close();
		workbook.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("New file created");
	

	}

}
