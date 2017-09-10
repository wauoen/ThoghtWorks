package com.wauoen.works.exception;

/**
 * 订单无效异常
 * @author wauoen
 *
 */
public class OrderInvalidException extends ErroException{
	
	/**
	 * 订单无效
	 */
	private final static String MSG_CONTENT_INVALID = "the booking is invalid!";
	
	
	public OrderInvalidException() {
		super(MSG_CONTENT_INVALID);
		// TODO Auto-generated constructor stub
	}
}
