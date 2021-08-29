package Utilities;
import java.io.File;
import java.io.IOException;
//import java.lang.reflect.Method;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import base.BaseUrl;


public class TestUtil extends BaseUrl {

	public static String screenshotPath;
	public static String screenshotName;

	public static void captureScreenshot() throws IOException {

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Date d = new Date();
		screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
 
		//Create Screenshot in Target folder
	//FileUtils.copyFile(scrFile,
	//new File(System.getProperty("user.dir") + "\\target\\surefire-reports\\html\\" + screenshotName));

		//Create Screenshot in test-output folder
		FileUtils.copyFile(scrFile,
				new File(System.getProperty("user.dir") + "\\test-output\\html\\" + screenshotName));
		
	}

}