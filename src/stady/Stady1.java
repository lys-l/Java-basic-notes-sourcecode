package stady;

import java.util.Scanner;

/**
 * Java����
 * 
 * @author NGU
 *
 */
public class Stady1 {

	public static void main(String[] args) {

		/*
		 * int a=0; outer:for(int i=100;i<2000;i++) { for(int j=2;j<i/2;j++) {
		 * if(i%j==0) { continue outer; } } System.out.print(i+"\t"); a++; if(a%5==0) {
		 * System.out.println(); } }
		 */

		/*
		 * int sum1=0; int sum2=0; for(int i=0;i<=100;i++) { if(i%2==0) { sum1+=i; }else
		 * sum2+=i; } System.out.println(sum1); System.out.println(sum2);
		 */

		/*
		 * int t=0; for(int i=1;i<=1000;i++) { if(i%5==0) { System.out.print(i+"\t");
		 * t++; if(t%5==0) { System.out.println(); } } }
		 */

		/*
		 * for(int j=1;j<10;j++) { for(int i=1;i<=j;i++) {
		 * System.out.print(i+"*"+j+"="+i*j+" "); } System.out.println(); }
		 */

		/*
		 * for(int i=1;i<=5;i++) { for(int j=1;j<=5;j++) { System.out.print(i+" "); }
		 * System.out.println(); }
		 */

		/*
		 * int sum=0; for(int i=0;i<=100;i++)//iֻ��for�������Ч sum=sum+i;
		 * System.out.println(sum);
		 */

		/*
		 * int i=0; int sum=0; while(i<=100) { sum=sum+i; i++; }
		 * System.out.println(sum);
		 */

		/*
		 * char c='a'; int rand=(int)(26*Math.random()); char c1=(char)(c+rand);
		 * System.out.println(c1+":"); switch(c1) { case 'a': case 'e': case 'i': case
		 * 'o': case 'u': System.out.println("Ԫ��"); break; case 'y': case 'w':
		 * System.out.println("��Ԫ��"); break; default: System.out.println("����"); }
		 */

		/*
		 * int month=1+(int)(12*Math.random()); System.out.println(month); switch(month)
		 * { case 1: System.out.println("����һ�·�"); break; case 2:
		 * System.out.println("���Ƕ��·�"); break; case 3: System.out.println("�������·�");
		 * break; case 4: System.out.println("�������·�"); break; case 5:
		 * System.out.println("�������·�"); break; case 6: System.out.println("�������·�");
		 * break; case 7: System.out.println("�������·�"); break; case 8:
		 * System.out.println("���ǰ��·�"); break; case 9: System.out.println("���Ǿ��·�");
		 * break; case 10: System.out.println("����ʮ�·�"); break; case 11:
		 * System.out.println("����ʮһ�·�"); break; case 12: System.out.println("����ʮ���·�");
		 * break; }
		 */

		/*
		 * double d= Math.random(); System.out.println(d); int i=
		 * (int)(6*Math.random())+1; int j= (int)(6*Math.random())+1; int k=
		 * (int)(6*Math.random())+1; int h=i+j+k; if(h<10) { System.out.println("����̫��");
		 * System.out.println("�÷�"+h); }else if(h<15) { System.out.println("����һ��");
		 * System.out.println("�÷�"+h); }else { System.out.println("����̫����");
		 * System.out.println("�÷�"+h); } System.out.println(i); System.out.println(j);
		 * System.out.println(k);
		 */

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("�������������");
			String name = scanner.nextLine();
			System.out.println("��������İ���");
			String favor = scanner.nextLine();
			System.out.println("�������������");
			int age = scanner.nextInt();
			System.out.println("########################");
			System.out.println(name);// ����������˫����ʱ��˫�������ԭ�����
			System.out.println(favor);
			System.out.println(age);
		}

		/*
		 * int a; int b; int c; int m; for(m=101;m<1000;m++) { a=m/100; b=m/10-a*10;
		 * c=m%10; if(a*a*a+b*b*b+c*c*c==m) System.out.println(m); }
		 */

		/*
		 * String a="3"; int b=4; int c=5; char d='a'; System.out.println(a+b+c);
		 * System.out.println(b+c+a); System.out.println(d+4);
		 */

		/*
		 * int score=80; int x=10; String type=score<60?"������":"����";
		 * System.out.println(type); if(score<60) { System.out.println("������"); }else {
		 * System.out.println("����"); } System.out.println(x>0?1:(x==0?0:8));
		 */

		/*
		 * double b3=22532425465326.677; System.out.println((int)b3);//����̫�󳬳�int��Χ int
		 * a=1000000000; int b=1000; int c=a*b;//����int��Χ�������� System.out.println(c);
		 * long d=a*b;//a*bʱ�Ѿ�������ٶ���longΪʱ���� System.out.println(d); long
		 * e=a*1000L;//��ʱǿ��ת�����ͣ���ֹ��� System.out.println(e);
		 */

	}
}
