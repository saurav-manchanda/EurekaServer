/********************************************************************************* *
 * Purpose: To create an eureka server so as to perform microservices.
 * @author Saurav Manchanda
 * @version 1.0
 * @since 7/08/2018
 *********************************************************************************/
package com.bridgelabz.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Saurav
 *         <p>
 *         This class is springBootStarter which is the main class of
 *         application enabled as Eureka Server.
 *         </p>
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
