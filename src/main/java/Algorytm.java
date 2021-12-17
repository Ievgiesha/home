import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Algorytm {
    public static void main(String[] args) {
       /* String str = "jdbviddjkkkkkeorf";
        char[] charArray = str.toCharArray();
        HashMap<String, Integer> result = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int sum = 0;
            for (int j = 0; j < str.length(); j++) {
                if (charArray[j] == charArray[i]) {
                    sum++;
                }
                if (j == str.length() - 1) {
                    result.put(Character.toString(charArray[i]), sum);
                }
            }
        }
        result.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }*/
        topCharsInString("aabcdefghh");
    }

        public static void topCharsInString(String s){
            HashMap<String, Integer> map = new HashMap<>();
            String[] letters = s.split("");

            for (String letter:letters){
                map.putIfAbsent(letter,0);
                map.put(letter, map.get(letter)+1);
            }

            map.entrySet()
                    .stream()
                    .sorted((a,b) -> b.getValue().compareTo(a.getValue()))
                    .forEach(a -> System.out.println(a.getKey().toString()+" "+a.getValue().toString()));
        }

}