package lab10.task2;

public class ComplainHandler extends Handler{
    public ComplainHandler(Handler successor){
        super(successor);
    }
    @Override
    public void handleRequest(Request request) {
        if (request.getRequest() == "Complain"){
            System.out.println("Handler: " + request.getRequest());
        }
        else
            super.handleRequest(request);
    }
}
