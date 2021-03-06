/**
 * 
 */
package com.jci.po;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import com.jci.ConfigApplication;


/**
 * <p>
 * <strong>The Class Application.</strong>
 * <p>
 *
 * @author csonisk
 */
@SpringBootApplication
@EnableHystrix
@EnableFeignClients
@EnableEurekaClient
@Import(ConfigApplication.class) 
public class Application {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class,args);
	}
	   /**
     * Feign logger level.
     *
     * @return the feign. logger. level
     */
    @Bean
    public feign.Logger.Level feignLoggerLevel() {
        return feign.Logger.Level.FULL;
    }
}
