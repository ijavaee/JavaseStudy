import java.util.Scanner;
public class GuessLotteryNumber {
	public static void main(String[] args) {
		/*
		 * 随机生成一个两位数彩票，顺序和值一样10000美元， 
		 * 值对顺序不对3000元，满足顺序只猜中一个数字1000元 
		 * 顺序不对，一个数字对奖励500元
		 *啥也不对，无奖励 
		 */
		
		//获取用户输入的值
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你猜的两位数");
		int guessNumber = sc.nextInt(); 
		
		//生成两位随机数  10——99 
		//当随机两数是[a,b]，可用公式  int num =(int)(Math.Random()*(b-a+1)+a) 
		int lotteryNumber = (int) (Math.random()*(90+1)+10);
		
		System.out.println("正确数是："+lotteryNumber);
		//判断十位和个位相等
		if(guessNumber /10 == lotteryNumber/10||guessNumber %10 ==lotteryNumber%10) {
			System.out.println("你猜对了，奖励10000美元");
		}else if(guessNumber /10 ==lotteryNumber%10 &&guessNumber %10 ==lotteryNumber/10) {
			System.out.println("你猜对了两个数字，但顺序不对奖励3000美元");
		}
		else if(guessNumber/10==lotteryNumber/10||guessNumber%10==lotteryNumber%10||guessNumber /10 ==lotteryNumber%10||guessNumber %10 ==lotteryNumber/10) {
			System.out.println("你猜对了一个数字但顺序不对，奖励500美元");
		} else {
			System.out.println("很遗憾，你没有猜对");
		}
		
		
	}
}