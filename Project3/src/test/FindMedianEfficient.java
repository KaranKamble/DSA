package test;

public class FindMedianEfficient {

    public static double findMedian( int[] nums1, int[] nums2){

        if( nums1.length > nums2.length ){
            return findMedian(nums2, nums1);
        }

        int m=nums1.length;
        int n=nums2.length;
        int start=0;
        int end=m;

        while( start <= end ){
            int part1 = (start+end)/2;
            int part2 =  (m+n+1)/2 - part1;
            int maxLeftnums1 = part1 == 0 ? Integer.MIN_VALUE : nums1[part1-1];
            int maxLeftnums2 = part2 == 0 ? Integer.MIN_VALUE : nums2[part2-1];
            int minRightnums1 = part1 == m ? Integer.MAX_VALUE : nums1[part1];
            int minRightnums2 = part2 == n ? Integer.MAX_VALUE : nums2[part2];

            if( maxLeftnums1 <= minRightnums2 && maxLeftnums2 <= minRightnums1){
                if( (m+n)%2 ==0 )
                    return (Math.max(maxLeftnums1, maxLeftnums2)+Math.min(minRightnums1, minRightnums2))/2.0;
                else
                    return Math.max(maxLeftnums1, maxLeftnums2);

            }else if( maxLeftnums1 > minRightnums2 ){
                end = part1 - 1;
            }else{
                start = part1 + 1;
            }
        }

        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        int arr1[] = { 2, 3, 5, 8 };
        int arr2[] = { 4, 6, 14, 16, 18, 20 };

        System.out.println(findMedian(arr1, arr2));
    }
}
