import java.util.Scanner;

public class NeedRoom {
	public static void main(String[] args) {
		int expectClass = 0;
		int actualClass = 0;
		//获取用户输入所有信息
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入课程名称:");
		String courseName = sc.nextLine();
		
		System.out.print("请输入计划选修这门课的人数:");
		int expectNum = sc.nextInt();
		
		System.out.print("请输入实际选修这门课的人数:");
		int actualNumber = sc.nextInt();
		
		System.out.print("请输入每个实验室容纳的人数:");
		int labSize = sc.nextInt();
		
		//计算计划所需实训室
		if(expectNum%labSize==0) {
			expectClass= expectNum /labSize;
			
		} else {
			expectClass = expectNum /labSize;
			expectClass++;
		}
		
		//计算实际所需实训室
		if(actualNumber%labSize==0) {
			actualClass = actualNumber /labSize;
			
		} else {
			actualClass = actualNumber /labSize;
			actualClass++;
		}
		
		System.out.println("计划选修这门课的人数："+expectNum);
		System.out.println("实际选修这门课的人数："+actualNumber);
		System.out.println("计划选修这门课的人数："+labSize);
		System.out.println("计划所需实训室个数："+expectClass);
		System.out.println("实际选修这门课的人数："+actualClass);
	}
}