package mywebservice;

public class Demo {

    public static void main(String[] args) {
        HellowServiceService hellowServiceService = new HellowServiceService();

        HellowService proxy = hellowServiceService.getHellowServicePort();

        String sayHello = proxy.sayHellow("Saber");

        System.out.println(sayHello);
    }

}