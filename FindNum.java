import java.util.*;
public class FindNum{
// Write a method to find whether a particular element is present in an ArrayList
public static boolean contains(ArrayList<Integer> arrayList, int element){
  return arrayList.contains(element);
}
public static void main(String[]args){
// Create an Object for ArrayList
ArrayList<Integer> arrayList=new ArrayList<Integer>();
  // Take a For Loop and Load Numbers in to ArrayList using add()
  for(int i=1;i<=10;i++){
    arrayList.add(i);
  }
  // Contains is the Method name which you will create
System.out.println("ArrayList contains 5: " + contains(arrayList, 5));
  // it should return either true or false
}
}
