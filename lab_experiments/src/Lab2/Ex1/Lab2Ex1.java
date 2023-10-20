package Lab2.Ex1;

public class Lab2Ex1 {
    public static int getSecondSmallest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array should have at least two elements");
        }

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i < firstMin) {
                secondMin = firstMin;
                firstMin = i;
            } else if (i < secondMin && i != firstMin) {
                secondMin = i;
            }
        }

        return secondMin;
    }

    public static void main(String[] args) {
        int[] numbers = {8, 3, 9, 1, 7, 6, 4};
        int secondSmallest = getSecondSmallest(numbers);
        System.out.println("The second smallest element is: " + secondSmallest);
    }
}
