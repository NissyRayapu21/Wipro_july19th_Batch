package Class31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public  class ComSubClsEmp implements Comparator<EmpCompara>{
	
    public int compare(EmpCompara e1,EmpCompara e2) {
    	
    	return e1.name.compareTo(e2.name);//ascending
    	//descending e2,e1
   	
    }
	public static void main(String[] args) {
		List<EmpCompara> emp = new ArrayList<>();
		emp.add(new EmpCompara (103,"A"));
		emp.add(new EmpCompara (102,"D"));
		emp.add(new EmpCompara (101,"C"));
		emp.add(new EmpCompara (104,"B"));
		
		Collections.sort(emp,new ComSubClsEmp());
		for(EmpCompara e:emp) {
			System.out.println(e);
			
		}
	}
	


}
