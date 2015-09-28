package homework1_sort;

public class MergeSort {
	
	private int[] tempArray;
	private int[] array;
	private int length;
	
	
	public void Sort(int firstIndex, int lastIndex) { //recursive split until array length equals 1
		if (firstIndex < lastIndex) {
            final int middle = firstIndex + (lastIndex - firstIndex) / 2; //split array into 2 sub-arrays
            Sort(firstIndex, middle);
            Sort(middle + 1, lastIndex);
            MergeParts(firstIndex, middle, lastIndex);
		}
	}
	
	public void StartSort(int[] matrix) {
        this.array = matrix;
        this.length = matrix.length;
        this.tempArray = new int[length];
        Sort(0, length - 1);
    }
	
	private void MergeParts(int firstIndex, int middle, int lastIndex) {
		 
        for (int i = firstIndex; i <= lastIndex; i++) {
            tempArray[i] = array[i];
        }
        int i = firstIndex;
        int j = middle + 1;
        int k = firstIndex;
        while (i <= middle && j <= lastIndex) { //compare elements of sub-arrays and sort
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempArray[i];
            k++;
            i++;
        }
 
    }
	
	public static void main(String[] args) {
		
		final int[] matrix = {1, 10, 35, 20}; //please input your 1D-matrix here 
		final MergeSort example = new MergeSort();		
		example.StartSort(matrix);
		for (final int i : matrix) {
			System.out.print(i+" ");
		}
	}
	
}

