class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> st = new HashSet<>();
        for(int val: nums){
            st.add(val);
        }
        ArrayList<Integer> lst = new ArrayList<>(st);
        Collections.sort(lst , Collections.reverseOrder());
        int size = Math.min(k , lst.size());
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = lst.get(i);
        }
        return arr;
    }
}