package experiment3;

public class Course {
	String courseID;
	String courseName;
	int credit;
	String teacher;
	Course() { //Ĭ�ϵĹ�����
		courseID="";
		courseName="";
		credit=0;
		teacher="";
	}													
	Course(String courseID){ //�������Ĺ�����
		this.courseID=courseID;
		courseName="";
		credit=0;
		teacher="";
	}
	Course(String courseID, String courseName){//���������Ĺ�����
		this.courseID=courseID;
		this.courseName=courseName;
		credit=0;3
		teacher="";
	}
	Course(String courseID, String courseName, int credit){ //���������Ĺ�����
		Course c=new Course(courseID,courseName);
		this.courseID=c.courseID;
		this.courseName=c.courseName;
		this.credit=credit;
	}
	/*Course(String courseID, String courseName, int credit){ //���������Ĺ�����
		Course c=new Course(courseID,courseName,credit,"");
		this.courseID=c.courseID;
		this.courseName=c.courseName;
		this.credit=c.credit;
	}*/
	Course(String courseID, String courseName, int credit, String teacher){	//�ĸ������Ĺ�����
		this.courseID=courseID;
		this.courseName=courseName;
		this.credit=credit;
		this.teacher=teacher;
	}

	}

}

