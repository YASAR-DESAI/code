package com.mypackage;

import org.springframework.stereotype.Component;

@Component
public class HelloMessage {
	
	String msg = "This is set using autowired annotation";
	
	public HelloMessage() {}
	
	public HelloMessage(String msg) {
		
		this.msg = msg;
		
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
