package 容器与泛型作业_3;

import java.util.HashMap;
import java.util.Random;

public class test_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		候选人 s1=new 候选人("zhangsan","c1");
		候选人 s2=new 候选人("lisi","c2");
		候选人 s3=new 候选人("wanwu","c3");
		
		HashMap<候选人,String> m=new HashMap<候选人,String>();
		
		int num1=0,num2=0,num3=0;
		String str1[]=new String[10];
		String str2[]=new String[10];
		int ten_1[]=new int[10];
		int ten_2[]=new int[10];
		System.out.println("------------十个人随机投票---------------");
		for(int i=0;i<10;i++) {
			ten_1[i]=new Random().nextInt(4-1)+1;
			ten_2[i]=new Random().nextInt(4-1)+1;
			while (ten_1[i]==ten_2[i]) {
				ten_2[i]=new Random().nextInt(4-1)+1;
			}
			if(ten_1[i]==1) {
				str1[i]="c1";
			}
			if(ten_1[i]==2) {
				str1[i]="c2";
			}
			if(ten_1[i]==3) {
				str1[i]="c3";
			}
			if(ten_2[i]==1) {
				str2[i]="c1";
			}
			if(ten_2[i]==2) {
				str2[i]="c2";
			}
			if(ten_2[i]==3) {
				str2[i]="c3";
			}
			System.out.println(str1[i]+" "+str2[i]);
		}
		for(int i=0;i<10;i++) {
		}
		System.out.println("-------------候选人得票情况--------------");

	}

}
