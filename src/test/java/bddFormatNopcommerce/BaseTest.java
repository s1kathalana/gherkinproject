package bddFormatNopcommerce;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static bddFormatNopcommerce.LoadProp.props;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void setUpBrowser()
    {
        browserSelector.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
        driver.manage().window().fullscreen();
        driver.get(props.getProperty("url"));
    }

    @AfterMethod

    public void closeBroser()
    {
        capturescreenshot();
        driver.close();
    }
}
