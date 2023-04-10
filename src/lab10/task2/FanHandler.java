package lab10.task2;

public class FanHandler extends Handler{
    public FanHandler(Handler successor){
        super(successor);
    }
    @Override
    public void handleRequest(Request request) {
        if (request.getRequest() == "Fan"){
            System.out.println("Handler: " + request.getRequest());
        }
        else
            super.handleRequest(request);
    }
}
