package DriverFactory;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import CommonFunctions.FunctionLibrary;
import Constant.PBConstant;
import Utilities.ExcelFileUtil;

public class DriverScript extends PBConstant {
	String inputpath = "D:\\Automation_Selenium\\Automation_Frameworks\\TestInput\\HybridTestS.xlsx";
	String outputpath = "D:\\Automation_Selenium\\Automation_Frameworks\\TestOutput\\HybridResults.xlsx";
	String TCSheet = "TestCases";
	String TSSheet = "TestSteps";
	ExtentReports report;
	ExtentTest test;
@Test
public void startTest()throws Throwable
{
	boolean res = false;
	String tcres="";
	//create reference object
	ExcelFileUtil xl = new ExcelFileUtil(inputpath);
	//count no of rows in in TCSheet TCsheet
	int TCCount = xl.rowCount(TCSheet);
	int TSCount = xl.rowCount(TSSheet);
	//iterate all rows in TCSheet
	for(int i=1;i<=TCCount;i++)
	{
		//store all module name into TCModule
		String TCModule = xl.getCellData(TCSheet, i, 1);
		//define path for html
		report= new ExtentReports("./Reports"+TCModule+FunctionLibrary.generateDate()+".html");
		test = report.startTest(TCModule);
		//read excecution mode cell
		String excecutionmode = xl.getCellData(TCSheet, i, 2);
		if(excecutionmode.equalsIgnoreCase("Y"))
		{
			//read tcid cell tcsheet
			String tcid = xl.getCellData(TSSheet, i, 0);
			//iterate all the rows in TSSheet
			for(int j=1;j<=TSCount;j++)
			{
				//read description cell
				String Description =xl.getCellData(TSSheet, j, 2);
				//read tcid from tssheet
				String tsid = xl.getCellData(TSSheet, j, 0);
				if(tcid.equalsIgnoreCase(tsid))
				{
					//read keyword cell
					String keyword =xl.getCellData(TSSheet, j, 4);
					if(keyword.equalsIgnoreCase("AdminLogin"))
					{
						String username =xl.getCellData(TSSheet, j, 5);
						String password =xl.getCellData(TSSheet, j, 6);
						res=FunctionLibrary.verifyLogin(username, password);
						test.log(LogStatus.INFO, Description);
					}
					else if(keyword.equalsIgnoreCase("NewBranchCreation"))
					{
						String bname =xl.getCellData(TSSheet, j, 5);
						String address1 =xl.getCellData(TSSheet, j, 6);
						String address2 =xl.getCellData(TSSheet, j, 7);
						String address3 =xl.getCellData(TSSheet, j, 8);
						String area =xl.getCellData(TSSheet, j, 9);
			            String zip =xl.getCellData(TSSheet, j, 10);
						String country=xl.getCellData(TSSheet, j, 11);
						String state =xl.getCellData(TSSheet, j, 12);
						String city =xl.getCellData(TSSheet, j, 13);
						FunctionLibrary.clickBranches();
						res=FunctionLibrary.verifyNewBranch(bname, address1, address2, address3, area, zip, country, state, city);
						test.log(LogStatus.INFO, Description);
					}
					else if(keyword.equalsIgnoreCase("UpdateBranch"))
					{
						String branchname =xl.getCellData(TSSheet, j, 5);
						String address =xl.getCellData(TSSheet, j, 6);
						String zipcode =xl.getCellData(TSSheet, j, 10);
						FunctionLibrary.clickBranches();
						res=FunctionLibrary.verifyBanchUpdate(branchname, address, zipcode);
						test.log(LogStatus.INFO, Description);
					}
					else if(keyword.equalsIgnoreCase("AdminLogout"))
					{
						res=FunctionLibrary.verifyLogout();
						test.log(LogStatus.INFO, Description);
					}
					//res is holding true or false
					String tsres ="";
					if(res)
					{
						
						//write as pass into status  cell in tssheet
						tsres ="Pass";
						xl.setCellData(TSSheet, j, 3, tsres, outputpath);	
						test.log(LogStatus.PASS, Description);
					}
					else
					{
						
						//write as fail into status cell in tssheet
						tsres = "Fail";
						xl.setCellData(TSSheet, j, 3, tsres, outputpath);
						test.log(LogStatus.FAIL, Description);
					}
					tcres=tsres;	
				}
				report.endTest(test);
				report.flush();
			}
			//write as tcres into tcsheet
			xl.setCellData(TCSheet, i, 3, tcres, outputpath);
		
		}
		else
		{
			//write as blocked into TCSheet under status cell
			xl.setCellData(TCSheet, i, 3, "Blocked", outputpath);
		}
	}
	
}
	

}
