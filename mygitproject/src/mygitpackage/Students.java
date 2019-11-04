package mygitpackage;

public class Students {
	int id;
	String name;
	public void setNames(String name) {
		this.name=name;
		
	}
	public void setIds(int id) {
		this.id=id;
	
	}
	public String getNames() {
		return this.name;
		
	}
   public int getIds() {
	   return this.id;
   }
   public void display() 
   {
	   System.out.println("name "+this.name +"id "+this.id);
   }

   }
