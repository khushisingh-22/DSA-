 // means of  arrayslist - kitna bhi element add kar sakte h
 import java.util.ArrayList;
 import java.util.Collections;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(); // way of inserting element 
        arr.add(25);
        arr.add(8);
        arr.add(7);
        arr.add(8);

       // System.out.println(arr.get(3)); // tp get the element 
        arr.set(2,76); // to set the value in array 

        // System.out.println(arr.set(2,76));
        // System.out.println(arr); //to print array 


        //  int n = arr.size(); // arraylist me arr.length nhi hoti arr.size hota h 
        //  for(int i=0; i<n; i++){
        //     System.out.println(arr.get(i));// using  loop to print array
        //  }
        //      for(int else:arr){ // for each loop 
        //         System.out.print(else "");
        //      }
           

             // to add element in array in the last 
             arr.add(78); 
             arr.add(1,100); // to insert element in the middle of array
              System.out.println(arr); 
              //arr.remove(4) // to remove elemrnt in array 

              Collections.reverse(arr); // to reverse the array 
              System.out.println(arr); 


              // 2nd method to reverse the array 
               int i =0 , j= arr.size-1;
               while(i<j){
                int temp = arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,temp);
                i++;
                j--;

                System.out.println(arr); 
               }
    }
}



