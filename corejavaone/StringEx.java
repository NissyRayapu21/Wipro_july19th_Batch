package corejavaone;

public class StringEx {

	public static void main(String[] args) {
		String s1 = "Hello World";
		System.out.println(s1);
		//2
		
		//3
		String s3 = new String ("hello");
		//equals
		
		String st1= "Chintu";
		String st2 ="Bunty";
		System.out.println(st1.equals(st2));
		System.out.println(st1.equalsIgnoreCase(st2));
		//concant
		
		System.out.println(st1.concat(st2));
		
		//contains
		System.out.println(st1.contains(st2));
		
		//substring
		System.out.println(st1.substring(3));
		System.out.println(st1.substring(1, 4));
		
		//replace
		System.out.println(st1.replace("C", "S"));
		System.out.println(st1.replaceAll(st1,"Mintu"));
		
		//ends with
		System.out.println(st2.endsWith("i"));
		
		//join
		String st3=String.join("-","Kumar","Chintu");
		
		System.out.println(st3);
		
		//split
		String tx="java is programming language";
		String[] result=tx.split(" ");
		
		for(String str: result) {
			System.out.println(str+",");
		}
		
		
		// TODO Auto-generated method stub

	}

}
