package Unit_01;

/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] arr) {
		int n=arr.length;
		//System.out.println(n);
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n-1;j++) {
				if (arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			for(int i1=0;i1<n;i1++)
				System.out.println(arr[i1]);

	}

	void findTheDuplicateElements(int[] arr) {
		// write code here!

	}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		// write code here!

	}

	void leftRotationInAnArray(int[] arr) {
		// write code here!

	}

	void removeElementInArray(int[] arr) {
		// write code here!

	}

}
