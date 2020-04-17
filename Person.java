import java.util.*;
public class Person {
	//Fields
	private String name;
	private String mom;
	private String dad;
	private ArrayList<String> children;
	//constructor
	public Person(String name) {
		this.name = name;
		children = new ArrayList<String>();
	}
	//getters, setters
	public String getName() {
		return name;
	}
	public String getMom() {
		return mom;
	}

	public void setMom(String mom) {
		this.mom = mom;
	}

	public String getDad() {
		return dad;
	}

	public void setDad(String dad) {
		this.dad = dad;
	}
	//I made Children a ArrayList since there could be more than one.
	public ArrayList<String> getChildren() {
		return children;
	}

	public void setChildren(String child) {
		children.add(child);
		
	}
	
}
