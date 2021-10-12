import java.util.Scanner;
public class SwitchCaseTest {
	public static void main(String[] args) {
		//获取用户输入，输出一二三对应英文，其他值输出其他
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字");
		int num = sc.nextInt();
		switch(num) {
		case 0:
			System.out.println("zero");
			break;
		case 1 :
			System.out.println("one");
			break;
		case 2 :
			System.out.println("two");
			break;
		case 3 :
			System.out.println("three");
			break;
		default:
			System.out.println("其他");
		}
		
	}

}