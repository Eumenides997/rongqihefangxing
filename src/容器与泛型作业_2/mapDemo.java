package 容器与泛型作业_2;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class mapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student s1=new student("zhangsan",18);
		student s2=new student("lisi",17);
		student s3=new student("wanwu",16);
		HashMap<student,String> m=new HashMap<student,String>();
		m.put(s1, "P1");
		m.put(s2,"P2");
		m.put(s3,"P3");
		Set<student> keyset=m.keySet();
		//keyset:
		for(student s:keyset) {
			System.out.println(s.getname()+" "+s.getage()+" "+m.get(s));
		}
		//entryset:
		Set<Entry<student, String>> entryset=m.entrySet();
		for(Entry<student, String> s:entryset) {
			System.out.println(s.getKey().getname()+" "+s.getKey().getage()+" "+s.getValue());
		}

	}

}
