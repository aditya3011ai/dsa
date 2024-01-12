import java.util.*;
public class gasstation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        // checking for the starting 
        ArrayList<Integer> index = new ArrayList<Integer>();
        int idx =-1;
        for(int i = 0; i < cost.length; i++) {
            if(gas[i]>=cost[i]){
                index.add(i);
            }
        }
        if(index.size()==0) {
            return -1;
        }
        for (int i = 0; i < index.size()-1; i++) {
            int one = gas[index.get(i)]-cost[index.get(i)];
            int two = gas[index.get(i+1)]-cost[index.get(i+1)];
            if(one>two) {
                idx = i;
            }else{
                idx=i+1;
            }
        }
    
        // cheching if we can travel a full circuit
        System.out.println(idx);
        int fuel =gas[idx]- cost[idx];
        int i = idx+1;
        while(i!=idx) {
            if(i>=gas.length){
                i=0;
            }
            fuel = fuel+gas[i]-cost[i];
            if(fuel<0 && i!=idx) {
                return -1;
            }
            i++;
        }
        return idx;
    }
    public static void main(String[] args) {
    int arr[] = {5,1,2,3,4};
    int cost[]= {4,4,1,5,1};
    System.out.print(canCompleteCircuit(arr, cost));
  }
}