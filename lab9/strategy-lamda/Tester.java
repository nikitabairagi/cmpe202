import java.util.Arrays;
import java.util.List;

public class Tester {

    public static void main( String[] args)
    {

        List<SortingStrategy> strategies = Arrays.asList(

                arr -> {
                    qucikSort(arr, 0, arr.length - 1);
                    System.out.println( "List sorted with quickSort");
                },
                arr -> {
                    mergeSort(arr, 0, arr.length - 1);
                    System.out.println( "List sorted with mergeSort");
                },
                arr -> {
                    bubbleSort(arr);
                    System.out.println( "List sorted with bubbleSort");
                }
        );

        DataSet dataset = new DataSet() ;

        strategies.forEach( strategy -> {

            dataset.display();

            strategy.sort(dataset.get());

            dataset.display();

            dataset.resetData();

            dataset.display();
        });
    }

    private static void qucikSort(int a[], int lo0, int hi0) {
        int lo = lo0;
        int hi = hi0;
        if (lo >= hi) {
            return;
        }
        else if( lo == hi - 1 ) {
            /*
             *  sort a two element list by swapping if necessary
             */
            if (a[lo] > a[hi]) {
                int T = a[lo];
                a[lo] = a[hi];
                a[hi] = T;
            }
            return;
        }


        /*
         *  Pick a pivot and move it out of the way
         */
        int pivot = a[(lo + hi) / 2];
        a[(lo + hi) / 2] = a[hi];
        a[hi] = pivot;

        while( lo < hi ) {
            /*
             *  Search forward from a[lo] until an element is found that
             *  is greater than the pivot or lo >= hi
             */
            while (a[lo] <= pivot && lo < hi) {
                lo++;
            }

            /*
             *  Search backward from a[hi] until element is found that
             *  is less than the pivot, or lo >= hi
             */
            while (pivot <= a[hi] && lo < hi ) {
                hi--;
            }

            /*
             *  Swap elements a[lo] and a[hi]
             */
            if( lo < hi ) {
                int T = a[lo];
                a[lo] = a[hi];
                a[hi] = T;
            }

        }

        /*
         *  Put the median in the "center" of the list
         */
        a[hi0] = a[hi];
        a[hi] = pivot;

        /*
         *  Recursive calls, elements a[lo0] to a[lo-1] are less than or
         *  equal to pivot, elements a[hi+1] to a[hi0] are greater than
         *  pivot.
         */
        qucikSort(a, lo0, lo-1);
        qucikSort(a, hi+1, hi0);
    }

    private static void mergeSort(int a[], int lo0, int hi0){
        int lo = lo0;
        int hi = hi0;

        if (lo >= hi) {
            return;
        }
        int mid = (lo + hi) / 2;

        /*
         *  Partition the list into two lists and sort them recursively
         */
        mergeSort(a, lo, mid);
        mergeSort(a, mid + 1, hi);

        /*
         *  Merge the two sorted lists
         */
        int end_lo = mid;
        int start_hi = mid + 1;
        while ((lo <= end_lo) && (start_hi <= hi)) {
            if (a[lo] < a[start_hi]) {
                lo++;
            } else {
                /*
                 *  a[lo] >= a[start_hi]
                 *  The next element comes from the second list,
                 *  move the a[start_hi] element into the next
                 *  position and shuffle all the other elements up.
                 */
                int T = a[start_hi];
                for (int k = start_hi - 1; k >= lo; k--) {
                    a[k+1] = a[k];
                }
                a[lo] = T;
                lo++;
                end_lo++;
                start_hi++;
            }
        }
    }

    private static void bubbleSort(int a[]) {
        for (int i = a.length; --i>=0; ) {
            boolean flipped = false;
            for (int j = 0; j<i; j++) {
                if (a[j] > a[j+1]) {
                    int T = a[j];
                    a[j] = a[j+1];
                    a[j+1] = T;
                    flipped = true;
                }
            }
            if (!flipped) {
                return;
            }
        }
    }
 
}
 
