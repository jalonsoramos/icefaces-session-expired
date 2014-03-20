package com.autentia.tutoriales.jsf;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Controller;

@Controller
@Scope("session")
public class UserCtrl {

	private String userName;

	private String welcomeMessage;

	private String welcome;

	@Resource
	private MessageSourceAccessor messageSourceAccessor;

	@SuppressWarnings("unused")
	@PostConstruct
	private void init() {
		welcome = messageSourceAccessor.getMessage("home.welcome");
	}

	public String accept() {
		welcomeMessage = welcome + " " + userName;

		return "";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getWelcomeMessage() {
		return welcomeMessage;
	}

	public void setWelcomeMessage(String welcomeMessage) {
		this.welcomeMessage = welcomeMessage;
	}

}