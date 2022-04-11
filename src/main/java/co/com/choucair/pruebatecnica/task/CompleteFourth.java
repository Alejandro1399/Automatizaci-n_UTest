package co.com.choucair.pruebatecnica.task;

import co.com.choucair.pruebatecnica.model.FormModel;
import co.com.choucair.pruebatecnica.userinterface.UTestFourthFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class CompleteFourth implements Task {
    private List<FormModel> fourthFormInfo;

    public CompleteFourth(List<FormModel> fourthFormInfo) {
        this.fourthFormInfo = fourthFormInfo;
    }

    public static CompleteFourth form(List<FormModel> fourthFormInfo) {
        return Tasks.instrumented(CompleteFourth.class,fourthFormInfo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(fourthFormInfo.get(0).getStrPassword()).into(UTestFourthFormPage.PASSWORD_INPUT),
                Enter.theValue(fourthFormInfo.get(0).getStrConfirmPassword()).into(UTestFourthFormPage.CONFIRM_PASSWORD_INPUT),
                Click.on(UTestFourthFormPage.STAY_INFORMED_CHECKBOX),
                Click.on(UTestFourthFormPage.TERMS_CONDITIONS_CHECKBOX),
                Click.on(UTestFourthFormPage.PRIVACY_POLICY_CHECKBOX),
                Click.on(UTestFourthFormPage.COMPLETE_BUTTON)



        );


    }


}
