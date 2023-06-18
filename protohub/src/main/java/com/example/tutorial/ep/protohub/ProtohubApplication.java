package com.example.tutorial.ep.protohub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.tutorial.ep.protohub.scope.ProtoTypeExample;
import com.example.tutorial.ep.protohub.scope.SingletonExample;

@SpringBootApplication
public class ProtohubApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ProtohubApplication.class, args);
		
		System.out.println("Singleton Scope Execution");
		singletonScopeExecution(context);
		
		System.out.println("Prototype Scope Execution");
		prototypeScopeExecution(context);
	}
	
	public static void singletonScopeExecution(ConfigurableApplicationContext context) {
		SingletonExample object1 = context.getBean(SingletonExample.class);
		System.out.println(object1.hashCode());
		
		SingletonExample object2 = context.getBean(SingletonExample.class);
		System.out.println(object2.hashCode());
	}
	
	public static void prototypeScopeExecution(ConfigurableApplicationContext context) {
		ProtoTypeExample object1 = context.getBean(ProtoTypeExample.class);
		System.out.println(object1.hashCode());
		
		ProtoTypeExample object2 = context.getBean(ProtoTypeExample.class);
		System.out.println(object2.hashCode());
	}

}
