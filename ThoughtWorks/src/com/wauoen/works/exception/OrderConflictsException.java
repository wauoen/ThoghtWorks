package com.wauoen.works.exception;

/**
 * 订单冲突异常
 * @author wauoen
 *
 */
public class OrderConflictsException extends ErroException{
	
	/**
	 * 与存在的订单冲突
	 */
	private final static String MSG_CONTENT_CONFLICTS = "the booking conficts with existing booking!";
 	
	
	public OrderConflictsException() {
		super(MSG_CONTENT_CONFLICTS);
		// TODO Auto-generated constructor stub
	}
}
