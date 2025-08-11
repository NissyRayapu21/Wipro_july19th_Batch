package Class25;

public class EncapEg {
	//private fields are hidden for outsiders
	
	private String name;
	private int age;
	
	//public getter for name
	
	public String getName() {
		return name;
	}
	// public getter for age
	
	public int getAge() {
		return age;
	}
    //public setter for name
	public void setName(String name) {
		this.name=name;
	}
	//public setter for age
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		EncapEg obj=new EncapEg();
		obj.setName("Nissy");
		obj.setAge(23);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());// TODO Auto-generated method stub

	}

}
