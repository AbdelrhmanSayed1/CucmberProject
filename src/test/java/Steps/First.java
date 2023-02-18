package Steps;
import com.applitools.eyes.*;
import com.applitools.eyes.selenium.ClassicRunner;
import com.applitools.eyes.selenium.Eyes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class First {
private static EyesRunner runner;
private static Eyes eyes;
private static BatchInfo batch;
private static WebDriver driver;
@BeforeTest
public static void setBatch(){
batch = new BatchInfo("Login test with AI");
runner = new ClassicRunner();
eyes = new Eyes(runner);
eyes.setApiKey(System.getenv("APPLITOOLS_API_KEY)"));
eyes.setBatch(batch);
driver = new ChromeDriver();
}

@Test
public void loginTest(){

    driver.get("http")

}
}