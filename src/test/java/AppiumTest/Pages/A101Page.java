package AppiumTest.Pages;

import AppiumTest.utulities.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class A101Page {
    public A101Page() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()), this);
    }
    @AndroidFindBy(xpath = "BRUH...")
    public WebElement justDOIT;


}
