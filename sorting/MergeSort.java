package sorting;

public class MergeSort{

	
	public static void main(String[] args) {
		int[] arr = { 11, 52, 124, 5, 26, 19 };
		divide(arr, 0, arr.length - 1);
		
//		for(int i : arr) {
//			System.out.print(i + " ");
//		}
		
	}

	public static void combine(int[] arr, int si, int mid, int ei) {
		int i = si;//0
		int j = mid+1;//2
		int arr2[] = new int[ei-si+1];//2
		int x = 0;
		while (j <= ei && i <= mid) {
			if (arr[i] < arr[j]) {
				arr2[x] = arr[i];
				i++;
				x++;
			} else {
				arr2[x] = arr[j];
				j++;
				x++;
			}

		}
		
		while(j <= ei) {
			arr2[x] = arr[j];
			j++;
			x++;
		}
		
		while(i <= mid) {
			arr2[x] = arr[i];
			i++;
			x++;
		}


		for(int k=0, p=si; k<arr2.length;k++,p++) {
			arr[p] = arr2[k];
			System.out.print(arr[p] + " ");
		}
		System.out.println("");
	}
	
	

	public static void divide(int[] arr, int si, int ei) {
		if (si >= ei) {
			return;
		}
		int mid = si + (ei - si) / 2;
		divide(arr, si, mid);
		divide(arr, mid + 1, ei);
		combine(arr, si, mid, ei);
		
		System.out.println(si + " " + mid + " " + ei);
	}
	
	

}
