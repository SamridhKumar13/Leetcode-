class Solution {
    public int smallestIndex(int[] nums) {
        
int n = nums.length;

        int sum=0;
      


for (int i = 0; i<n; i++){

    int temp=nums[i];
while (temp > 0){
    
sum+=temp%10;
temp/=10;
}


if (sum==i){

    
return i;
}

}
 return -1;

    }
}