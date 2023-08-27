public class T8MaxMinArray {
    public static void main(String[] args) {
        int [] num={25,55,67,83,27,12,95};
        int maxNumber=num[0];
        int minNumber=num[1];
        for (int i = 0; i <num.length ; i++) {
            if(num[i]>=maxNumber){
                maxNumber=num[i];
            }else if(num[i]<=minNumber){
                minNumber=num[i];
            }

        }
        System.out.println(maxNumber+" is Maximum Number");
        System.out.println(minNumber+ " is Minimum Number");
    }
}
