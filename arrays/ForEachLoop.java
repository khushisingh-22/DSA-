// used to traverse data structure lke array etc ..can not modify array element 

public class ForEachLoop {
    public static void main(String[] args) {
       int[] arr={3,4,5,6};
       for(int ele : arr){
        system.out.print(ele+"");// array ki copy banna we cant change the element of array
       }
       for(int ele : arr)
        ele *= 2;// not change the number 

    }
}