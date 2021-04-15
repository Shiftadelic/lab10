import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        SelectionSort t = new SelectionSort();
        t.basicSelectionSort(arr);

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        assertEquals(Sortedarr[0],arr[0]);
        assertEquals(Sortedarr[1],arr[1]);
        assertEquals(Sortedarr[2],arr[2]);
        assertEquals(Sortedarr[3],arr[3]);
        assertEquals(Sortedarr[4],arr[4]);
    }

    public void testNegative(){

    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;

        SelectionSort t = new SelectionSort();
        t.basicSelectionSort(arr);

        int[] Sortedarr = new int[5];
        Sortedarr[4] = -2;
        Sortedarr[3] = -7;
        Sortedarr[2] = -8;
        Sortedarr[1] = -9;
        Sortedarr[0] = -10;

        assertEquals(Sortedarr[0],arr[0]);
        assertEquals(Sortedarr[1],arr[1]);
        assertEquals(Sortedarr[2],arr[2]);
        assertEquals(Sortedarr[3],arr[3]);
        assertEquals(Sortedarr[4],arr[4]);
    }

    public void testMixed(){

    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = -2;

        SelectionSort t = new SelectionSort();
        t.basicSelectionSort(arr);

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        assertEquals(Sortedarr[0],arr[0]);
        assertEquals(Sortedarr[1],arr[1]);
        assertEquals(Sortedarr[2],arr[2]);
        assertEquals(Sortedarr[3],arr[3]);
        assertEquals(Sortedarr[4],arr[4]);
    }

    public void testDuplicates(){

    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 8;
        arr[2] = 7;
        arr[3] = 7;
        arr[4] = 9;

        SelectionSort t = new SelectionSort();
        t.basicSelectionSort(arr);

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 7;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 8;
        Sortedarr[4] = 9;

        assertEquals(Sortedarr[0],arr[0]);
        assertEquals(Sortedarr[1],arr[1]);
        assertEquals(Sortedarr[2],arr[2]);
        assertEquals(Sortedarr[3],arr[3]);
        assertEquals(Sortedarr[4],arr[4]);
    }


}
