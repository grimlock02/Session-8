public class Searching {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int target = 40;

        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {

            int mid = (low + high) / 2;

            if(arr[mid] == target) {
                System.out.println("Data ditemukan pada index ke-" + mid);
                return;
            }

            if(arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Data tidak ditemukan");
    }
}