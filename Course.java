package data_structor;
import java.io.Serializable;
public class Course implements Serializable{
	private String prefix;
	private int number;
	private String grade;
	private String title;
	public Course(String prefix,int number,String title,String grade) {
		this.prefix=prefix;
		this.number=number;
		this.title=title;
		if(grade==null)
			this.grade="";
		else
			this.grade=grade;
		
	}
	public Course(String prefix,int number,String title) {
		this(prefix, number, title,"");
	}
	public String getPrefix() {
		return prefix;
	}
	public int getNumber() {
		return number;
	}
	public String getTitle() {
		return title;
	}public String getGrade(String grade) {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade=grade;
	}
	public boolean taken() {
		return !grade.equals("");
	}
	public boolean equals(Object other) {
		boolean result=false;
		if(other instanceof Course) {
			Course otherCourse=(Course) other;
			if (prefix.equals(otherCourse.getPrefix())&&number==otherCourse.getNumber())
				result=true;	
		}
		return result;
	}
	public String toString() {
		String result=prefix+" "+number+": "+title;
		if(!grade.equals(""))
			result+=" ["+grade+"]";
		return result;
	}
}
