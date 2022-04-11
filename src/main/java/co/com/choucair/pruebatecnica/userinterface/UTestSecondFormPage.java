package co.com.choucair.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestSecondFormPage extends PageObject {
    public static Target CITY = Target.the("Where do we write the name of the city")
            .located(By.xpath("//div[@class='pac-container pac-logo']/div[1]"));
    public static final Target CITY_INPUT = Target.the("Where do we write the city").
            located(By.id("city"));
    public static final Target POSTAL_CODE_INPUT = Target.the("Where do we write the postal code").
            located(By.id("zip"));
    public static final Target NEXT_DEVICES_BUTTON = Target.the("button that go to the third form page").
            located(By.xpath("//a[@class='btn btn-blue pull-right']"));


}
