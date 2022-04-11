package co.com.choucair.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestFirstFormPage extends PageObject {

    public static final Target FIRST_NAME_INPUT = Target.the("Where do we write the first name").
            located(By.id("firstName"));
    public static final Target LAST_NAME_INPUT = Target.the("Where do we write the last name").
            located(By.id("lastName"));
    public static final Target EMAIL_INPUT = Target.the("Where do we write the email").
            located(By.id("email"));
    public static final Target BIRTH_MONTH_SELECT = Target.the("Where do we select the birth month").
            located(By.id("birthMonth"));
    public static final Target BIRTH_DAY_SELECT = Target.the("Where do we select the birth day").
            located(By.id("birthDay"));
    public static final Target BIRTH_YEAR_SELECT = Target.the("Where do we select the birth year").
            located(By.id("birthYear"));
    public static Target LANGUAGES_SEARCH = Target.the("where do we search the languages")
            .located(By.xpath("//form/div[1]/div[3]/div[5]/div[2]/div[1]/input"));

    public static Target NEXT_lOCATION_BUTTON = Target.the("button that go to the second form page")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
