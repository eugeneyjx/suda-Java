package ʵ����;

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
	void Course(String courseID, String courseName){//���������Ĺ�����
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
	void Course(String courseID, String courseName, int credit, String teacher){	//�ĸ������Ĺ�����
		this.courseID=courseID;
		this.courseName=courseName;
		this.credit=credit;
		this.teacher=teacher;
	}
	Course(String courseID, String courseName, int credit, String teacher){
		Course(courseID,courseName,credit,teacher);
	}

}

