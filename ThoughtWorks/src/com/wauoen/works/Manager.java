package com.wauoen.works;

import java.util.ArrayList;
import java.util.List;

import com.wauoen.works.exception.OrderConflictsException;
import com.wauoen.works.exception.OrderInvalidException;
import com.wauoen.works.exception.OrderNotExistException;
import com.wauoen.works.log.Log;

/**
 * 管理员
 * @author wauoen
 *
 */
public class Manager {
	
	/**
	 * 订单列表
	 */
	private List<Order> mOrderList = new ArrayList<>();
	
	/**
	 * 添加订单
	 * @param order
	 */
	public boolean addOrder(Order order){
		
		return mOrderList.add(order);
	}
	
	/**
	 * 删除订单
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
	 * 判断订单是否存在
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
	 * 接收Order
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
	 * 取消订单
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
	 * 根据用户的输入处理订单信息
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
			//汇总
		} catch (OrderInvalidException e) {
			Log.log(e.toString());
		} catch (OrderConflictsException e) {
			Log.log(e.toString());
		} catch (OrderNotExistException e) {
			Log.log(e.toString());
		}
		
	}
	
	
	
	
	
	
	
	
	

}
