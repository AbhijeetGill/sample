package DataProvider;

import java.util.ArrayList;

import com.excel.utility.Excel_util;

public class Fetch {

	public static ArrayList<Object[]> data() {		
		ArrayList<Object[]> mylist=new ArrayList<Object[]>();
		Excel_util reader=new Excel_util("D:\\Abhijeet\\testdata.xlsx");
		int row=reader.getRowCount("Sheet1");
		for(int i=2;i<=row;i++)
		{
			String name=reader.getCellData("Sheet1","username",i);
			String pwd=reader.getCellData("Sheet1","password",i);
			Object ob[]= {name,pwd};
			mylist.add(ob);
			
			
			
			
			
		}
		
		
		
		
		return mylist;
		
		
		
		

	}

}
