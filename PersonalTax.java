import java.util.Scanner;

public class PerssonalTax {
	public static void main(String[] args) {
		// 定义个人税收
		double tax = 0;
		// 计算个人所得税
		Scanner sc = new Scanner(System.in);
		// 获取用户输入收入
		System.out.println("请输入你的收入：");
		int x = sc.nextInt();

		if (x < 800) {

		} else if (x < 1300) { // 800<x<1300
			tax = (x - 800) * 0.05;
//			System.out.println("你的收入是:" + x + "应征税为：" + tax);
		} else if (x < 2800) { // 1300<x<2800
			tax = (x - 800) * 0.1;
//			System.out.println("你的收入是:" + x + "应征税为：" + tax);
		} else if (x < 5800) { // 2800<x<5800
			tax = (x - 800) * 0.15;
//			System.out.println("你的收入是:" + x + "应征税为：" + tax);
		} else if (x < 28000) { // 2800<x<28000
			tax = (x - 800) * 0.2;
//			System.out.println("你的收入是:" + x + "应征税为：" + tax);
		} else {
			tax = (x - 800) * 0.3; // x> 28000
//			System.out.println("你的收入是:" + x + "应征税为：" + tax);
		}
		System.out.println("你的收入是:" + x + "应征税为：" + tax); //一个程序出口

	}

}
