package mygitpackage;

public class MainClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students obj=new Students();
		obj.setNames("Eya");
		obj.setIds(1234);
		System.out.println("name :"+obj.getNames()+ " id :"+obj.getIds());
		obj.display();

	}

}
