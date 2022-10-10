package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BestBuyPage {
    public BestBuyPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
}
