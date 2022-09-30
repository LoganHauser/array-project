public class Main {
    
    public static void main(String[] args) {
        
        int[] numbers = new int[100];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            System.out.println(numbers[i] % 2 == 0 ? "even" : "odd");
            sum += numbers[i];
        }

        System.out.println("sum: " + sum);
    }
}
