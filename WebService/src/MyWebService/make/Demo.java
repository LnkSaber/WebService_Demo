package MyWebService.make;

public class Demo {
    public static void main(String[] args) {
        HellowServiceService hellowServiceService =new HellowServiceService();

        HellowService proxy =hellowServiceService.getHellowServicePort();

        String sayhellow =proxy.sayHellow("林Saber");

        System.out.println(sayhellow);
    }
}
