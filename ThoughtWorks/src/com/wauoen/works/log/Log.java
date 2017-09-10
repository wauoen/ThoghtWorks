package com.wauoen.works.log;

public class Log {

	private final static String MSG_CMD = "> ";
	private final static String MSG_TYPE_ERRO = "Erro: ";
	private final static String MSG_TYPE_SUCCESS = "Success: ";
	/**
	 * 订单无效
	 */
	private final static String MSG_CONTENT_INVALID = "the booking is invalid!";
	/**
	 * 订单被接收
	 */
	private final static String MSG_CONTENT_ACCEPTED = "the booking is accepted!";
	/**
	 * 与存在的订单冲突
	 */
	private final static String MSG_CONTENT_CONFLICTS = "the booking conficts with existing booking!";
	/**
	 * 订单不存在
	 */
	private final static String MSG_CONENT_NOT_EXIST = "the booking being cancelled does not exist!";

	/**
	 * 订单无效
	 */
	public static void orderInvalid() {

		message(MSG_TYPE_ERRO, MSG_CONTENT_INVALID);
	}

	/**
	 * 订单被接收
	 */
	public static void orderAccepted() {

		message(MSG_TYPE_SUCCESS, MSG_CONTENT_ACCEPTED);
	}

	/**
	 * 订单冲突
	 */
	public static void orderConficts() {
		message(MSG_TYPE_ERRO, MSG_CONTENT_CONFLICTS);
	}

	/**
	 * 订单不存在
	 */
	public static void orderNotExist() {
		message(MSG_TYPE_ERRO, MSG_CONENT_NOT_EXIST);
	}

	/**
	 * 打印log消息
	 * 
	 * @param msgType
	 * @param msgContent
	 */
	private static void message(String msgType, String msgContent) {

		System.out.println(MSG_CMD + msgType + msgContent);
	}

	/**
	 * 输出log
	 * 
	 * @param msg
	 */
	public static void log(String msg) {
		System.out.println(MSG_CMD + msg);
	}

}
