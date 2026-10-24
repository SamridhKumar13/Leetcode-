class Solution {
  int yearDays[]={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int countDaysTogether(String arriveAlice, String leaveAlice,String arriveBob, String leaveBob) {
        int  AliceArrivetotaldays;
        int  AliceLeavetotaldays;
        int  BobArrivetotaldays;
        int  BobLeavetotaldays;

        // Alice Arrival
        int AliceAmonth = Integer.parseInt(arriveAlice.substring(0, 2));
        int AliceAdate = Integer.parseInt(arriveAlice.substring(3, 5));

        // Alice Leaving
        int AliceLmonth = Integer.parseInt(leaveAlice.substring(0, 2));
        int AliceLdate = Integer.parseInt(leaveAlice.substring(3, 5));

        // Bob Arrival
        int BobAmonth = Integer.parseInt(arriveBob.substring(0, 2));
        int BobAdate = Integer.parseInt(arriveBob.substring(3, 5));

        // Bob Leaving
        int BobLmonth = Integer.parseInt(leaveBob.substring(0, 2));
        int BobLdate = Integer.parseInt(leaveBob.substring(3, 5));

        AliceArrivetotaldays = totaldays(AliceAdate,AliceAmonth);
        AliceLeavetotaldays = totaldays(AliceLdate,AliceLmonth);
        BobArrivetotaldays = totaldays(BobAdate,BobAmonth);
        BobLeavetotaldays = totaldays(BobLdate,BobLmonth);

        if((AliceArrivetotaldays < BobArrivetotaldays && AliceLeavetotaldays < BobArrivetotaldays) || 
         (AliceArrivetotaldays > BobArrivetotaldays && AliceArrivetotaldays > BobLeavetotaldays ))return 0;
        int meetdays = Math.min(AliceLeavetotaldays, BobLeavetotaldays) - Math.max(AliceArrivetotaldays ,BobArrivetotaldays) ;
        return meetdays+1;
        
 }
    int totaldays(int day , int month )  {
        int sumofdays=0;
        for(int i=0; i<month-1;i++){
            sumofdays = sumofdays + yearDays[i];
        }
        sumofdays+= day;
        return sumofdays;
    }
}