package name.jnsmith.patterns.structure.proxy;

public class TwitterSeriveStub implements TwitterService {

    @Override
    public String getTimeline(String screenName) {
        return "My neato timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {

    }
}
