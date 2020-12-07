package study;

public class TestStatic {
	int num1 = 0;
	static int num2 = 0;
	
	public void numPlus() {
		num1++;			//インスタンスとして生成された各インスタンスごとのnum1の値に対して+1している。
		num2++;			//クラスフィールドとしての唯一の変数num2に対して+1しているため、このメソッドが呼び出され、実行されつ旅にnum2が+1されていく。
		
		System.out.println("static無し:" + num1 );
		System.out.println("static有り：" + num2 );
	}
}