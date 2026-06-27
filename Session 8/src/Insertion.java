public class Insertion {
    public static void main(String[] args) {

        int[] arr = new int[6];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int position = 2;
        int value = 25;

        System.out.println("Array sebelum insertion:");

        for(int i = 0; i < 5; i++){
            System.out.print(arr[i] + " ");
        }

        for(int i = 5; i > position; i--){
            arr[i] = arr[i - 1];
        }

        arr[position] = value;

        System.out.println("\n\nArray setelah insertion:");

        for(int i = 0; i < 6; i++){
            System.out.print(arr[i] + " ");
        }
    }
}