package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BookStorePage {
    ElementsCollection books=$(".books-wrapper").find(".rt-tbody").findAll(".rt-tr-group");
    public SelenideElement firstBook=books.first(),
            firstBookDetailsLink=firstBook.find(By.id("see-book-Git Pocket Guide"));

}
