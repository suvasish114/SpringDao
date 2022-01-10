/* Simple sequence POJO class with constructor and getter and setters
 * */

package com.example.SpringDao;

public class Sequence {
	
	// private fields
	private String id;
	private String prefix;
	private String suffix;
	
	// constructors
	public Sequence() {}
	public Sequence(String id, String prefix, String suffix) {
		this.id = id;
		this.prefix = prefix;
		this.suffix = suffix;
	}
	
	// getters and setters
	public String getInitial() {
		return id;
	}
	public void setInitial(String id) {
		this.id = id;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
}
