//Vinh Nguyen, Jae Cho, Alex Larsen
//Team Project 1

//This class creates fields for a person's name and lineage (mom, dad, and children).
//It contains a Person constructor, as well as getters and setters for the fields

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
   
	//I made Children an ArrayList since there could be more than one.
   public ArrayList<String> getChildren() {
      return children;
   }

   public void setChildren(String child) {
      children.add(child);
   }
	
}
