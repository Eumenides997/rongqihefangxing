package 容器与泛型作业_5;


public class student implements Comparable<student>{

	private String Sno;
	private String Sname;
	int Sacount;
	
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
	
	/*方法重写(学号从小到大排序)//删除注释即可使用*/
	@Override
	public int compareTo(student o) {
		// TODO Auto-generated method stub
		student p = (student)o;  
	      if(p.Sno.compareTo(Sno)>this.Sno.compareTo(Sno)){  
	     return -1;  
	      }  
	      else if(p.Sno.compareTo(Sno)<this.Sno.compareTo(Sno)){  
	     return 1;  
	      }  
	      else{  
	          return 0;  
	      }  
	}
	
	/*方法重写(从大到小排序)//删除注释即可使用
	@Override
	public int compareTo(student o) {
		// TODO Auto-generated method stub
		student p = (student)o;  
	      if(p.Sacount>this.Sacount){  
	     return 1;  
	      }  
	      else if(p.Sacount<this.Sacount){  
	     return -1;  
	      }  
	      else{  
	          return 0;  
	      }  
	}*/


}
