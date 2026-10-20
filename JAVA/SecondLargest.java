public class SecondLargest{
    public static void main (String[] args){

        int[] arr = {12, 35, 1, 10, 34, 1};

        int maxnum = arr[0];

        int secnum = arr[0];

        for (int i =0; i<arr.length; i++){
            if(arr[i] > maxnum){
                secnum = maxnum;
                maxnum = arr[i];
                
            }

            if(arr[i] > secnum && arr[i] < maxnum){
                secnum = arr[i];
            }
        }
            System.out.println("Largest: " + maxnum);
    System.out.println("Second largest: " + secnum);
    }


}