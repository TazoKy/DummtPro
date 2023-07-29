package Steps;

import Pages.FirstBookPage;

public class FirstBookSteps {
    FirstBookPage page=new FirstBookPage();
    public String getISBN(){
        return page.isbnValue.getText();
    }
}
