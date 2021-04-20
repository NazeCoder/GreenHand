import java.util.Arrays;

public class _01ListSortAndFind {
//以下实例演示了如何使用sort()方法对Java数组进行排序，及如何使用 binarySearch() 方法来查找数组中的元素, 这边我们定义了 printArray() 方法
	public static void main(String[] args) {
		int[] list = {1,24,56,3,5,-1,3,-5,55,55,-65,98,24,6,-9};
		printArray("原数组为",list);
		Arrays.sort(list);
		printArray("排序后的数组为",list);
		System.out.println("排序后数字-5在第{" + Arrays.binarySearch(list, -5) + "}位");

	}
	public static void printArray(String message,int[] array) {
		System.out.print(message + ": [");
		for (int i = 0; i < array.length-1; i++) {
			System.out.print(array[i] + " , ");
		}
		System.out.println(array[array.length-1] + "]");
		
	}

}
