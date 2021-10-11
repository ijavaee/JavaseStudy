import java.util.Scanner;
public class IsLove {
	//相亲，高富帅全满足就嫁了，只满足一个比上不足比下有余，都不满足不嫁
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的身高(cm)");
		int height = sc.nextInt();
		System.out.println("请输入你的存款(千万)");
		int wealth = sc.nextInt();
		System.out.println("你帅么(true/flase)");
		boolean isHandsome = sc.nextBoolean();
		
		
		if(height>=180&&wealth>=1&&isHandsome) {
			System.out.println("你很优秀，嫁了");
		}else if(height>=180||wealth>=1||isHandsome) {
			System.out.println("比上不足，比下有余，嫁了");
		}else {
			System.out.println("加油吧，不考虑了");
		}
	}
}
