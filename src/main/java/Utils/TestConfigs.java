package Utils;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.open;

public class TestConfigs {
    public void  setUp(String baseUrl,String reportsFolderPath){
        WebDriverManager.chromedriver().setup();
        Configuration.timeout=10000;
        Configuration.screenshots=true;
        Configuration.savePageSource=false;
        Configuration.reportsFolder=reportsFolderPath;
        WebDriverRunner.setWebDriver(new ChromeDriver());
        WebDriverRunner.getWebDriver().manage().window().maximize();
        open(baseUrl);

    }

    public void tearDown(){
        WebDriverRunner.closeWebDriver();
    }
}
