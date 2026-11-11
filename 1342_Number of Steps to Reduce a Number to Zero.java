class Solution {
    public int numberOfSteps(int num) {
        int tnum=num;
        int steps=0;
        while(tnum>0){
            if(tnum==0){
                break;
            }
            else{
                if(tnum%2==0)
                    tnum=tnum/2;
                else 
                    tnum=tnum-1;
                steps++;
            }
        }
        System.out.println("Steps:"+steps);
        return steps;
    }
}