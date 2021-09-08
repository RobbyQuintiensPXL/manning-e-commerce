package manning.ecommerce.webshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebshopApplication.class, args);
        String message = "Hello world!";
        System.out.println(message.substring(6,12) + message.substring(12,6));
    }

}
