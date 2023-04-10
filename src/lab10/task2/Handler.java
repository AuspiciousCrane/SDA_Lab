package lab10.task2;

public class Handler {
    private Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public Handler getSuccessor() {
        return successor;
    }
    public Handler(Handler successor){
        this.successor = successor;
    }

    public void handleRequest(Request request) {
        if (successor != null){
            successor.handleRequest(request);
        }
    }
}
