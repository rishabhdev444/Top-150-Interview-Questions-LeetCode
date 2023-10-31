class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     int length1 = m - 1;
    int length2 = n - 1;
    
    int totalLength = nums1.length + nums2.length - 1;
    
    for(int j = m+n-1; j >=0 ; j--)
    {
        if(length1 < 0)
        {
            nums1[j] = nums2[length2--];
            continue;
        }
        if(length2 < 0)
        {
            nums1[j] = nums1[length1--];
            continue;
        }
            
        if(nums1[length1] >= nums2[length2])
           nums1[j] = nums1[length1--];
        else
           nums1[j] = nums2[length2--];
            
           
    }
    }
}