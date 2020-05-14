
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class NodeTree {

public static void main(String[] args) {
      String string1= "CodeGym he thong dao tao lap trinh vien chuyen nghiep".toLowerCase();
      Map<String,Integer> treeMap =new HashMap<String, Integer>();
   for (int i = 0; i <string1.length() ; i++) {
      //bien gia tri string.charAt(i) thanh chuoi
      String letter = String.valueOf(string1.charAt(i));

      if(!letter.equals(" ")){
         if(treeMap.containsKey(letter)){
            treeMap.put(letter,treeMap.get(letter)+1);
         }else {
            treeMap.put(letter,1);
         }
      }
   }
//   System.out.println(String.valueOf(treeMap));
   for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
      System.out.printf(entry.getKey() + "-" + entry.getValue()+"\t");
   }
}

}
