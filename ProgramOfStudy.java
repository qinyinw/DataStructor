package data_structor;
import java.io.*;
import java.util.*;
public class ProgramOfStudy implements Iterable<Course>,Serializable {
	private List<Course> list;
	public  ProgramOfStudy() {
		// TODO Auto-generated constructor stub
		list=new LinkedList<Course>();
	}
	public void addCourse(Course course) {
		if (course!=null)
			list.add(course);
	}
	public Course find(String prefix,int number) {
		for (Course course:list)
			if(prefix.equals(course.getPrefix())&&number==course.getNumber())
				return course;
		return null;
	}
	
	@Override
	public Iterator<Course> iterator() {
		// TODO Auto-generated method stub
		return list.iterator();
	}
	public void addCourseAfter(Course target,Course newCourse) {
		if(target==null||newCourse==null)
			return;
		int targetIndex=list.indexOf(target);
		if(targetIndex!=-1)
			list.add(targetIndex+1, newCourse);
	}
	public void replace(Course target,Course newCourse) {
		if(target==null||newCourse==null)
			return;
		int targetIndex=list.indexOf(target);
		if(targetIndex!=-1)
			list.set(targetIndex, newCourse);
	}
	public String toString() {
		String result="";
		for(Course course:list)
			result+=course+"\n";
		return result;
	}
	public void save(String fileName) throws IOException{
		FileOutputStream fos=new FileOutputStream(fileName);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(this);
		oos.flush();
		oos.close();
		
	}
	public static ProgramOfStudy load(String fileName) throws IOException,ClassNotFoundException{
		FileInputStream fis=new FileInputStream(fileName);
		ObjectInputStream ois=new ObjectInputStream(fis);
		ProgramOfStudy pos=(ProgramOfStudy) ois.readObject();
		ois.close();
		return pos;
	}
}
