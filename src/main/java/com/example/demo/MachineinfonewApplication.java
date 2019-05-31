package com.example.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class MachineinfonewApplication {
	@RequestMapping("/")
	 public String getinfo() throws UnknownHostException 
	 {
		
		InetAddress address=InetAddress.getLocalHost();
		String IP_address=address.getHostAddress();
		return IP_address +" "+ System.getProperty("os.name");
		
		
	 }

	public static void main(String[] args) {
		SpringApplication.run(MachineinfonewApplication.class, args);
	}

}
