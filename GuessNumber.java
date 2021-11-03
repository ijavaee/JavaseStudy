public class GuessNumber {
	public static void main(String[] args) {
		boolean isFlag = true;
		int count = 0;

		// 随机出1-100的值
		int realNum = (int) (Math.random() * (100 - 1 + 1) + 1);

		Scanner sc = new Scanner(System.in);

		while (isFlag) {
			// 获取用户输入
			System.out.println("请输入你猜的整数");
			int guessNum = sc.nextInt();
			count++;

			if (guessNum > realNum) {
				System.out.println("大了");
			} else if (guessNum < realNum) {
				System.out.println("小了");
			} else {
				System.out.println("恭喜你猜对了" + "共猜了" + count + "次");
			}
		}
	}
}