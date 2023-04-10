package lab10.task2;

public class SpamHandler extends Handler{
    public SpamHandler(Handler successor){
        super(successor);
    }
    @Override
    public void handleRequest(Request request) {
        if (request.getRequest() == "Spam"){
            System.out.println("Handler: " + request.getRequest());
        }
        else
            super.handleRequest(request);
    }

}
