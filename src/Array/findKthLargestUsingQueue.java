package Array;

import java.util.PriorityQueue;

public class findKthLargestUsingQueue {
    public static int findKthLargest(int []nums, int k){
      PriorityQueue<Integer> minHeap= new PriorityQueue<>();
        System.out.println();
      for (int n: nums){
          minHeap.offer(n);
          if (minHeap.size()>k){
              minHeap.poll();
          }
      }
      return  minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums, k));
    }
}

/*
A PriorityQueue in Java is a queue where elements are ordered based on their priority,
rather than the order of insertion. By default, it uses natural ordering (min-heap),
but a custom comparator can be used to define different priorities.
Java PriorityQueue has a default initial capacity of 11.

A Min-Heap is a Data Structure with the following properties.
It is a Complete Binary Tree.
The value of the root node must be the smallest among all its descendant nodes and the same thing must be d one for its left and right sub-tree also.

 */