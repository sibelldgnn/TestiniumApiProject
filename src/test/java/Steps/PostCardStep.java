package Steps;

import Page.PostCardPage;
import com.thoughtworks.gauge.Step;

public class PostCardStep {

    private PostCardPage postCardPage = new PostCardPage();

    @Step("Create card")
    public void post_card(){
        postCardPage.postedCardPage();
    }

    @Step("Create card two")
    public void post_card_two(){
        postCardPage.postedCardPage2();
    }

}
