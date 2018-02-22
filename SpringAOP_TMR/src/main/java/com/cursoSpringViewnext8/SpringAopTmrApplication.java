package com.cursoSpringViewnext8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.TextEditor;

@SpringBootApplication
public class SpringAopTmrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopTmrApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
	}
}
