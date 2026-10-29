#include <stdio.h>

int binarySearch(int arr[], int n, int target) {
    int low = 0, high = n - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (arr[mid] == target)
            return mid;
        else if (arr[mid] < target)
            low = mid + 1;
        else
            high = mid - 1;
    }

    return -1; // Not found
}

int main() {
    int arr[] = {1, 3, 5, 7, 9, 11, 13};
    int n = sizeof(arr) / sizeof(arr[0]);
    int target;

    printf("Enter the target element: ");
    scanf("%d", &target);

    int index = binarySearch(arr, n, target);

    if (index != -1)
        printf("Target %d found at index %d.\n", target, index);
    else
        printf("Target %d not found in the array.\n", target);

    return 0;
}