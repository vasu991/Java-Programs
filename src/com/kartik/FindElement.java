package com.kartik;
import java.util.*;


public class FindElement {
 int[] arr;
 int size;
 int target;
 public FindElement() {
  this.size = 0;
 }
 public void input() {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the number of elements: ");
  size = sc.nextInt();
  arr = new int[size];
  System.out.println("enter the elements: ");
   for( int i = 0;i<arr.length;i++) {
     arr[i] = sc.nextInt();
   }
  System.out.println("enter the target element: ");
   target = sc.nextInt();
 }
 public int search(int[] arr, int target) {
  int l = 0, r = arr.length - 1;
  while (l <= r) {
   int m = l + (r - l) / 2;

   // Check if target is present at mid
   if (arr[m] == target)
    return m;

   // If target greater, ignore left half
   if (arr[m] < target)
    l = m + 1;

    // If target is smaller, ignore right half
   else
    r = m - 1;
  }
  return -1;

 }

 public static void main(String[] args) {
   FindElement obj = new FindElement();
   obj.input();
   System.out.println("target found at "+obj.search(obj.arr, obj.target)+" index.");
 }

}
