package cn.LJ.oop2;
/**
 * 测试多维数组
 * @author 李劲
 *
 */
public class Test_Array123 {
	/**
	 * 矩阵打印
	 * @param c
	 */
	public static void print(int[][] c) {
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++) {
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}
	/**
	 * 矩阵加法
	 * @param a
	 * @param b
	 * @return
	 */
	public static int[][] add(int[][] a,int[][] b) {
		int[][] c = new int[a.length][a.length];
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++) {
				c[i][j] = a[i][j] +  b[i][j];
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		/**
		 * 初始化
		 * int [][] a = {	//静态初始化
		 
				{1,2,3},
				{5,6,7},
				{8,9}
				};
		int[][] a1 = new int[3][];
		a1[0] = new int [3];
		a1[1] = new int [3];
		a1[2] = new int [2];
		a1[0][0] = 1;
		a1[0][1] = 2;
		a1[0][2] = 3;
		a1[1][0] = 5;
		a1[1][1] = 6;
		a1[1][2] = 7;
		a1[2][0] = 8;
		a1[2][1] = 9;
		*/
		
		int[][] a = {{1,3,4},{2,4,4},{4,7,9}};
		int[][] b = {{4,5,2},{6,7,4},{8,5,4}};
		int[][] c = add(a,b);
		print(c);
		
	}

}
