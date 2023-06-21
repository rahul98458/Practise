public class Array {
    public static void main(String[] args) {
        int[] data={1,2,3,4,5};
       System.out.println(sum(data)); ;
    }
    static int sum(int[] arr)
    {
    int sum=0;
    
       for (int i : arr) {
        sum=sum+i;
       }
       return sum;
    
}
}
