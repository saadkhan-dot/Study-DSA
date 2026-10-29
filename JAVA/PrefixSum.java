class PrefixSum{
    public static void main(String[] args){
        int[]arr =  {2,4,1,3,5};
        int[] prefix = new int[arr.length];

        int sum =0;

        void printArr(){

            for (int i =0; i<arr.length; i++){
                sum += arr[i];
                prefix[i] = sum;
            
                System.out.println(prefix[i]);
            
            }
        }
    }
}