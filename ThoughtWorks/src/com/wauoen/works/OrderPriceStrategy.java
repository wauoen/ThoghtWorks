package com.wauoen.works;

/**
 * ���㶩���۸�Ĳ��Խӿ�
 * @author wauoen
 *
 */
public interface OrderPriceStrategy {

	/**
	 * ���㶩���۸�
	 * @param order
	 * @return
	 */
	public int price(Order order);
}
