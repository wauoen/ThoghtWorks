package com.wauoen.works.exception;

/**
 * 项目中存在的异常
 * @author wauoen
 *
 */
public class ErroException extends Exception{
	private final static String MSG_TYPE_ERRO = "Erro: ";
	private String type ;
	private String content;
	
	public ErroException(String content){
		this.type = MSG_TYPE_ERRO;
		this.content = content;
	}
	
	@Override
	public String toString() {
		return this.type+this.content;
	}

}
