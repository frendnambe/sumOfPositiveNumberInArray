import java.util.Random;

public class Program {

    public static int sumOfPositiveNumberInArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length;i++)
        {
            if (array[i] > 0)
            {
                sum += array[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] testArray = new int[15];
        for (int i = 0; i < testArray.length; i++)
        {
            testArray[i] = rnd.nextInt(-15,15);
            System.out.print(testArray[i] + " ");
        }
        System.out.println();
        System.out.println("Sum of positive number = " + sumOfPositiveNumberInArray(testArray));
    }
}
