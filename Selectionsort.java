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
    public void basicSelectionSort(int[] x) {
    	int n = x.length;
        for (int i = 0; i < n-1; i++)
        {
            int min = i;
            for (int j = i+1; j < n; j++)
                if (x[j] < x[min])
                    min = j;
            int temp = x[min];
            x[min] = x[i];
            x[i] = temp;
        }
    } // end of basicSelectionSort method

}
