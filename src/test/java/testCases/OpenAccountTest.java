package testCases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import base.BaseTest;
import utilities.Constants;
import utilities.DataProviders;
import utilities.DataUtil;
import utilities.ExcelReader;

public class OpenAccountTest extends BaseTest {

	@Test(dataProviderClass = DataProviders.class, dataProvider = "bankManagerDp")

	public void openAccountTest(Hashtable<String, String> data) {
		
		ExcelReader excel = new ExcelReader(Constants.SUITE1_XL_PATH);

		DataUtil.checkExecution("BankManagerSuite", "OpenAccountTest", data.get("Runmode"), excel);
		
		System.out.println("Test");

		browser = getBrowser(data.get("browser"));

		navigate(browser, Constants.URL);

		click("bmBtn_CSS");
		
		click("openAccountNav_XPATH");
		
		select("customerSelect_CSS", data.get("customer"));
		
		select("currencySelect_CSS", data.get("currency"));
		
		click("processBtn_CSS");

	}

}
