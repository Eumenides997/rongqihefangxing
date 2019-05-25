package 容器与泛型作业_5;

public class student {
	

	private String Sno;
	private String Sname;
	private int Sacount;
	
	public student(String Sno,String Sname,int Sacount){
		super();
		this.Sno=Sno;
		this.Sname=Sname;
		this.Sacount=Sacount;
	}
	
	public void setSno(String Sno) {
		this.Sno=Sno;
	}
	
	public String getSno() {
		return Sno;
	}
	
	public void setSname(String Sname) {
		this.Sname=Sname;
	}
	
	public String getSname() {
		return Sname;
	}
	
	public void setSacount(int Sacount) {
		this.Sacount=Sacount;
	}
	
	public int getSacount() {
		return Sacount;
	}


}
