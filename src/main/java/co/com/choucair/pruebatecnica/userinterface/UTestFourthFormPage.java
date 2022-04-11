package co.com.choucair.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestFourthFormPage extends PageObject {
    public static final Target PASSWORD_INPUT = Target.the("Where do we write the password").
            located(By.id("password"));
    public static final Target CONFIRM_PASSWORD_INPUT = Target.the("Where do we write the confirm password").
            located(By.id("confirmPassword"));
    public static final Target STAY_INFORMED_CHECKBOX = Target.the("Where do we confirm stay informed").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));

    public static final Target TERMS_CONDITIONS_CHECKBOX = Target.the("Where do we confirm terms and conditions").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target PRIVACY_POLICY_CHECKBOX = Target.the("Where do we confirm privacy policy").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target COMPLETE_BUTTON = Target.the("Button to complete").
            located(By.id("laddaBtn"));
}

