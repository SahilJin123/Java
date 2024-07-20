public class Min {
    public static void main(String[] args) {
        int[] arr = {-1,10,34,-100,40,-2,-1024};

        int mini = Integer.MAX_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(mini>arr[i])
            {
                mini = arr[i];
            }
        }

        System.out.println(mini);
    }
}
