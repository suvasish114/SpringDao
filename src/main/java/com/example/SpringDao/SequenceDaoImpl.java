/* This class is responsible for generating dynamic values
 * @Component(String beanName) annotation marks the class, so that spring can make POJO s from it. 
 * */

package com.example.SpringDao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("sequenceDao")
public class SequenceDaoImpl  implements SequenceDao{
	
	// private map fields to generate data
	private Map<String, Sequence> sequences;
	private Map<String, Integer> values;
	
	// constructor
	public SequenceDaoImpl() {
		sequences = new HashMap<String, Sequence>();
		values = new HashMap<String, Integer>();
		sequences.put("IT", new Sequence("IT", "30", "A"));
		values.put("IT", 10000);
	}
	
	// implemented methods
	public Sequence getSequence(String id) {
		return sequences.get(id);
	}
	public int getNextValue(String id) {
		int value = values.get(id);
		values.put(id, value+1);
		return value;
	}
}
