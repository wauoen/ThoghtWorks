package com.wauoen.works;

import java.util.ArrayList;
import java.util.List;

import com.wauoen.works.exception.OrderConflictsException;
import com.wauoen.works.exception.OrderInvalidException;
import com.wauoen.works.exception.OrderNotExistException;
import com.wauoen.works.log.Log;

/**
 * ����Ա
 * @author wauoen
 *
 */
public class Manager {
	
	/**
	 * �����б�
	 */
	private List<Order> mOrderList = new ArrayList<>();
	
	/**
	 * ��Ӷ���
	 * @param order
	 */
	public boolean addOrder(Order order){
		
		return mOrderList.add(order);
	}
	
	/**
	 * ɾ������
	 * @param order
	 */
	public boolean removeOrder(Order order){
		
		int size = mOrderList.size();
		for (int i = 0; i < size; i++) {
			if(mOrderList.get(i).equals(order)){
				 mOrderList.remove(i);
				 return true;
			}
		}
		
		return false;
	}
	
	/**
	 * �ж϶����Ƿ����
	 * @param order
	 */
	public boolean isOrderExisted(Order order){
		
		for (Order item : this.mOrderList) {
			
			if(order.equals(item)){
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * ����Order
	 * @param order
	 * @throws OrderInvalidException 
	 * @throws OrderConflictsException 
	 */
	public void acceptOrder(Order order) throws OrderInvalidException, OrderConflictsException{
		if (isOrderExisted(order)) {
			throw new OrderConflictsException();
		}else if(addOrder(order)){
			Log.orderAccepted();
		}
	}
	
	/**
	 * ȡ������
	 * @param order
	 * @throws OrderInvalidException
	 * @throws OrderNotExistException
	 */
	public void cancelOrder(Order order) throws OrderInvalidException, OrderNotExistException{
		if(!isOrderExisted(order)){
			throw new OrderNotExistException();
		}else if(removeOrder(order)){
			Log.orderAccepted();
		}
	}
	
	
	/**
	 * �����û������봦������Ϣ
	 * @param content
	 */
	public void handleOrder(String content){
		
		try {
			Order order = new Order(content);
			if(order.getType() != null && order.getType().equals(Order.CANCEL_FLAG)){
				cancelOrder(order);
			}else {
				acceptOrder(order);
			}
			//����
		} catch (OrderInvalidException e) {
			Log.log(e.toString());
		} catch (OrderConflictsException e) {
			Log.log(e.toString());
		} catch (OrderNotExistException e) {
			Log.log(e.toString());
		}
		
	}
	
	
	
	
	
	
	
	
	

}
