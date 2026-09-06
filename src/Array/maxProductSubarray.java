package Array;

public class maxProductSubarray {
    /*
    Given an integer array nums, find a subarray that has the largest product, and return the product.
*/
    public static int maxProduct(int nums[]){
        int leftProduct=1;
        int rightProduct=1;
        int ans=nums[0];
        int n=nums.length;
        for (int i=0;i<n;i++){
            leftProduct=leftProduct==0?1:leftProduct;
            rightProduct=rightProduct==0?1:rightProduct;
            leftProduct=leftProduct*nums[i];
            rightProduct=rightProduct*nums[n-1-i];
            ans=Math.max(ans,Math.max(leftProduct,rightProduct));
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,3,0,1,9};
        System.out.println(maxProduct(arr));
    }
}
