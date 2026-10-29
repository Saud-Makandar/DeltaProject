import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.print("Enter the target element to search: ");
        int target = sc.nextInt();

        int[] arr = new int[n];
        int ans = -1;
        boolean flag = false;

        // Input array elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index [" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        // Search for target element
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                ans = i;
                flag = true;
                break;
            }
        }

        // Display result
        if (flag) {
            System.out.println("\nTarget element " + target + " found at index: " + ans);
        } else {
            System.out.println("\nElement " + target + " not found in the array.");
        }

        sc.close();
    }
}
