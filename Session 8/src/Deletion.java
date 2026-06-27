public class Deletion {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int deleteIndex = 2;

        System.out.println("Array sebelum dihapus:");

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        for(int i = deleteIndex; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }

        System.out.println("\n\nArray setelah dihapus:");

        for(int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}