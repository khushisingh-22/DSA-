// public class outputinputarray {
//     public static void main(String[] args) {
//         //  int [] arr = {3,5,8,29,23,4};//length 6 


//          //  System.out.print(arr.length);//calculate length
   
//          // for(i=0;i<=5;i++){  //1st method
//           // for(i=0;i<=arr.length;i++)//2 method

//            // System.out.print(arr[i]);
//               // }


//               // for default value
//              int [] khushi = new int[7];

//           for(i=0; i<=6; i++){
//             System.out.print(khushi[i]);
//           }
//     }
// }



 // take input from user 
import java.util.Scanner;

public class outputinputarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] khushi = new int[7];
        
        for(int i =0; i<7;i++){
            int x = sc . nextInt();
             khushi[i] = x;
            System.out.print(khushi[i]);
        }
    }
}

// print double of input number 

    

            import java.util.Scanner;

public class outputinputarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] khushi = new int[7];
        
        for(int i =0; i<7;i++){
            int x = sc . nextInt();
             khushi[i] = x;
            System.out.print(2*khushi[i]);
        }
    }
}


// // for output syntax 
// for(i=o; i<=arr.length;i++){
//     sout(arr[i]);
// }


// for input
// for(i=o; i<n;i++){
//    int x = sc .nextInt();
//    arr[i]=x;
//    sout(arr[i]);
// }


// ques - given an array,print -ve element only


            import java.util.Scanner;

public class outputinputarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] khushi = new int[7];
        
        for(int i =0; i<7;i++){
            int x = sc . nextInt();
             khushi[i] = x;
             if(khushi[i]<0){
            System.out.print(2*khushi[i]);
             }
        }
    }
}


// taking input size of array 

 import java.util.Scanner;

public class outputinputarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array");
        int n = sc.nextInt();

        int[] khushi = new int[n];
        System.out.print("enter the number element");
        for(int i =0; i<n;i++){
         khushi[i]= sc .nextInt();

            System.out.print(khushi[i]);
        }
    }
}

