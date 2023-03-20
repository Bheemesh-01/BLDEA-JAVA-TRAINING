package TrainingCodes;
/*
 *  # # # # #
 *  # # # # #
 *  # # # # #
 *  # # # # #
 *  # # # # #
 *  
 *  Capturing in Tabular format:
 *  
 *  rows(i)	hash(col--j)
 *     1		5
 *     2		5
 *     3		5
 *     4		5
 *     5		5
 */
//public class Program {
//	public static void main(String[] args) {
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print("# ");
//			}
//			System.out.println();
//		}
//	}
//}
/*
 * 1 1 1 1 1
 * 2 2 2 2 2
 * 3 3 3 3 3
 * 4 4 4 4 4
 * 5 5 5 5 5
 */
//public class Program {
//	public static void main(String[] args) {
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
//	}
//}
/*
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 */
//public class Program {
//	public static void main(String[] args) {
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//	}
//}
/*
 * 1	2	3	4	5
 * 6	7	8	9	10
 * 11	12	13	14	15
 * 16	17	18	19	20
 * 21	22	23	24	25
 */
//import java.util.Scanner;
//public class Program {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value of n:");
//		int n = sc.nextInt();
//		int count=1;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print(count+"	");
//				count++;
//			}
//			System.out.println();
//		}
//	}
//}
/*
 * 25 	24	23	22	21
 * 20	19	18	17	16
 * 15	14	13	12	11
 * 10	9	8	7	6	
 * 5	4	3	2	1
 */

//import java.util.Scanner;
//public class Program {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value of n:");
//		int n = sc.nextInt();
//		int count=n*n;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print(count+"	");
//				count--;
//			}
//			System.out.println();
//		}
//	}
//}

/*
 * 1	6	11	16	21
 * 2	7	12	17	22
 * 3	8	13	18	23
 * 4	9	14	19	24
 * 5	10	15	20	25
 */
//import java.util.Scanner;
//public class Program {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value of n:");
//		int n = sc.nextInt();
//		int count=1;
//		
//		for(int i=1;i<=n;i++) {
//			count=i;
//			for(int j=1;j<=n;j++) {
//				System.out.print(count+"	");
//				count=count+5;
//			}
//			System.out.println();
//		}
//	}
//}
/*
 * $
 * $ $ 
 * $ $ $
 * $ $ $ $
 * $ $ $ $ $
 * 
 * capturing in tabular form:
 * 
 * rows(i)	dollar(j)
 *    1			1
 *    2			2
 *    3			3
 *    4			4
 *    5			5
 */

//import java.util.Scanner;
//public class Program {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value of n:");
//		int n = sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("$ ");
//			}
//			System.out.println();
//		}
//	}
//}
/*
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4 
 * 5 5 5 5 5
 */

/*
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4 
 * 1 2 3 4 5
 */

//import java.util.Scanner;
//public class Program {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the age:");
//		int age = sc.nextInt();
//		
//		if(age > 65) {
//			System.out.println("Not eligible for marrriage because of over-age");
//		}
//		else if(age < 18) {
//			System.out.println("Not eligible for marrriage because of under-age");
//		}
//		else {
//			System.out.println("eligible for marrriage");
//		}
//	}
//}
/*
 * $ $ $ $ $ # # # # #
 * $ $ $ $ $ # # # # #
 * $ $ $ $ $ # # # # #
 * $ $ $ $ $ # # # # #
 * $ $ $ $ $ # # # # #
 */

//import java.util.Scanner;
//public class Program {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value of n:");
//		int n = sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print("$ ");
//			}
//			for(int j=1;j<=n;j++) {
//				System.out.print("# ");
//			}
//			System.out.println();
//		}
//	}
//}
/*
 * - $ $ $ $ $
 * - - $ $ $ $ $
 * - - - $ $ $ $ $
 * - - - - $ $ $ $ $
 * - - - - - $ $ $ $ $
 * 
 */
//import java.util.Scanner;
//public class Program {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value of n:");
//		int n = sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("- ");
//			}
//			for(int j=1;j<=n;j++) {
//				System.out.print("$ ");
//			}
//			System.out.println();
//		}
//	}
//}
/*
 * $ $ $ $ $
 * $ - - - $
 * $ - - - $
 * $ - - - $
 * $ $ $ $ $
 */
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n) {
					System.out.print("$ ");
				} 
				else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}
}
