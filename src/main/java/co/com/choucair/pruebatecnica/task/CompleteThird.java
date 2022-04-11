package co.com.choucair.pruebatecnica.task;

import co.com.choucair.pruebatecnica.model.FormModel;
import co.com.choucair.pruebatecnica.userinterface.UTestSecondFormPage;
import co.com.choucair.pruebatecnica.userinterface.UTestThirdFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

public class CompleteThird implements Task {
    private List<FormModel> thirdFormInfo;
    public CompleteThird(List<FormModel> thirdFormInfo) {
        this.thirdFormInfo = thirdFormInfo;
    }


    public static CompleteThird form(List<FormModel> thirdFormInfo) {
        return Tasks.instrumented(CompleteThird.class,thirdFormInfo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UTestThirdFormPage.MOBILE_DEVICE),
                Enter.theValue(thirdFormInfo.get(0).getStrDevice()).into(UTestThirdFormPage.MOBILE_DEVICE_INPUT).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(UTestThirdFormPage.MOBILE_MODEL),
                Enter.theValue(thirdFormInfo.get(0).getStrModel()).into(UTestThirdFormPage.MOBILE_MODEL_INPUT).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(UTestThirdFormPage.MOBILE_SYSTEM),
                Enter.theValue(thirdFormInfo.get(0).getStrSystem()).into(UTestThirdFormPage.MOBILE_SYSTEM_INPUT).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(UTestThirdFormPage.LAST_STEP_BUTTON));

    }
}
