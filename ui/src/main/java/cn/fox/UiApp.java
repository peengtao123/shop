package cn.fox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class UiApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(UiApp.class,args);
    }
 
}
