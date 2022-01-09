import java.util.*;
public class WorstCases{
  public static boolean isReversed(ArrayList<Comparable> arr){
    for (int i = 0;i<arr.size()-1;i++){
      if (arr.get(i).compareTo(arr.get(i+1))<0){
        return false;
      }
    }
    return true;
  }
}
