class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int val = 0;
        int sum = 0;
        for(int i=0;i<apple.length;i++){
            sum += apple[i];
        }
        int j = 0;
        for(int i=capacity.length - 1;i>= 0;i--){
            j++;
            val += capacity[i];
            if(val >= sum){
                break;
            }
        }
        return j;
    }
}