import java.util.*;

public class mostWater {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        Collections.addAll(height, 1, 8, 6, 2, 5, 4, 8, 3, 7);

        // Brute fore code -> O(n^2)
        // int maxwaterContain = Integer.MIN_VALUE;
        // for (int i = 0; i < height.size(); i++) {
        // for (int j = i+1; j < height.size(); j++) {
        // int hgt = Math.min(height.get(i), height.get(j));
        // int width = j-i;
        // int cureentWater = width * hgt;
        // maxwaterContain = Math.max(maxwaterContain, cureentWater);
        // }
        // }
        // System.out.println(maxwaterContain);

        // Two Ponter approach
        int maxwaterContain = Integer.MIN_VALUE;
        int leftPointer = 0;
        int rightPointer = height.size()-1;
        while (leftPointer<rightPointer) {
            //calculate the water and store max water contained
            int hgt = Math.min(height.get(leftPointer), height.get(rightPointer));
            int width =rightPointer - leftPointer;
            int cureentWater = hgt*width;
            maxwaterContain = Math.max(maxwaterContain, cureentWater);
            // update the pointer 
            if(height.get(leftPointer)<height.get(rightPointer)){
                leftPointer++;
            }else{
                rightPointer--;
            }
        }
        System.out.println(maxwaterContain);


    }
}