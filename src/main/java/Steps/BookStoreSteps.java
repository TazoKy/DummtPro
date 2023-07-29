package Steps;

import Pages.BookStorePage;

public class BookStoreSteps {
    BookStorePage page=new BookStorePage();
    public BookStoreSteps clickOnFirstBookDetailsLink(){
        page.firstBookDetailsLink.scrollTo();
        page.firstBookDetailsLink.click();
        return this;
    }
}
