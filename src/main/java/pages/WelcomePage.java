package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePageObject {

    private String pageUrl = "http://the-internet.herokuapp.com/";

    private By redirectLinklLocator = By.linkText("Redirect Link");


    public WelcomePage(WebDriver driver, Logger log) {
        super(driver, log);
    }
    public void openPage(){
        log.info("Opening page: "+pageUrl);
        openUrl(pageUrl);
        log.info("Page opened!");
    }
    public RedirectPage clickRedirectPageLink(){
        log.info("Clicking Redirection Link on welcome Page");
        click(redirectLinklLocator);
        log.info("Page opened!");
        return new RedirectPage(driver,log);
    }
}
