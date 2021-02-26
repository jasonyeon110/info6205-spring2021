package HW4;

import java.util.HashSet;

public class IntersectionOfTwo {
    public static int[] intersection (int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if(set1.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }

        int[] arr = new int[set2.size()];
        int count = 0;
        for(Integer num : set2){
            arr[count++] = num;
        }

        return arr;
    }
}
