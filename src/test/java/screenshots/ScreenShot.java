package screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import base_class.DriverSetup;

public class ScreenShot extends DriverSetup {

	public static String baseUrl = "https://www.coursera.org/";

	@Test
	public void TakeScreenshot() throws IOException {

		driver.get(baseUrl);

		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//screenshot/image.png"));
	}

}
