package testCases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import base.BaseTest;
import utilities.Constants;
import utilities.DataProviders;
import utilities.DataUtil;
import utilities.ExcelReader;

public class AddCustomerTest extends BaseTest {

	@Test(dataProviderClass = DataProviders.class, dataProvider = "bankManagerDp")
	public void addCustomerTest(Hashtable<String, String> data) {

		ExcelReader excel = new ExcelReader(Constants.SUITE1_XL_PATH);

		DataUtil.checkExecution("BankManagerSuite", "AddCustomerTest", data.get("Runmode"), excel);
		
		System.out.println("Test");

		browser = getBrowser(data.get("browser"));
		
		navigate(browser, Constants.URL);

		click("bmBtn_CSS");

		click("addCustBtn_XPATH");

		type("firstName_CSS", data.get("firstname"));

		type("lastName_CSS", data.get("lastname"));

		type("postCode_CSS", data.get("postcode"));

		click("submitCustBtn_CSS");

	}

}
