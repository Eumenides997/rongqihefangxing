package 容器与泛型作业_4;

import java.util.LinkedList;

public class zd {
	
	private LinkedList linkedList=new LinkedList();
	
	public void push(Object s) {//进栈
		linkedList.addFirst(s);
	}

	public Object pop() {//出栈
		Object s=linkedList.getFirst();
		linkedList.removeFirst();
		return s;
	}
	
	public int size() {//栈大小
		return linkedList.size();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		zd z=new zd();
		z.push("c1");
		z.push("c2");
		z.push("c3");
		
		while(z.size()!=0) {
			System.out.println(z.pop());
		}
		System.out.println("---------------------------");
		z.push("c4");
		z.push("c5");
		z.push("c6");
		while(z.size()!=0) {
			System.out.println(z.pop());
		}

	}

}
