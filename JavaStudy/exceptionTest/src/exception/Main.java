package exception;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try {
			int n[] = {18, 29, 36};

			System.out.println("開始します");

			for (int i = 0; i < 4; i++){
			  System.out.println(n[i]);
			}
		}

		catch(ArrayIndexOutOfBoundsException e){
				  System.out.println("配列の範囲を超えています");
		}

		System.out.println("終了しました");
	}

}
