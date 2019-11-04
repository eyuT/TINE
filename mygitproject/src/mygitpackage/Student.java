package mygitpackage;

public class Student {
	int id;
	String name;
	public void setName(String name) {
		this.name=name;
		
	}
	public void setId(int id) {
		this.id=id;
	
	}
	public String getName() {
		return this.name;
		
	}
   public int getId() {
	   return this.id;
   }
   public void display() 
   {
	   System.out.println("name "+this.name +"id "+this.id);
   }

   }
