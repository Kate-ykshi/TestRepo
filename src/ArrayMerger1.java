public class ArrayMerger1 {
    /**
     * Returns an array that contains integers copied from A and B. The integers are sorted in ascending order
     * @param A - int array that contains a sequence of integers in ascending order.
     * @param B - int array that contains a sequence of integers in ascending order.
     * @return int array
     */
    public static int[] merge(int[] A, int[] B) {
        int[] C = new int[A.length + B.length];

        // Put your code here!
        int a=0,b=0,c=0;
        while (a<A.length && b<B.length){
            if (A[a]<B[b])
                C[c++] = A[a++];
            else
                C[c++] = B[b++];
        }

        while (a<A.length)
            C[c++] = A[a++];
        while (b<B.length)
            C[c++] = B[b++];
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
