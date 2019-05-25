package 容器与泛型作业_5;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arraylisttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<student> list=new ArrayList<student>();

		list.add(new student("c1","zhangsan",101));
		list.add(new student("c4","niuliu",98));
		list.add(new student("c2","lisi",100));
		list.add(new student("c3","wanwu",99));
		Collections.sort(list);
		Iterator<student> it=list.iterator();
		while(it.hasNext()) {
			student st=(student)it.next();
			System.out.println(st.getSname()+" "+st.getSno()+" "+st.getSacount());
		}

	}

}
