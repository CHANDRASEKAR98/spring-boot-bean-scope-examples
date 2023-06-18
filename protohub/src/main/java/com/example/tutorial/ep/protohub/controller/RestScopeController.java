package com.example.tutorial.ep.protohub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tutorial.ep.protohub.scope.RequestScopeExample;
import com.example.tutorial.ep.protohub.scope.SessionScopeExample;

@RestController
public class RestScopeController {
	
	@Autowired
	private RequestScopeExample requestScopeExample;
	
	@Autowired
	private SessionScopeExample sessionScopeExample;
	
	@GetMapping(value = "/request/value")
	public String executeRequestScope() {
		return requestScopeExample.getTitle();
	}
	
	@GetMapping(value = "/request/updated-value")
	public String executeUpdatedRequestScope() {
		requestScopeExample.setTitle("Request Scope is Updated");
		return requestScopeExample.getTitle();
	}
	
	@GetMapping(value = "/session/value")
	public String executeSessionScope() {
		return sessionScopeExample.getTitle();
	}
	
	@GetMapping(value = "/session/updated-value")
	public String executeUpdatedSessionScope() {
		sessionScopeExample.setTitle("Session Scope is Updated");
		return sessionScopeExample.getTitle();
	}

}
