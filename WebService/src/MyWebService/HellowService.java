package MyWebService;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class HellowService {
    public String sayHellow(String name){
        System.out.println("吾王 "+name+" 降临");
        return "亚瑟王 " +name;
    }

    public static void main(String[] args) {
        //参数一：指定服务器的发布网址
        //参数二：服务器提供服务的对象实例
        Endpoint.publish("http://localhost:9527/Saber",new HellowService());
    }
}
