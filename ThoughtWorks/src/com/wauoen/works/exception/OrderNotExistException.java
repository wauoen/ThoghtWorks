package com.wauoen.works.exception;

/**
 * 订单不存在异常
 * @author wauoen
 *
 */
public class OrderNotExistException extends ErroException{
	
	/**
	 * 订单不存在
	 */
	private final static String MSG_CONENT_NOT_EXIST = "the booking being cancelled does not exist!";
	
	
	public OrderNotExistException() {
		super(MSG_CONENT_NOT_EXIST);
		// TODO Auto-generated constructor stub
	}
}
