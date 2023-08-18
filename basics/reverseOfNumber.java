public class reverseOfNumber {
    public static void main(String[] args) {
        int num = 002;
        int reverseNum=0;
        int counter = 0;
        while(true) {
             if(counter==3){
            reverseNum +=num;
            System.out.println(reverseNum);
            break;
           }
            reverseNum = (reverseNum * 10) + (num % 10);
            num = num / 10;
           counter++;
    }
}

}