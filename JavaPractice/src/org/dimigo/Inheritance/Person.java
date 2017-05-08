/**
 * 
 */
package org.dimigo.Inheritance;

/**
 * <pre>
 * org.dimigo.Inheritance
 * 		|_ Person
 * 1. 개요 :  
 * 2. 작성일 : 2017. 5. 8. 
 * </pre>
 * @author		: 변은서
 * @version		: 1.0
 */
public class Person {
	
	private String name;
	public Person()
	{
		
	}
	public Person(String name)
	{
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "저는 " + name + "입니다.";
	}
	public void sayHello()
	{
		System.out.println("Hello");
	}
	public void sayBye()
	{
		System.out.println("Bye");
	}
	
}
