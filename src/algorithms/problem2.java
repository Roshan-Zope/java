package algorithms;
/*
*   Given an array of names of fruit, you are supposed to sort it in lexicographical order using the selection sort
*   Input: ["papaya","lime","watermelon","apple","mango","kiwi"]
*   Output: ["apple","kiwi","lime","mango","papaya","watermelon"]
* */
public class problem2 {
    public static void sort(String[] fruits) {
        for (int i = 0; i < 5; i++) {
            for (int j = i+1; j < 6; j++) {
                if (fruits[i].compareTo(fruits[j]) > 0) {
                    String temp = fruits[i];
                    fruits[i] = fruits[j];
                    fruits[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        String[] fruits = {"papaya","lime","watermelon","apple","mango","kiwi"};
        sort(fruits);
        System.out.println("sorted array: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(fruits[i]+" ");
        }
    }
}
