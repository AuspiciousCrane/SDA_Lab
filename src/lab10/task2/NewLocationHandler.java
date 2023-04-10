package lab10.task2;

public class NewLocationHandler extends Handler{
    public NewLocationHandler(Handler successor){
        super(successor);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getRequest() == "New Location"){
            System.out.println("Handler: " + request.getRequest());
        }
        else{
            super.handleRequest(request);
            System.out.println("No handler for this request");
        }

    }
}
