package bddFormatNopcommerce;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags= "@referproducttoafriend,@register,@cannotreferproducttofriend,@reguserbuyproductsuccessfully,@guestbuyproductsuccessfully")


public class RunTest {
}
