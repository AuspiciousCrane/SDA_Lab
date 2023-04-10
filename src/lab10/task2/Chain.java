package lab10.task2;

public class Chain {
    Handler chain;

    public Chain(){
        buildChain();
    }

    private void buildChain(){
        chain = new SpamHandler(new FanHandler(new ComplainHandler(new NewLocationHandler(null))));
    }

    public void handleRequest(Request request) {
        chain.handleRequest(request);
    }

}
