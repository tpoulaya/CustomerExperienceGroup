package testrunner;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.PageSetup;
import com.pages.PageVerification;

public class TestRunner {
	
	
	@BeforeClass
	public void launchApp() {
		new PageSetup().setUpApplication();
	}
	
	@Test(priority=0)
	public void pageSetup() {
		new PageVerification().PageStatus().menuLinks();
	}
	
	@Test(priority=1)
	public void navigateToContactPage() throws Exception {
		new PageSetup()
		.naviagteToContactPage()
		.validateContactUs();
	}
}
