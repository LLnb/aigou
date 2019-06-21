package cn.itsource.aigou;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication //sb应用
@EnableEurekaServer //eureka的服务端
public class EurekaServerApplication7001 {

    public static void main(String[] args) {
      //  SpringApplication.run(EurekaServerApplication7001.class,args);
        SpringApplication.run(EurekaServerApplication7001.class);
    }
}
