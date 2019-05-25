package 容器与泛型作业_6;

import java.util.HashSet;
import java.util.Set;

class lei{
	public String n;
	
	public lei(String n) {
		this.n=n;
	}
	
	public String getn() {
		return n;
	}
	
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		lei l = (lei) o;
		return n.equals(l.n);
	}
	
	public int hashCode() {
		return n.hashCode();
		}
		
}

public class text_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*HashSet不能添加重复的元素，当调用add（Object）方法时候，
                  首先会调用Object的hashCode方法判hashCode是否已经存在，如不存在则直接插入元素；
                  如果已存在则调用Object对象的equals方法判断是否返回true，如果为true则说明元素已经存在，如为false则插入元素。
        */

		lei l1=new lei("c1");
		lei l2=new lei("c1");
		lei l3=new lei("c2");
		lei l4=new lei("c3");
		lei l5=new lei("c4");
		
		Set<lei> l=new HashSet<lei>();
		l.add(l1);
		l.add(l2);
		l.add(l3);
		l.add(l4);
		l.add(l5);
		
		l.forEach(String->System.out.println(String.getn()));
		
		/*这是没有添加hashcode和equals的输出情况
		c1
		c4
		c1
		c2
		c3
		*/
		
		/*这是改造完lei类后的输出情况
		c3
		c4
		c1
		c2
		*/

	}

}
