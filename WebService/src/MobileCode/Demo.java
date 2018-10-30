package MobileCode;

public class Demo {
    public static void main(String[] args) {
        MobileCodeWS mobileCodeWS =new MobileCodeWS ();

        MobileCodeWSSoap soap =mobileCodeWS.getMobileCodeWSSoap();

        String mobileCodeInfo =soap.getMobileCodeInfo("13767737469",null);

        System.out.println(mobileCodeInfo);
    }
}
