package com.example.testino;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.testino.prova.output;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.naming.Name;

@SpringBootApplication
public class TestinoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestinoApplication.class, args);

		output peppesi = new output("Peppe");
		System.out.println(peppesi);
	}



}
