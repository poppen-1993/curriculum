package Study;

public class throwMain {

	private static final String CONST_ROPPONGI_HILLS = "六本木ヒルズ";
	private static final String CONST_IMPERIAL_HOTEL = "帝国ホテル";

	public static void main(String args[]) {

		String hogeOffice = "aaaa";

		try {

			// オフィスが間違ってたら意図的に例外を発生させる
			if (hogeOffice.equals(CONST_IMPERIAL_HOTEL)) {
				throw new Exception("オフィスは帝国ホテルだよ。");
			}

			// 例外でthrowされた以降の処理は実行されない
			System.out.println("hogeのオフィスは" + CONST_IMPERIAL_HOTEL + "です。");
		} catch (NullPointerException e)  {
			throw new NullPointerException("ヌルポ　ガッ！");
		} catch (Exception hogehoge) {
			System.out.println("オフィスが間違ってます。");
			System.out.println(hogehoge);
		}
	}
}