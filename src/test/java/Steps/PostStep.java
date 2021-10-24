package Steps;

import Page.PostBoardPage;
import com.thoughtworks.gauge.Step;

public class PostStep {

    private PostBoardPage postBoardPage = new PostBoardPage();

    @Step("setup")
    public  void set_up() {
        postBoardPage.setUp();

    }

    @Step("Post board")
    public void post_board(){
        postBoardPage.postBoard();
    }
}
