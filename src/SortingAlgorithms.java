import com.sun.xml.internal.bind.v2.model.annotation.Quick;

import java.util.List;
import java.util.Random;

public class SortingAlgorithms {

    int [] arr ;
    int  [] arr2 ;
    int  [] arr3;
    int  [] arr4;
    int  [] arr5;

     SortingAlgorithms(int array) {
        int arrasize= array;
         arr = new  int [arrasize];
         arr2 = new int[arrasize];
         arr3 = new int[arrasize];
         arr4 = new int[arrasize];
         arr5 = new int[arrasize];

System.out.println("constructor");
    }

    void SelectionSort()
    {
        int n = arr.length;
        for(int i = 0;i<n-1;i++)
        {
           int min_idx = i;
           for(int j = i+1;j<n;j++)
               if(arr[j]<arr[min_idx])
                   min_idx=j;

           int temp = arr[min_idx];
           arr[min_idx] = arr[i];
           arr[i] = temp;
        }
    }

     String printSelectionSortArray() {
         for (int i = 0; i < arr.length; i++) {

             System.out.println(arr[i] + "arssssssssssssss");
         }
         String str = "";
         int n = arr.length;
         for (int i = 0; i < n; ++i)
             str = str + arr[i] + " ";
             str = str + "\n";

             return str;
         }

         void BubbleSort()
         {

             int n = arr2.length;
             for(int i = 0;i<n-1;i++)
             {
                 for(int j=0;j<n-i-1;j++)
                 if(arr2[j]>arr2[j+1])
                 {
                     int temp = arr2[j];
                     arr2[j] = arr2[j+1];
                     arr2[j+1] = temp;

                 }
             }
         }

    String printBubbleSortArray() {

        System.out.println(arr+"arssbbbbbbbbbbb");
        String str = "";
        int n = arr2.length;
        for (int i = 0; i < n; ++i)
            str = str + arr2[i] + " ";
        str = str + "\n";

        return str;
    }


    void insertionSort()
    {
        int n = arr3.length;
        for(int i=1;i<n;++i)
        {
            int key = arr3[i];
            int j=i-1;

            while(j>=0 && arr3[j]>key)
            {
                arr3[j+1] = arr3[j];
                j = j-1;
            }

            arr3[j+1] = key;
        }
    }

    String printInsertionSortArray() {
        System.out.println(arr+"arssbiiiiiiiiiiiii");
        String str = "";
        int n = arr3.length;
        for (int i = 0; i < n; ++i)
            str = str + arr3[i] + " ";
        str = str + "\n";

        return str;
    }


    void mergeSort(int arr[], int l, int r)
    {
if(l<r)
{
    int m = (l+r)/2;
    mergeSort(arr,l,m);
    mergeSort(arr,m+1,r);

    merge(arr,l,m,r);
}
    }

    void merge(int arr[], int l, int m, int r)
    {
        int n1 = m-l+1;
        int n2 = r-m;

        int L[] = new int[n1];
        int R[]=new int[n2];

        for(int i=0;i<n1;++i)
            L[i] = arr[l+i];
        for(int j=0;j<n2;++j)
            R[j] = arr[m+1+j];

        int i=0,j=0;

        int k = l;

        while(i<n1 && j<n2)
        {
            if(L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i<n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j <n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    String printMergeSortArray() {
        System.out.println(arr+"arssbimmmmmmmmmm");
        String str = "";
        int n = arr4.length;
        for (int i = 0; i < n; ++i)
            str = str + arr4[i] + " ";
        str = str + "\n";

        return str;
    }

    void QuickSort(int arr[], int low, int high)
    {
        if(low<high)
        {
            int pi = partition(arr,low,high);

            QuickSort(arr,low,pi-1);
            QuickSort(arr,pi+1,high);
        }
    }

    int partition(int arr[],int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1);

        for(int j = low;j<high;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    String printQuickSortArray() {
        System.out.println(arr+"arssbiqqqqqqqqqqqqqqqqqqqq");
        String str = "";
        int n = arr5.length;
        for (int i = 0; i < n; ++i)
            str = str + arr5[i] + " ";
        str = str + "\n";

        return str;
    }

    void newArrays(int arraySize)
    {
        Random rand = new Random();
        for(int i=0;i<arraySize;i++)
        {
            int n = rand.nextInt(101);
            arr[i] = n;
            arr2[i] = n;
            arr3[i] = n;
            arr4[i] = n;
            arr5[i] = n;
        }
    }

    void inputArray(List<Integer> inputArray)
    {

        for(int i=0;i<inputArray.size();i++)
        {

            arr[i] = inputArray.get(i);
            arr2[i] = inputArray.get(i);
            arr3[i] = inputArray.get(i);
            arr4[i] = inputArray.get(i);
            arr5[i] = inputArray.get(i);
    }
    }

}
