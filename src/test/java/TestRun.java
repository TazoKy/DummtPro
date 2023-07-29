import Data.HardData.FilePaths;
import Steps.BookStoreSteps;
import Steps.FirstBookSteps;
import Utils.HelperFunctions;
import Utils.TestConfigs;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class TestRun extends TestConfigs {
    HelperFunctions hf=new HelperFunctions();
    FilePaths fp=new FilePaths();
    BookStoreSteps bookStoreSteps=new BookStoreSteps();
    FirstBookSteps firstBookSteps=new FirstBookSteps();
    @BeforeMethod
    public void start(){
        hf.parseProperties(fp.configPath);
        setUp(hf.url,hf.reportsFolder);

    }
    @Test
    public void test() throws InterruptedException {
        bookStoreSteps.clickOnFirstBookDetailsLink();
        System.out.println(firstBookSteps.getISBN());


        RestAssured.baseURI = "https://github.com/Alinatkabladze";

        String endpoint = "/Bootcamp7-Team1";


        Response response = given()
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();

        System.out.println("Response: " + response.getBody().asString());

        Thread.sleep(4444);

    }

    @AfterMethod
    public void close(){
        tearDown();
    }
}
