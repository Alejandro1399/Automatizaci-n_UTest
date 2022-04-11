package co.com.choucair.pruebatecnica.task;

import co.com.choucair.pruebatecnica.userinterface.UTestJoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Enroll implements Task {

    public static Enroll onThePage() {
        return Tasks.instrumented(Enroll.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UTestJoinPage.JOIN_BUTTON)
        );

    }
}
