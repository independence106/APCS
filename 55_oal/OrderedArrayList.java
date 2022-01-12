import java.util.ArrayList;

/*
Frog Hats -- Kevin Cheng, Abdullah Faruque, Jason Zhou
APCS
HW55: Never Fear, Big Oh Is Here!
01-11-2021

disco-most of these are either o(n) or o(1). adding and removing
are o(n) since they requiring moving every element. things like get and size
are o(1) since they take one operation. 

qcc- is tostring part of arraylist
*/

public class OrderedArrayList {
  public ArrayList<Integer> _data;

  public OrderedArrayList() {
    _data = new ArrayList<>();
  }
//overloaded constructor, takes an ArrayList
  public OrderedArrayList(ArrayList<Integer> startingAL) {
    _data = startingAL;
    _data = order(_data);
  }
//returns size
  public int size() {
    return _data.size();
  } // time complexity is O(1) for all scenarios, independent of size, runs through the arraylist once. 
//adds specified input
  public boolean add(int entry) {
    _data.add(entry);
    _data = order(_data);
    return true;
  } // time complexity = O(n) in average scenarios. For add(), its O(1) and O(n) in the worst case 
//scenario, but we don't have a normal add method here. 
//removes element at index of input
  public void remove(int index) {
    _data.remove(index);
  } // time complexity= O(n) in all scenarios since the whole array must be iterated to find the element to be removed. It then has to shift every element one position.
//returns the value at the given index
  public int get(int index) {
    return _data.get(index);
  } // time complexity is O(1) in all scenarios since youcan find what your searching for right away. size don't matter here
//prints out the array
  public String toString() {
    String output = "[";
    for(int number: _data) {
      output += number + " ";
    }
    output += " ]";
    return output;
  }// time complexity - always O(n) in all scenarios, as the arraylist must be iterated once.
//orders the array from least to greatest

//sort is fake O-o
 /*  public static ArrayList<Integer> order(ArrayList<Integer> arr) {
    while(!ALTester.sorted(arr)) {
      for(int i = 0; i < arr.size()-1; i++) {
        if(arr.get(i) > arr.get(i+1)) {
          int larger = arr.get(i);
          arr.set(i, arr.get(i+1));
          arr.set(i+1, larger);
        }
      }
    }
    return arr;
  } */
}