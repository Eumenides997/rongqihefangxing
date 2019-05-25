package 容器与泛型作业_1;

import java.util.Iterator;
import java.util.TreeSet;

public class treesetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<student> ts=new TreeSet<student>();

		ts.add(new student("c1","zhangsan",100));
		ts.add(new student("c2","lisi",100));
		ts.add(new student("c3","wanwu",100));
		ts.add(new student("c4","niuliu",99));
		/*
		for(student s:ts) {
			System.out.println(s.getSno()+"-"+s.getSname()+"-"+s.getSacount());
		}
		*/
		Iterator it=ts.iterator();
		while(it.hasNext()) {
			student st=(student)it.next();
			System.out.println(st.getSname()+" "+st.getSno()+" "+st.getSacount());
		}

	}

}
