package co.com.choucair.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestThirdFormPage extends PageObject {
    public static Target MOBILE_DEVICE = Target.the("container of mobile device")
            .located(By.name("handsetMakerId"));

    public static Target MOBILE_DEVICE_INPUT = Target.the("Where do we write our mobil device")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));

    public static Target MOBILE_MODEL = Target.the("container of mobile model")
            .located(By.name("handsetModelId"));

    public static Target MOBILE_MODEL_INPUT = Target.the("Where do we write our mobil model")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));

    public static Target MOBILE_SYSTEM = Target.the("container of mobile system")
            .located(By.name("handsetOSId"));

    public static Target MOBILE_SYSTEM_INPUT = Target.the("Where do we write our mobil system")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));

    public static Target LAST_STEP_BUTTON = Target.the("Press button to go the last step")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
