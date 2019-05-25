package 容器与泛型作业_5;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class arraylisttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("unchecked")
		List<student> list=new ArrayList<student>((Collection<? extends student>) new Comparator<student>() {

			@Override
			public int compare(student o1, student o2) {
				// TODO Auto-generated method stub

				//从大到小
				
				return 0;
			}
			
		});

	}

}
