package data_structor;

import java.io.IOException;

public class POSTester {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		ProgramOfStudy pos=new ProgramOfStudy();
		pos.addCourse(new Course("cs", 101, "Introduction to Programming","A-"));
		pos.addCourse(new Course("arch", 305, "Building analysis","A"));
		pos.addCourse(new Course("ger", 210, "intermediate german"));
		pos.addCourse(new Course("cs", 320, "computer architecture"));
		pos.addCourse(new Course("the", 201, "the theatre experiance"));
		Course arch=pos.find("cs", 320);
		pos.addCourseAfter(arch, new Course("cs", 321, "operating system"));
		Course theatre=pos.find("the", 201);
		theatre.setGrade("A-");
		Course german=pos.find("ger", 210);
		pos.replace(german,new Course("fre", 110, "beginning french", "b+"));
		System.out.println(pos);
		pos.save("programmOfStudy");
	}

}
