package org.example.interview;

public class ReadMe {

   public static int [] process(int [] values){

       int N = values.length;

       for(int i=0; i<values.length-1;i++){
           int temp = values[i];
           values[i] = values[N-i];
           values[N-i] =temp;
       }

        return values;
    }


    public static void main(String args[]){

        int [] values = new int[]{1,20,50,58};

        int []  result = process(values);


        for(int i=0; i<result.length-1;i++){
            System.out.println("Reverse"+result[i] );
        }



    }
}
