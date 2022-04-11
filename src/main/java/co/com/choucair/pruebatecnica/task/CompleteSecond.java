package co.com.choucair.pruebatecnica.task;

import co.com.choucair.pruebatecnica.model.FormModel;
import co.com.choucair.pruebatecnica.userinterface.UTestFirstFormPage;
import co.com.choucair.pruebatecnica.userinterface.UTestSecondFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;

public class CompleteSecond implements Task {
    private List<FormModel> secondFormInfo;

    public CompleteSecond(List<FormModel> secondFormInfo) {
        this.secondFormInfo = secondFormInfo;
    }

    public static CompleteSecond form(List<FormModel> secondFormInfo) {
        return Tasks.instrumented(CompleteSecond.class,secondFormInfo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(secondFormInfo.get(0).getStrCity()).into(UTestSecondFormPage.CITY_INPUT),
                Click.on(UTestSecondFormPage.CITY),
                Enter.theValue(secondFormInfo.get(0).getStrPostal_Code()).into(UTestSecondFormPage.POSTAL_CODE_INPUT),
                Click.on(UTestSecondFormPage.NEXT_DEVICES_BUTTON)
        );

    }
}
