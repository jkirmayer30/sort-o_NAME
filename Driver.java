import java.util.*;
public class Driver{
  public static ArrayList<Comparable> makeAscending(int size){
    ArrayList glen = new ArrayList<Integer>();
    for (int i = 0;i<size;i++){
      glen.add(i);
    }
    return glen;
  }

  public static ArrayList<Comparable> makeDescending(int size){
    ArrayList glen = new ArrayList<Integer>();
    for (int i = 0;i<size;i++){
      glen.add(size-i);
    }
    return glen;
  }

  public static ArrayList<Comparable> makeRandom(int size){
    ArrayList glen = new ArrayList<Integer>();
    for (int i = 0;i<size;i++){
      glen.add(Random.random());
    }
    return glen;
  }

  public static void main(String[] args){
    ArrayList glek =makeDescending(4);
      ArrayList glem = new ArrayList<Integer>();
        glem.add(7);
        glem.add(1);
        glem.add(5);
        glem.add(12);
        ArrayList glen = new ArrayList<Integer>();
          glen.add(7);
          glen.add(1);
          glen.add(5);
          glen.add(12);
    Sorts.insertion(glem);
    Sorts.bubble(glek);
    Sorts.selection(glen);
  }
}
