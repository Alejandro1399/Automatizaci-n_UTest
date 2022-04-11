package co.com.choucair.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestJoinPage extends PageObject {

    public static final Target JOIN_BUTTON = Target.the("button that go to the first form page")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
}
