package ProblemTwo.GreatLearning.Services;

public class MergeSortImplementation {

    public void MergeSort(int [] array, int left, int right){
        if(left < right){
            int mid = (left + right) / 2;
            MergeSort(array, left, mid);
            MergeSort(array, mid + 1, right);
            Merge(array, left, mid, right);
        }
    }

    private void Merge(int [] array, int left, int mid , int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int [] leftArray = new int [n1];
        int [] rightArray = new int [n2];

        for(int i = 0; i < n1; i++)
            leftArray[i] = array[left + i];

        for(int i = 0; i < n2; i++)
            rightArray[i] = array[mid + 1 + i];

        int i = 0, j = 0;
        int k = left;

        while(i < n1 && j < n2){
            if(leftArray[i] >= rightArray[j]){
                array[k] = leftArray[i];
                i++;
            }
            else{
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while(j < n2){
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
