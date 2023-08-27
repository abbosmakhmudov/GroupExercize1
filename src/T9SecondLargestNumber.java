public class T9SecondLargestNumber {
    public static void main(String[] args) {
        int [] num={25,55,67,83,85,12,95};
        int secodLargest=num[1];

        for (int i = 0; i <num.length-1 ; i++) {
            if(num[i]>secodLargest){

                secodLargest=num[i];

            }
        }
        System.out.println(secodLargest);
    }
}
