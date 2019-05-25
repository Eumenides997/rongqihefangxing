package 容器与泛型作业_4;

import java.util.LinkedList;

public class dl {
	
	private LinkedList<Object> link=new LinkedList<Object>();
	
	public void in(Object s) {
		link.addFirst(s);
	}
	
	public Object out() {
		return link.removeLast();
	}
	
	public int size() {
		return link.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dl d=new dl();
		d.in("c1");
		d.in("c2");
		d.in("c3");
		
		while(d.size()!=0) {
			System.out.println(d.out());
		}

		System.out.println("------------------------------");
		
		d.in("c4");
		d.in("c5");
		d.in("c6");

		while(d.size()!=0) {
			System.out.println(d.out());
		}
	}

}
