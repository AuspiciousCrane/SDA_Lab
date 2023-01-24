package lab1;

public class Main{

    public static void main(String args[]){
        System.out.println("Hello software archiecture Lab 1");
    
        String vehicleType = "Honda";
        switch(vehicleType){
            case "Honda": {
                System.out.println("10");
                break;
            }
            case "Benz": {
                System.out.println("1000");
                break;
            }
            case "Tractor": {
                System.out.println("5555");
                break;
            }
        }
    
        Vehicle car = new Honda();
        System.out.println(car.getSpeed());
    }

}