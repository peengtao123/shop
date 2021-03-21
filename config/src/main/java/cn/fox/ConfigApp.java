package cn.fox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Hello world!
 *
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConfigApp.class,args);
    }
}
