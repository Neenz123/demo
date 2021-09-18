package misc;

public class SortedTwoDSearch {
    
	public static void main(String args[]) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		int row = arr.length;
		int column = arr[0].length;
		int l = 0;
		int r = row * column - 1;
		System.out.println(findElement(arr, l, r, 20, column));
	}

	public static boolean findElement(int[][] arr, int left, int right, int target, int column) {
		boolean isExist = false;
		if (left <= right) {
			int midoint = left + (right - left) / 2;
			int midPointElemnt = arr[midoint / column][midoint % column];
			if (target == midPointElemnt) {
				isExist = true;
			} else if (target > midPointElemnt) {
				isExist = findElement(arr, midoint + 1, right, target, column);
			} else if (target < midPointElemnt) {
				isExist = findElement(arr, left, midoint - 1, target, column);
			}
		}
		return isExist;
	}

}
