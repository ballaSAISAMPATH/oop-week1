import java.lang.*;
import java.util.*;
class Template <T extends Comparable<T>>{
    void bublesort(T[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    T temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int index = 0; index < arr.length; index++) {
            System.out.println(arr[index]);
        }
    }
}

public class generics {
    public static void main(String[] args) {
        Template<Integer> obj1 = new Template<>();
        Integer[] arr={9,8,7,6,5,4,3,2,1};
        obj1.bublesort(arr);
        Template<String> obj2= new Template<>();;
        String[] arr2={"SAMPATH","PRAVEEN","UPENDRA","BALA"};
        obj2.bublesort(arr2); 
    }
}
