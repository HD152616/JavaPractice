/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 * 		|_ DBTest
 * 1. 개요 :  
 * 2. 작성일 : 2017. 5. 25. 
 * </pre>
 * @author		: 변은서
 * @version		: 1.0
 */
public class DBTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		System.out.println("< 변경 전 >");
		crub(IDBManager.getDBObject(IDBManager.SYBASE_DATABASE));
		System.out.println("\n< 변경 후 >");
		crub(IDBManager.getDBObject(IDBManager.ORACLE_DATABASE));

	}
	private static void crub(IDBManager db)
	{
		db.insert();
		db.search();
		db.update();
		db.delete();
	}
}

