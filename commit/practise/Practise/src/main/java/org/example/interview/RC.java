package org.example.interview;


//Remove the adjacent next element and print the desired
//        Input:-
//        aaaabaadddbbaaaddd
//        Output:-
//        expected op-
//        a b a d b a d


public class RC {

    private static RC Instance = null;

     static RC getInstance(){
        if(Instance == null)
            Instance= new RC();

        return Instance;
    }
    public static void main(String args[]){

         RC firstBean=   RC.getInstance();
         RC secondBean=   RC.getInstance();

         System.out.println(firstBean);
        System.out.println(secondBean);
//        String inputVal = "aaaabaadddbbaaaddd";
//
//       List<Character> characterList= inputVal.chars().mapToObj(e->(char)e).toList();
//
//       String result ="";
//
//       StringBuilder apendVal = new StringBuilder();
//
//
//       for(int i=0 ;i<characterList.size();i++){
//           apendVal = characterList.get(i);
//           if(apendVal.co)
//
//       }


    }



}
