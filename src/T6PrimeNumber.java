public class T6PrimeNumber {
    public static void main(String[] args) {
        boolean prime=true;
        int num=88;
        if(num<=1){
           prime=false;

        }
        for (int i = 2; i <Math.sqrt(num) ; i++) {
            if(num%i==0){
              prime=false;
            }
        }
        if(prime==true){
            System.out.println(num+" is Prime number");
        }else{
            System.out.println(num+ " is NOT Prime number");
        }

    }
}
