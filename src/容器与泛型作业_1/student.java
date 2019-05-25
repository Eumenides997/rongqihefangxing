package 容器与泛型作业_1;


public class student implements Comparable<student>{
	
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

	@Override
	public int compareTo(student o) {
		// TODO Auto-generated method stub
		int num=this.Sacount-o.Sacount;
		int num1= num==0?this.Sname.compareTo(o.Sname):num;
		return num1;
	}

}
