package study;

public class PolimoMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		PolimoSuper polimo1 = new PolimoSub1();
		polimo1.call();
		// サブクラス2でインスタンスを生成
		PolimoSuper polimo2 = new PolimoSub2();
		polimo2.call();
	}
}