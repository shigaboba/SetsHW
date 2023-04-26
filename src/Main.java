import java.util.*;

public class Main {
    public static void printOdd(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.print(nums.get(i) + ", ");
            }
        }
        System.out.println("  ");
    }


    public static void printEven(List<Integer> nums) {
        List<Integer> nums1 = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0 && !nums1.contains(nums.get(i))) {
              nums1.add(nums.get(i));
            }
        }
        Collections.sort(nums1);
        System.out.println(nums1);
    }

    public static void printUnique(List<String> text) {
        HashSet<String> text1 = new HashSet<String>();
        for (String s : text) {
            text1.add(s);
        }
        System.out.println(text1);
    }

    public static void countDuplicates(List<String> text) {
        HashMap<String, Integer> text1 = new HashMap<String, Integer> ();
        for (String s : text) {
            if (text1.containsKey(s)) {
                text1.put(s, text1.get(s) + 1);
            }else {
                text1.put(s, 0);
            }
        }
        for (Map.Entry<String, Integer> s1: text1.entrySet()) {
            System.out.println("Строка " + s1.getKey() + ", кол-во дублей: " + s1.getValue());
        }
    }


    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        printOdd(nums);
        printEven(nums);
        List<String> text = new ArrayList<>(List.of("стук", "лес", "шаг", "лес", "дятел", "ствол", "стук", "синица", "жучок", "стук"));
        printUnique(text);
        countDuplicates(text);
    }
}