public class Ex_5 {
    public static void subArray(int numbers[]){
        
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int sum = 0;
        int totalPairs = 0;

        for(int i=0 ; i<numbers.length ; i++){ // outer loop
            int start = i;

            for(int j=i ; j<numbers.length ; j++){ //inner loop
                int end = j;
                 sum = 0;

                for(int k=start ; k<=end ; k++){        //inner most loop
                    System.out.print(numbers[k]+" ");   // used for printing the subArray element
                    
                    sum += numbers[k];
                }

                    if(maxSum < sum){
                        maxSum = sum;
                    }
                    if(minSum > sum){
                        minSum = sum;
                    }

                System.out.println("\t sum is :: "+sum);
                System.out.println();
                totalPairs++;      //calculate total sub arrays
            }

            System.out.println("----------------------------------");
            System.out.println();
        }
        System.out.println("Max sum is : "+maxSum);
        System.out.println("Minimum sum is : "+minSum);
        System.out.println("total pairs = "+totalPairs);
    }

    
    public static void main(String args[]){

        int numbers[] = {2,4,6,8,10};
        subArray(numbers);
    
    }

}
