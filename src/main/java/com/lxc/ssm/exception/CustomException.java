package com.lxc.ssm.exception;
//系统 自定义异常类，针对预期的异常，需要在程序中抛出此类的异常 
public class CustomException extends Exception {
	
	//异常信息
	public String message;
//	正是因为有了这段代码才会有CustomException("查询的商品信息为空")成立
	public CustomException(String message){
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
