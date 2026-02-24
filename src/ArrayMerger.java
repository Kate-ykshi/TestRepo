public class ArrayMerger {
    /**
     * Returns an array that contains integers copied from A and B. The integers are sorted in ascending order
     * @param A - int array that contains a sequence of integers in ascending order.
     * @param B - int array that contains a sequence of integers in ascending order.
     * @return int array
     */
    public static int[] merge(int[] A, int[] B) {
        int[] C = new int[A.length + B.length];
        // Put your code here!
        for (int i=0; i<A.length;i++)
            C[i]=A[i];
        for (int i=A.length; i<C.length;i++)
            C[i]=B[i-A.length];
//      int c=0;
//      for (int a:A)
//          C[c++]=a;
//      for (int b:B)
//          C[c++]=b

        for (int i=A.length; i<C.length; i++){
            for (int j=i; j>0; j--){
                if (C[j]<C[j-1]){
                    int temp=C[j];
                    C[j]=C[j-1];
                    C[j-1]=temp;
                }

            }
        }
        //如果從前面開始比較，從5開始

        return C;
    }

    public static void main(String[] args) {
        // To ensure your code is working correctly, you should change the integers in the following arrays to make further testings
        int[] A = {5, 8, 9};
        int[] B = {1, 2, 3, 4, 6};

        int[] C = merge(A, B);
        for(int c : C)
            System.out.print(c + " ");
        System.out.println();
    }
}
