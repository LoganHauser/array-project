public class Main {
    
    public static void main(String[] args) {
        
        //Create empty array with 100 items and variable for counting the total sum of the array
        int[] numbers = new int[100];
        int sum = 0;

        //Loop through the array and add numbers 1-100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        //Loop through array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " "); //Print each number
            System.out.println(numbers[i] % 2 == 0 ? "even" : "odd"); //Print whether the number is even or odd
            sum += numbers[i]; //Add number to the sum variable
        }

        System.out.println("sum: " + sum); //Print total sum
    }
}
