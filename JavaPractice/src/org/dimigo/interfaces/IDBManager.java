/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 * 		|_ IDBManager
 * 1. 개요 :  
 * 2. 작성일 : 2017. 5. 25. 
 * </pre>
 * @author		: 변은서
 * @version		: 1.0
 */
public interface IDBManager {
	public static final String ORACLE_DATABASE = "ORACLE";
	public static final String SYBASE_DATABASE = "SYBACE";
	public void insert();
	public void search();
	public void update();
	public void delete();
	public static IDBManager getDBObject(String database)
	{
		if(database == ORACLE_DATABASE)
		{
			return new OracleDB();
		}
		else if(database == SYBASE_DATABASE)
		{
			return new SybaseDB();
		}
		
		return null;
	}

}
