package AppiumTest.StepDefinitions;

import AppiumTest.Pages.A101Page;
import AppiumTest.utulities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Alert;

public class A101StepDefinitions {
    A101Page a101Page =new A101Page();

    @Given("a101 e girilir")
    public void a101_e_girilir() {

        String text ="şuan a101 e girdim knkz";
        System.out.println("text = " + text);
    }


}
