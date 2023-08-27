public class T42DArraySumOfEvenOdd {
    public static void main(String[] args) {
        int [][] array={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};
        int sumEven=0;
        int sumOdd=0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if(array[i][j]%2==0){
                    sumEven=sumEven+array[i][j];
                } else if (array[i][j]%2!=0) {
                    sumOdd=sumOdd+array[i][j];
                }
            }
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);
    }
}
