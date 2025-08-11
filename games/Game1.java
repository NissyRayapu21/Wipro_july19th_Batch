package games;

public class Game1 {
	String gname="Free Fire";
	int gid=123;
	String gtype="Online Gmae";
		
	
	void fetchgname() {
		System.out.println("Game name is :"+gname);
	}
	void fetchgnid() {
		System.out.println("Game id is :"+gid);
	}
	void fetchgtype() {
		System.out.println("Game type is :"+gtype);
	}
	

	public static void main(String[] args) {
		Game1 obj=new Game1();
		obj.fetchgname();
		obj.fetchgnid();
		obj.fetchgtype();
		
		
		// TODO Auto-generated method stub

	}

}
