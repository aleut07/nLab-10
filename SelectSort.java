public class SelectionSort {
	 private int temp;

	/** Creates a new instance of SelectionSort */
   public SelectionSort() {
   }

   /* A simple SelectionSort algorithm
    * pre-condition:
    * post-condition:
    * inputs:
    * outputs:
    * special conditions:
    */
   public int[] basicSelectionSort(int[] x) {
       for (int i = 0; i < x.length; ++i) {
           for (int j= i+1; j < x.length; ++j) {
               if (x[i] > x[j]) {
                   temp = x[i];
                   x[i] = x[j];
                   x[j] = temp;
               }
           } // end of inner for loop
       } // end of outer for loop
       return x;
   }

}

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class TestSelectionSort {
	@Test

	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

  public TestSelectionSort() {
  }

  public void testPositive(){
      int[] arr = new int[5];
      arr[0] = 8;
      arr[1] = 9;
      arr[2] = 7;
      arr[3] = 10;
      arr[4] = 2;

      SelectionSort sort = new SelectionSort();
      sort.basicSelectionSort(arr);

      int[] Sortedarr = new int[5];
      Sortedarr[0] = 2;
      Sortedarr[1] = 7;
      Sortedarr[2] = 8;
      Sortedarr[3] = 9;
      Sortedarr[4] = 10;

      assertSame("Failed Test", Sortedarr[4], arr[4]);
      assertSame("Failed Test", Sortedarr[3], arr[3]);
      assertSame("Failed Test", Sortedarr[2], arr[2]);
      assertSame("Failed Test", Sortedarr[1], arr[1]);
      assertSame("Failed Test", Sortedarr[0], arr[0]);

  }

  public void testNegative(){
      int[] arr = new int[5];
      arr[0] = -8;
      arr[1] = -9;
      arr[2] = -7;
      arr[3] = -10;
      arr[4] = -2;

      SelectionSort sort = new SelectionSort();
      sort.basicSelectionSort(arr);

      int[] Sortedarr = new int[5];
      Sortedarr[0] = -10;
      Sortedarr[1] = -9;
      Sortedarr[2] = -8;
      Sortedarr[3] = -7;
      Sortedarr[4] = -2;

      assertSame("Failed Test", Sortedarr[4], arr[4]);
      assertSame("Failed Test", Sortedarr[3], arr[3]);
      assertSame("Failed Test", Sortedarr[2], arr[2]);
      assertSame("Failed Test", Sortedarr[1], arr[1]);
      assertSame("Failed Test", Sortedarr[0], arr[0]);

  }
}
