package mygitpackage;

public class MainClass {
	public void main(String [] args) {
Student obj=new Student();
obj.setName("Eyasu");
obj.setId(1234);
System.out.println("name :"+obj.getName()+ " id :"+obj.getId());
obj.display();
	}
}
