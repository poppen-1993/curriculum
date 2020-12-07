package check;

import constants.Constants;

public class Check {
	// 課題① フィールド変数の宣言と初期化
	private static String firstName = "酒井";
	private static String lastName = "優";
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 課題② 名前連結メソッド
		System.out.println("printNameメソッド → " + printName(firstName, lastName));
		
		// 課題③ インスタンス化
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		
		RobotPet robo = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robo.introduce();
	}
	
	// 課題② 名前連結メソッド
	private static String printName(String firstName, String lastName) {
		return firstName + lastName;
	}

}
