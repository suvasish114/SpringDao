/* This class is Data Access Object 
 * This class is responsible for accessing data from the database
 * */
package com.example.SpringDao;

public interface SequenceDao {
	
	// loads a POJO or Sequence object from a database table by its ID
	public Sequence getSequence(String id);
	
	// retrieves the next value of a particular database sequence
	public int getNextValue(String id);
}
