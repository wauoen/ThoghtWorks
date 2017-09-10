package com.wauoen.works;

import com.wauoen.works.exception.OrderInvalidException;
import com.wauoen.works.log.Log;

/**
 * ����ʵ����
 * @author wauoen
 *
 */
public class Order {
	
	//����A��B��C��D
	public static final String SITE_A ="A";
	public static final String SITE_B ="B";
	public static final String SITE_C ="C";
	public static final String SITE_D ="D";

	public static final String CANCEL_FLAG = "C";
	/**
	 * ID
	 */
	private String id ;
	/**
	 * ����
	 */
	private String date;
	/**
	 * ��ʼʱ�䣬����������ʱ��
	 */
	private String startHour;
	/**
	 * ����ʱ�䣬����������ʱ��
	 */
	private String endHour;
	/**
	 * ����
	 */
	private String site; 
	/**
	 * ��������,C��ʾȡ������
	 */
	private String type;
	
	public Order(String order) throws OrderInvalidException{
		createOrder(order);
	}
	
	
	/**
	 * ������ַ����Կո�ָ���
	 */
	private final String SPLITER = " ";
	/**
	 * ��ʼ�ͽ���ʱ��ķָ�
	 */
	private final String TIME_SPLITER = "~";
	/**
	 * hour�ķָ���
	 */
	private final String HOUR_SPLITER = ":";

	/**
	 * ��Ӷ���ʱ����������Ϊ5
	 */
	private final int VALUES_NUM_ADD = 4;
	/**
	 * ȡ�������ǲ���������Ϊ6
	 */
	private final int VALUES_NUM_CANCEL = 5;
	/**
	 * ��������
	 * @param order
	 * @throws OrderInvalidException 
	 */
	private void createOrder(String order) throws OrderInvalidException {
		if(order == null || order.length() == 0){
			throw new OrderInvalidException();
		}
		String[] values = order.split(SPLITER);
		if(values.length == VALUES_NUM_ADD || values.length == VALUES_NUM_CANCEL){
			createOrder(values);
		}else{
			throw new OrderInvalidException();
		}
		
		
	}
	/**
	 * ���ݶ�����Ϣ��������
	 * @param values
	 * @throws OrderInvalidException 
	 */
	private void createOrder(String[] values) throws OrderInvalidException {
		
		this.id = values[0];
		this.date = values[1];
		String[] hours = values[2].split(TIME_SPLITER);
		this.startHour = hours[0];
		this.endHour = hours[1];
		if(!hourValid(startHour,endHour)){
			throw new OrderInvalidException();
		}
		this.site = values[3];
		if(values.length > VALUES_NUM_ADD){
			this.type = values[4];
			if(!this.type.equals(CANCEL_FLAG)){
				throw new OrderInvalidException();
			}
		}
		
	}
	
	private boolean hourValid(String startHour2, String endHour2) {
		
		String[] starthours = startHour2.split(HOUR_SPLITER);
		String[] endHours = endHour2.split(HOUR_SPLITER);
		
		if(!hourValid(startHour2) || !hourValid(endHour2)
				|| (Integer.parseInt(endHours[0])-Integer.parseInt(starthours[0])) <= 0){
			return false;
		}
		
		return true;
	}
	/**
	 * �ж�ʱ���Ƿ�����
	 * @param hour
	 * @return
	 */
	private boolean hourValid(String hour) {
		
		String[] hours = hour.split(HOUR_SPLITER);
		
		if(hours.length < 2 || Integer.parseInt(hours[1]) != 0){
			return false;
		}
		return true;
	}
	
	public boolean equals(Order order) {
		
		return this.id.equals(order.id) && this.date.equals(order.date)
				&& this.startHour.equals(startHour) && this.endHour.equals(order.endHour)
				&& this.site.equals(order.site);
	}
	
	
	
//	==============setter/getter===============
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStartHour() {
		return startHour;
	}
	public void setStartHour(String startHour) {
		this.startHour = startHour;
	}
	public String getEndHour() {
		return endHour;
	}
	public void setEndHour(String endHour) {
		this.endHour = endHour;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	

}
