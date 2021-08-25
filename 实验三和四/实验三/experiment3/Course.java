package experiment3;

public class Course {
	String courseID;
	String courseName;
	int credit;
	String teacher;
	Course() { //默认的构造器
		courseID="";
		courseName="";
		credit=0;
		teacher="";
	}													
	Course(String courseID){ //单参数的构造器
		this.courseID=courseID;
		courseName="";
		credit=0;
		teacher="";
	}
	Course(String courseID, String courseName){//两个参数的构造器
		this.courseID=courseID;
		this.courseName=courseName;
		credit=0;3
		teacher="";
	}
	Course(String courseID, String courseName, int credit){ //三个参数的构造器
		Course c=new Course(courseID,courseName);
		this.courseID=c.courseID;
		this.courseName=c.courseName;
		this.credit=credit;
	}
	/*Course(String courseID, String courseName, int credit){ //三个参数的构造器
		Course c=new Course(courseID,courseName,credit,"");
		this.courseID=c.courseID;
		this.courseName=c.courseName;
		this.credit=c.credit;
	}*/
	Course(String courseID, String courseName, int credit, String teacher){	//四个参数的构造器
		this.courseID=courseID;
		this.courseName=courseName;
		this.credit=credit;
		this.teacher=teacher;
	}

	}

}

