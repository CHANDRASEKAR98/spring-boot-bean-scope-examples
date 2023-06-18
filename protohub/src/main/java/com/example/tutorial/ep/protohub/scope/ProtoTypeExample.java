package com.example.tutorial.ep.protohub.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class ProtoTypeExample {
	
	public ProtoTypeExample() {
		
	}

}
