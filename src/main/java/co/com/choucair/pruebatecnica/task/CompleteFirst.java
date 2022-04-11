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

public class CompleteFirst implements Task {
    private List<FormModel> firstFormInfo;

    public CompleteFirst(List<FormModel> firstFormInfo) {
        this.firstFormInfo = firstFormInfo;
    }

    public static CompleteFirst form(List<FormModel> firstFormInfo) {
        return Tasks.instrumented(CompleteFirst.class ,firstFormInfo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(firstFormInfo.get(0).getStrFirst_name()).into(UTestFirstFormPage.FIRST_NAME_INPUT),
                Enter.theValue(firstFormInfo.get(0).getStrLast_name()).into(UTestFirstFormPage.LAST_NAME_INPUT),
                Enter.theValue(firstFormInfo.get(0).getStrEmail_address()).into(UTestFirstFormPage.EMAIL_INPUT),
                SelectFromOptions.byVisibleText(firstFormInfo.get(0).getStrMonth()).from(UTestFirstFormPage.BIRTH_MONTH_SELECT),
                SelectFromOptions.byVisibleText(firstFormInfo.get(0).getStrDay()).from(UTestFirstFormPage.BIRTH_DAY_SELECT),
                SelectFromOptions.byVisibleText(firstFormInfo.get(0).getStrYear()).from(UTestFirstFormPage.BIRTH_YEAR_SELECT),
                Enter.theValue(firstFormInfo.get(0).getStrLanguages()).into(UTestFirstFormPage.LANGUAGES_SEARCH),
                Hit.the(Keys.ARROW_DOWN).into(UTestFirstFormPage.LANGUAGES_SEARCH),
                Hit.the(Keys.ENTER).into(UTestFirstFormPage.LANGUAGES_SEARCH),
                Click.on(UTestFirstFormPage.NEXT_lOCATION_BUTTON));


    }
}
