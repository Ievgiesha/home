import base.Utilites;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.RedirectPage;
import pages.WelcomePage;

public class RedirectPageTests extends Utilites {
    public RedirectPageTests(WebDriver driver, Logger log) {
        super();
    }

    @Test
    public void selectingHereLink() {
        log.info(" Starting selectingHereLink");
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();
        RedirectPage redirectPage = welcomePage.clickRedirectPageLink();
        redirectPage.clickHereLink();
    }
}
