package com.wauoen.works.exception;

/**
 * ������Ч�쳣
 * @author wauoen
 *
 */
public class OrderInvalidException extends ErroException{
	
	/**
	 * ������Ч
	 */
	private final static String MSG_CONTENT_INVALID = "the booking is invalid!";
	
	
	public OrderInvalidException() {
		super(MSG_CONTENT_INVALID);
		// TODO Auto-generated constructor stub
	}
}
