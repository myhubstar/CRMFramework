package testscript;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExecuteLeadTest
{

	public static void main(String[] args)throws Exception {
		
	
	
		ArrayList data=new ArrayList();
		Keywords key=new Keywords();
		FileInputStream f=new FileInputStream("E://LeadSuite.xlsx");//goto Excel Application
		XSSFWorkbook  wbks=new XSSFWorkbook(f);//goto workbook reference
		Sheet s=wbks.getSheet("Sheet1");//goto particular sheet
		
		
		Iterator itr =  s.iterator();//for goto particular row and coloum..it create horizontal iterator  ->
	while(itr.hasNext())//to check in next row data is present or not
		{
		Row rowitr= (Row)itr.next();
		Iterator cellitr=rowitr.cellIterator();
		while(cellitr.hasNext())
		{
			Cell celldata=(Cell)cellitr.next();
	    switch(celldata.getCellType())
		{
		case STRING:
			data.add(celldata.getStringCellValue());
			break;
		case NUMERIC:
			data.add(celldata.getNumericCellValue());
			break;
		case BOOLEAN:
			data.add(celldata.getBooleanCellValue());
			break;
			
		}
	}
}
	for(int i=0;i<data.size();i++)
	{
	if(data.get(i).equals("openbrowser"))
	{
		String keyword=(String)data.get(i);
		String inputvalue=(String)data.get(i+1);
		String objectName=(String)data.get(i+2);
		String runmode=(String)data.get(i+3);
		System.out.println(keyword);
		System.out.println(inputvalue);
		System.out.println(objectName);
		System.out.println(runmode);
		if(runmode.equals("yes"))
		{
			key.openbrowser();
		}
	}
	
	if(data.get(i).equals("navigate"))
	{
		String keyword=(String)data.get(i);
		String inputvalue=(String)data.get(i+1);
		String objectName=(String)data.get(i+2);
		String runmode=(String)data.get(i+3);
		System.out.println(keyword);
		System.out.println(inputvalue);
		System.out.println(objectName);
		System.out.println(runmode);
		if(runmode.equals("yes"))
		{
			key.navigate(inputvalue);
		}
	}
	if(data.get(i).equals("login"))
	{
		String keyword=(String)data.get(i);
		String inputvalue=(String)data.get(i+1);
		String objectName=(String)data.get(i+2);
		String runmode=(String)data.get(i+3);
		System.out.println(keyword);
		System.out.println(inputvalue);
		System.out.println(objectName);
		System.out.println(runmode);
		if(runmode.equals("yes"))
		{
			key.login(objectName);
		}                    

	}

	if(data.get(i).equals("input"))
	{
		String keyword=(String)data.get(i);
		String inputvalue=(String)data.get(i+1);
		String objectName=(String)data.get(i+2);
		String runmode=(String)data.get(i+3);
		System.out.println(keyword);
		System.out.println(inputvalue);
		System.out.println(objectName);
		System.out.println(runmode);
		if(runmode.equals("yes"))
		{
			key.input(inputvalue,objectName);
		}                    //http://login.saleforce.com

	}
	if(data.get(i).equals("click"))
	{
		String keyword=(String)data.get(i);
		String inputvalue=(String)data.get(i+1);
		String objectName=(String)data.get(i+2);
		String runmode=(String)data.get(i+3);
		System.out.println(keyword);
		System.out.println(inputvalue);
		System.out.println(objectName);
		System.out.println(runmode);
		if(runmode.equals("yes"))
		{
			key.click(objectName);
		}                  

	}
	
	}
	}
}

