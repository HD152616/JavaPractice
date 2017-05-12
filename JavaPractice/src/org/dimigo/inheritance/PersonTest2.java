/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.Inheritance
 * 		|_ PersonTest2
 * 1. 개요 :  
 * 2. 작성일 : 2017. 5. 12. 
 * </pre>
 * @author		: 변은서
 * @version		: 1.0
 */
public class PersonTest2 {

	
	public static void main(String[] args) {
		
		Person[] p = {
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("다나카"),
				new Chinese("왕밍"),
		};
		for(Person a : p)
		{
			greeting(a);
		}
	}
	private static void greeting(Person p)
	{
		System.out.println(p.toString());
		p.sayHello();
		p.sayBye();
		System.out.println();
	}

}
