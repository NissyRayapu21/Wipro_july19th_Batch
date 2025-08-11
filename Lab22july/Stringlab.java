package Lab22july;

public class Stringlab {

	public static void main(String[] args) {
		
		String s1="Corejava";
		String s2="Selenium";
		
		//equals
		System.out.println(s1.equals(s2));
		
		//concat
		System.out.println(s1.concat(s2));
		
		//substring
		System.out.println(s1.substring(0));
		System.out.println(s1.substring(4, 5));
		
		//contains
		System.out.println(s1.contains("d"));
		
		//replace
		System.out.println(s1.replace("a", "z"));
		System.out.println(s1.replaceAll(s1,"Python"));
		
		//isEmpty
		System.out.println(s1.isEmpty());
		
		//ends with
		System.out.println(s1.endsWith("b"));
		System.out.println(s1.endsWith("a"));
		
		//joins
		String s3 = String.join("-","java","core");
		System.out.println(s3);
		
		//compare
		System.out.println(s2.compareTo(s3));
		
		//split
		String txt= "This is Java Selenium";
		String[] result=txt.split(" ");
		
		for(String st4:result) {
			System.out.println(st4+ ",");
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
