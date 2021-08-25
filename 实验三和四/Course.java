package 实验三;

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
	void Course(String courseID, String courseName){//两个参数的构造器
		this.courseID=courseID;
		this.courseName=courseName;
		credit=0;3
		teacher="";
	}
	Course(String courseID, String courseName){
		Course(courseID,courseName);
	}
	Course(String courseID, String courseName, int credit)
	{
		Course(courseID,courseName);
		Course(courseID,courseName,credit,"");
	}
	void Course(String courseID, String courseName, int credit, String teacher){	//四个参数的构造器
		this.courseID=courseID;
		this.courseName=courseName;
		this.credit=credit;
		this.teacher=teacher;
	}
	Course(String courseID, String courseName, int credit, String teacher){
		Course(courseID,courseName,credit,teacher);
	}

}

