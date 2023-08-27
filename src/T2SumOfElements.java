public class T2SumOfElements {
    public static void main(String[] args) {
        int [] elements={4,3,6,7,8,2};
        int sum=0;
        for (int i = 0; i <elements.length ; i++) {
            sum=sum+elements[i];
        }
        System.out.println(sum);
    }
}
