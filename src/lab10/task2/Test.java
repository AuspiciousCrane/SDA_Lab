package lab10.task2;

public class Test {

    public static void main(String[] args) {
        Chain chain = new Chain();

        chain.handleRequest(new Request("Fan"));
        chain.handleRequest(new Request("New Location"));
        chain.handleRequest(new Request("Spam"));
        chain.handleRequest(new Request("Complain"));
        chain.handleRequest(new Request("Complin"));
    }
}
