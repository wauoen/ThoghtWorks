package com.wauoen.works.exception;

/**
 * �����������쳣
 * @author wauoen
 *
 */
public class OrderNotExistException extends ErroException{
	
	/**
	 * ����������
	 */
	private final static String MSG_CONENT_NOT_EXIST = "the booking being cancelled does not exist!";
	
	
	public OrderNotExistException() {
		super(MSG_CONENT_NOT_EXIST);
		// TODO Auto-generated constructor stub
	}
}
