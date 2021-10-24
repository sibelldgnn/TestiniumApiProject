package Steps;

import Page.DeleteCardPage;
import com.thoughtworks.gauge.Step;

public class DeleteCardStep{

private DeleteCardPage deleteCardPage = new DeleteCardPage();

            @Step("Delete card")
            public void delete_card_step() {
              deleteCardPage.DeleteCard();
            }
}
