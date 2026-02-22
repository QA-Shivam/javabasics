package Array;

public class FindDuplicateInArray {

    /*
     * This method finds the duplicate number in the array
     * using Floyd's Tortoise and Hare (Cycle Detection) Algorithm.
     *
     * IMPORTANT CONDITIONS:
     * 1) Array size = n + 1
     * 2) Numbers are between 1 to n
     * 3) Only one duplicate number exists
     * 4) We cannot modify the array
     * 5) We must use O(1) extra space
     */

    public static int findDuplicate(int arr[]) {

        // STEP 1: Initialize slow and fast pointers
        // We treat the array like a linked list
        // Each index points to arr[index]

        int slow = 0;
        int fast = 0;

        /*
         * PHASE 1: Detect cycle
         *
         * slow moves 1 step at a time
         * fast moves 2 steps at a time
         *
         * If duplicate exists, a cycle will form
         * and slow & fast will meet inside the cycle
         */
        do {
            slow = arr[slow];           // move 1 step
            fast = arr[arr[fast]];      // move 2 steps
        } while (slow != fast);         // stop when they meet


        /*
         * PHASE 2: Find start of cycle
         *
         * Reset slow to beginning (index 0)
         * Now move both pointers 1 step at a time
         *
         * The point where they meet again
         * is the duplicate number
         */
        slow = 0;

        while (slow != fast) {
            slow = arr[slow];   // move 1 step
            fast = arr[fast];   // move 1 step
        }

        // slow (or fast) now points to duplicate
        return slow;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 1};

        /*
         * Array representation:
         *
         * index: 0 1 2 3
         * value: 1 2 3 1
         *
         * 0 -> 1 -> 2 -> 3
         *           ↑    ↓
         *           ← ← ←
         *
         * Cycle starts at 1
         * Duplicate number = 1
         */

        System.out.println(findDuplicate(arr));
    }
}