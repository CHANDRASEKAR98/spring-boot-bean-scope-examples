package com.example.tutorial.ep.protohub.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "singleton")
public class SingletonExample {
	
	public SingletonExample() {
		
	}

}
