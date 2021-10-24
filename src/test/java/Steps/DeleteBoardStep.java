package Steps;

import Page.DeleteBoardPage;
import com.thoughtworks.gauge.Step;

public class DeleteBoardStep {

    private DeleteBoardPage deleteBoardPage = new DeleteBoardPage();
    @Step("Delete board")
    public void delete_board_step() {
        deleteBoardPage.DeleteBoard();
    }
}
