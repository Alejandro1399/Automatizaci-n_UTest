package co.com.choucair.pruebatecnica.questions;

import co.com.choucair.pruebatecnica.model.FormModel;
import co.com.choucair.pruebatecnica.userinterface.UTestFourthFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Answer implements Question<Boolean> {

    public Answer(List<FormModel> formInfo) {
        this.formInfo = formInfo;
    }

    private List<FormModel> formInfo;

    public static Answer theform(List<FormModel> formInfo) {
        return new Answer(formInfo);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String final_button = Text.of(UTestFourthFormPage.COMPLETE_BUTTON).viewedBy(actor).asString();
        return formInfo.get(0).getStrFinalText().equals(final_button);
    }

}
