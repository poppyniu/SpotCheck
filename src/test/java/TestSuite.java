import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by Poppy_Zhang on 2018/9/11.
 */
//@RunWith(Cucumber.class)
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        format = {"pretty", "html:target/html/"},
        features = {"src/test/resources" },
       tags = {"@SpotCheckDN55"}
)
public class TestSuite {
}
