/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 		|_ SmartPhoneTest
 * 1. 개요 :  
 * 2. 작성일 : 2017. 5. 16. 
 * </pre>
 * @author		: 변은서
 * @version		: 1.0
 */
public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone[] s = {
				new IPhone("IPhone 7", "애플", 900000),
				new Galaxy("갤럭시 S8", "삼성", 800000)
		};
		for(SmartPhone i : s)
		{
			System.out.println(i);
			i.turnOn();
			i.pay();
			i.useSpecialFunction(i);
			i.turnOff();
		}
	}
	

}
