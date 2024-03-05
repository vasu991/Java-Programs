package com.kartik;
public class NumSort {
    int num;
    int[] arr;
    int len;
    public NumSort (int num){
        this.num = num;
    }
    public void extract_digit(){
        len = 0;
        int n1 = num;
        int n2 = num;
        while(n2 > 0){
            n2 = n2/10;
            len++;
        }
        arr = new int[len];
        int i = 0;
        while(n1 > 0){
            int r = n1%10;
            arr[i] = r;
            n1 = n1/10;
            i++;
        }
    }

        public void sort() {
            int i;
            int j;
            int temp;
            //bubble sort
            for (i = 0; i < arr.length - 1; i++) {
                for (j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap arr[j] and arr[j+1]
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
        public void display(){
            System.out.println("sorted number: ");
            for(int i = 0; i<len; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
    }

    public static void main(String[] args) {
        NumSort num1 = new NumSort(7528);
        num1.extract_digit();
        num1.sort();
        num1.display();
        NumSort num2= new NumSort(5692);
        num2.extract_digit();
        num2.sort();
        num2.display();
    }
}

