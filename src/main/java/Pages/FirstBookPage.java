package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FirstBookPage {
    public SelenideElement isbnContainer=$(By.id("ISBN-wrapper")),
            isbnValue=isbnContainer.find(By.id("userName-value")),
            titleContainer=$(By.id("title-wrapper")),
            titleValue=titleContainer.find(By.id("userName-value")),
            subTitleContainer=$(By.id("subtitle-wrapper")),
            subTitleValue=subTitleContainer.find(By.id("userName-value")),
            authorContainer=$(By.id("author-wrapper")),
            authorValue=authorContainer.find(By.id("userName-value")),
            publisherContainer=$(By.id("publisher-wrapper")),
            publisherValue=publisherContainer.find(By.id("userName-value")),
            pageContainer=$(By.id("pages-wrapper")),
            pageValue=pageContainer.find(By.id("userName-value")),
            descriptionContainer=$(By.id("description-wrapper")),
            descriptionValue=descriptionContainer.find(By.id("userName-value")),
            websiteContainer=$(By.id("website-wrapper")),
            websiteValue=websiteContainer.find(By.id("userName-value"));

}

