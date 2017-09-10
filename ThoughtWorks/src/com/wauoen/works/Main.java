package com.wauoen.works;

import java.util.Scanner;
/**
 * TODO Ê±¼ä³åÍ»
 * @author wauoen
 *
 */
public class Main {
	
	public static void main(String[] args){
		
		Scanner sc =new Scanner(System.in);
		Manager manager = new Manager();
		while(true){
			String line = sc.nextLine();
			manager.handleOrder(line);
		}
	}

}
