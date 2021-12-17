package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class NewWindow extends BasePageObject{
    WebDriver driver;
    Logger log;
   public NewWindow(WebDriver driver, Logger log){
        super(driver, log);
    }
}
