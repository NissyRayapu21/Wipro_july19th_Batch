package lab24july;

abstract class Student {
	    String name;
	    int rollNo;

	    Student(String name, int rollNo) {
	        this.name = name;
	        this.rollNo = rollNo;
	    }
	    
//
	    abstract String getGrade(int marks);
	}
//sub1
	class EngStu extends Student {
	    EngStu(String name, int rollNo) {
	     super(name, rollNo);
	     
	    }

	    @Override
	    String getGrade(int marks) {
	        if (marks >= 85) return "A";
	        else if (marks >= 70) return "B";
	        else if (marks >= 50) return "C";
	        else return "Fail";
	    }
	}
//sub2
	class MedStu extends Student {
	    MedStu(String name, int rollNo) {
	        super(name, rollNo);
	    }

	    @Override
	    String getGrade(int marks) {
	        if (marks >= 80) return "A";
	        else if (marks >= 65) return "B";
	        else if (marks >= 50) return "C";
	        else return "Fail";
	    }
	}



