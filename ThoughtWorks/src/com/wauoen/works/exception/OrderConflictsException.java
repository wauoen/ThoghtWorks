package com.wauoen.works.exception;

/**
 * ������ͻ�쳣
 * @author wauoen
 *
 */
public class OrderConflictsException extends ErroException{
	
	/**
	 * ����ڵĶ�����ͻ
	 */
	private final static String MSG_CONTENT_CONFLICTS = "the booking conficts with existing booking!";
 	
	
	public OrderConflictsException() {
		super(MSG_CONTENT_CONFLICTS);
		// TODO Auto-generated constructor stub
	}
}
