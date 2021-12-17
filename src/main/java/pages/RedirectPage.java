package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RedirectPage extends BasePageObject {

    private String pageUrl = "http://the-internet.herokuapp.com/redirector";

    private By here = By.xpath("/html//a[@id='redirect']");

    public RedirectPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void openPage() {
        log.info("Opening page: " + pageUrl);
        openUrl(pageUrl);
        log.info("Page opened");
    }

    public NewWindow clickHereLink() {
        clickHereLink();
        log.info("Opened new Window");
        return new NewWindow(driver, log);
    }
}
