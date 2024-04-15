import java.util.Scanner;
public class Problem3 {


	public static void main(String[] args) { 
		int a[][]=new int[3][];
		Scanner scan=new Scanner(System.in);
		 a[0]=new int[4];
		 a[1]=new int[2];
		 a[2]=new int[5];
		 for(int i=0;i<3;i++) {
			 for(int j=0;j<a[i].length;j++) {
				 a[i][j]=scan.nextInt();
			 }
		 }
		 for(int i=0;i<3;i++) {
			 for(int j=0;j<a[i].length;j++) {
				 System.out.println(a[i][j]);
			 }
			 System.out.println();
			 
		 }
	}

}
