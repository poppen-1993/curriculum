package List;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.HashMap;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// ArrayList使用
		ArrayList<String> array = new ArrayList<String> ();
		
		array.add("40");
		array.add("145");
		array.add("30");
		
		for(int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		
		for(String num: array) {
			System.out.println(num);
		}
		
		// LinkedListを使用
		LinkedList<String> linked = new LinkedList<>();
		
		linked.add("239");
		linked.add("256");
		linked.add("539");
 		
		for(String num: linked) {
			System.out.println(num);
		}
		
		// Listを使用。型としてInteger【int】を使用。あといろいろ省略。
		List<Integer> array2 = new ArrayList<>() {
			{
				add(22);
			}
		};
		
		System.out.println(array2.get(0));

		System.out.println("==============================");
		
		HashMap<String, String> hashMap = new HashMap<>();
		
		hashMap.put("JPN", "日本");
		hashMap.put("USA", "米国");
		hashMap.put("CHN", "中国");
		
		System.out.println("キー「JPN」:" + hashMap.get("JPN"));
		System.out.println("キー「USA」:" + hashMap.get("USA"));
		System.out.println("キー「CHN」:" + hashMap.get("CHN"));
		System.out.println("キー「RUS」:" + hashMap.get("RUS"));
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "値");

		// 正しい指定
		String strValue = map.get(1);
		System.out.println(strValue);
		// 誤った指定
		//String strValue = map.get("1");
	}

}
