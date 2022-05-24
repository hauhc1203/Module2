package treeMap;

import java.util.Locale;
import java.util.Map;

public class TreeMap {
    public  static  Map.Entry coTrongMap(String key, Map<String,Integer> map,Map.Entry entry1){

        for (Map.Entry< String,Integer> entry : map.entrySet()) {
            String key1 = entry.getKey();
            if (key.equals(key1)) {
                entry1=entry;
                return entry1;
            }
        }
        return entry1;
    }

    public static void main(String[] args) {
        String str=" d d d waa sadwfas wa ef aa aw wq aa a a a a a a a a  a a  dsgs hdh jtkghc k hj rhh xin chao haha haha haha haha xin xin chao xin haha     ";
        Map<String,Integer> map=new java.util.TreeMap<>();
        int start=0;
        int end=0;

        Map.Entry<String,Integer> entry2 = null;

        for (int i = 0; i <str.length()-1 ; i++) {
            if(str.charAt(i)==' '&& str.charAt(i+1)!=' '){
                start=i+1;
            }
            if (str.charAt(i)!=' '&& str.charAt(i+1)==' '){
                end=i+1;
            }
            if (start!=0&&end!=0){
                String key=str.substring(start,end);
                entry2=coTrongMap(key,map,entry2);
                if (entry2==null){
                    map.put(key,1);
                }else {
                    entry2.setValue(entry2.getValue() + 1);
                    entry2=null;
                }
                start=0;
                end=0;
            }
        }
        for (Map.Entry< String,Integer> entry : map.entrySet()) {
            String key = entry.getKey().toUpperCase(Locale.ROOT);
            Integer value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
