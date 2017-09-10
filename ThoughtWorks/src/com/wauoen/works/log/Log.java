package com.wauoen.works.log;

public class Log {

	private final static String MSG_CMD = "> ";
	private final static String MSG_TYPE_ERRO = "Erro: ";
	private final static String MSG_TYPE_SUCCESS = "Success: ";
	/**
	 * ������Ч
	 */
	private final static String MSG_CONTENT_INVALID = "the booking is invalid!";
	/**
	 * ����������
	 */
	private final static String MSG_CONTENT_ACCEPTED = "the booking is accepted!";
	/**
	 * ����ڵĶ�����ͻ
	 */
	private final static String MSG_CONTENT_CONFLICTS = "the booking conficts with existing booking!";
	/**
	 * ����������
	 */
	private final static String MSG_CONENT_NOT_EXIST = "the booking being cancelled does not exist!";

	/**
	 * ������Ч
	 */
	public static void orderInvalid() {

		message(MSG_TYPE_ERRO, MSG_CONTENT_INVALID);
	}

	/**
	 * ����������
	 */
	public static void orderAccepted() {

		message(MSG_TYPE_SUCCESS, MSG_CONTENT_ACCEPTED);
	}

	/**
	 * ������ͻ
	 */
	public static void orderConficts() {
		message(MSG_TYPE_ERRO, MSG_CONTENT_CONFLICTS);
	}

	/**
	 * ����������
	 */
	public static void orderNotExist() {
		message(MSG_TYPE_ERRO, MSG_CONENT_NOT_EXIST);
	}

	/**
	 * ��ӡlog��Ϣ
	 * 
	 * @param msgType
	 * @param msgContent
	 */
	private static void message(String msgType, String msgContent) {

		System.out.println(MSG_CMD + msgType + msgContent);
	}

	/**
	 * ���log
	 * 
	 * @param msg
	 */
	public static void log(String msg) {
		System.out.println(MSG_CMD + msg);
	}

}
