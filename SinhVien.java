package quanlysinhvien;

import java.io.Serializable;
public class SinhVien  implements Serializable{
	String id;
	String name;
	double score;
	String className;
	
	public SinhVien() {		
	}
	public SinhVien(String id, String name, double score, String className) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
		this.className = className;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	@Override
	public String toString() {
		return "SinhVien [id=" + id + " \tname=" + name + " \tscore=" + score + "  \tclassName=" + className + "]";
	}	 		
}
