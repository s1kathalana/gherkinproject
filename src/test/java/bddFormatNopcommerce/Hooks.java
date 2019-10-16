package bddFormatNopcommerce;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import java.util.concurrent.TimeUnit;
import static bddFormatNopcommerce.LoadProp.props;

public class Hooks extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void setUpBrowser()
    {
        browserSelector.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
        driver.manage().window().fullscreen();
        driver.get(props.getProperty("url"));
    }

    @After

    public void closeBroser()
    {

        driver.close();
    }


}
