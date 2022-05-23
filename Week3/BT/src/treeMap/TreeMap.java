package treeMap;

import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        String str="       xin chao haha haha haha haha xin xin chao xin haha     ";
        Map<String,Integer> map=new java.util.TreeMap<String, Integer>();
        int start=0;
        int end=0;
        int c=0;

        for (int i = 0; i <str.length()-1 ; i++) {
            if(str.charAt(i)==' '&& str.charAt(i+1)!=' '){
                start=i+1;
            }
            if (str.charAt(i)!=' '&& str.charAt(i+1)==' '){
                end=i+1;
            }
            if (start!=0&&end!=0){
                String key=str.substring(start,end);

                if (c==0){
                    map.put(key,1);
                    c++;
                }else {
                    for (Map.Entry< String,Integer> entry : map.entrySet()) {
                        String key1 = entry.getKey();
                        if(key.equals(key1)){
                            entry.setValue(entry.getValue()+1);
                            break;
                        }else {
                            map.put(key,1);
                        }
                    }
                }

                start=0;
                end=0;
            }
        }
        for (Map.Entry< String,Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " = " + value);
        }




    }




}
