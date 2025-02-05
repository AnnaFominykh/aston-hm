import java.util.LinkedHashSet;
import java.util.Set;

public class Homework {

    private static String string1;
    private static int[] int1;

    // Перевернуть строку и вывести на консоль
    //  String string = "I love Java";
    public static void turnString(String string) {
        string = "I love Java";
        string1 = string;
        StringBuilder builder = new StringBuilder(string1);
        builder.reverse();
        String reverse = builder.toString();
        System.out.println(reverse);
    }

    // int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
    // Удалить дубликаты из массива и вывести в консоль
    public static void getDistinctNumbers(int[] ints) {

        ints = new int[]{1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
        int1 = ints;
        Set<Integer> set = new LinkedHashSet<Integer>();
        for(int i=0;i<int1.length;i++){
            set.add(int1[i]);
        }

    }


    // Дан массив, заполненный уникальными значениями типа int.
    // int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
    // Необходимо найти элемент, который меньше максимума, но больше всех остальных.
    public static Integer findSecondMaxElement(int[] arr) {
        arr = new int[]{10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
        int1 = arr;
        int max2=int1[0], max=int1[0];
        for(int i=0;i<int1.length;i++){
            if(int1[i]>max){
                max2 = max;
                max = arr[i];
            }
            else if (int1[i]<max & int1[i]!=max){
                max2 = int1[i];
            }
        }
        System.out.println(max2);
        return null;
    }

    // Найти длину последнего слова в строке. В строке только буквы и пробелы.
    // "Hello world" - 5
    // "    fly me    to the moon    " - 4
    public static Integer lengthOfLastWord(String string) {
        if (string == null || string.isEmpty()) {
            return null;
        }

        String trimmedString = string.trim();
        if (trimmedString.isEmpty()) {
            return null;
        }

        String [] arr = string.trim().split(" ");
        if (arr.length == 0)
            return null;

        return arr[arr.length - 1].length();
    }

    // Определить, что строка является палиндромом
    // Сложность по памяти O(1), не создавать новые String, StringBuilder
    // Примеры:
    // abc - false
    // 112233 - false
    // aba - true
    // 112211 - true
    public static boolean isPalindrome(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        int left = 0;
        int right = string.length() - 1;

        while (left < right) {
            if (string.charAt(left) != string.charAt(right)) {
                return false; // Return false immediately if chars don't match
            }
            left++;
            right--;
        }
        return true;
    }


    public static void main(String[] args) {
        turnString(string1);
        getDistinctNumbers(int1);
        findSecondMaxElement(int1);
        System.out.println(lengthOfLastWord("Hello world"));
        System.out.println(lengthOfLastWord("    fly me    to the moon    "));
        System.out.println(isPalindrome("abc"));
        System.out.println(isPalindrome("112233"));
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("112211"));
    }


}
