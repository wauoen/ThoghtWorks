package com.wauoen.works;

/**
 * 计算订单价格的策略接口
 * @author wauoen
 *
 */
public interface OrderPriceStrategy {

	/**
	 * 计算订单价格
	 * @param order
	 * @return
	 */
	public int price(Order order);
}
