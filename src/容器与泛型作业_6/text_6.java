package �����뷺����ҵ_6;

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
		
		/*HashSet��������ظ���Ԫ�أ�������add��Object������ʱ��
                  ���Ȼ����Object��hashCode������hashCode�Ƿ��Ѿ����ڣ��粻������ֱ�Ӳ���Ԫ�أ�
                  ����Ѵ��������Object�����equals�����ж��Ƿ񷵻�true�����Ϊtrue��˵��Ԫ���Ѿ����ڣ���Ϊfalse�����Ԫ�ء�
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
		
		/*����û�����hashcode��equals��������
		c1
		c4
		c1
		c2
		c3
		*/
		
		/*���Ǹ�����lei����������
		c3
		c4
		c1
		c2
		*/

	}

}
