import java.io.IOException;
import java.util.Scanner;

public class LowerToUpper  {
	//小写字母转大写字母  by杨文胜
	public static void main(String[] args) throws IOException {
		boolean flag = true;
		while(flag) {	
			System.out.println("请输入小写字母：");
			int num1 = System.in.read();
			//a 97  A 65  差32
			char zimu_1 = (char)num1;
			char zimu_2 = (char)(num1-32);
			System.out.println("你输入的字母是:"+zimu_1+"它的大写字母为"+zimu_2);
			//判断是否继续使用此程序
			System.out.println("");
			System.out.println("是否退出程序(true/false)" );
			Scanner sc = new Scanner(System.in);
			boolean f = sc.nextBoolean();
			
			if(f==true) {
				flag=false;
				System.out.println("程序已退出感谢您的使用");
			}else {
				continue;
			}	
		}
	}
