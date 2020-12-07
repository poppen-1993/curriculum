package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//メソッド		説明							記述例
//add		リストに値を追加					list.add(1)
//addAll	リストにリストを追加				list1.add(list2)
//set		リストの値を変更					list.set(0, 3)
//get		リストの値を取得					list.get(0)
//size		リストの要素数を取得				list.size()
//indexOf	リストから値の要素番号を取得		list.indexOf("a")
//subList	リストから範囲を指定してコピー			subList(1, 3)
//contains	リストに値が含まれるか判定			list.contains("a")
//remove	リストから指定する要素番号の値を削除	list.remove(1);
//distinct	リストで重複する値を削除			list.stream().distinct()
//clone		リストのコピー					list.clone()

public class Main {
 
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("item1", "item2", "item3"));
        
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
  
}