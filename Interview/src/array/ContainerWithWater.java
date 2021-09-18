package array;

public class ContainerWithWater {
	public static void main(String args[]) {
		int[] arr  = {1,8,6,2,5,4,8,3,7};
		System.out.println(findMaxArea(arr));	
	}
	
	public static int findMaxArea(int[] height) {
		int maxArea = 0;
		int a_pointer = 0;
		int b_pointer = height.length-1;
		while(a_pointer< b_pointer){
			if(height[a_pointer]<height[b_pointer]) {
				maxArea = Math.max(maxArea, (b_pointer - a_pointer) * height[a_pointer]);
				a_pointer += 1;
			}else {
				maxArea = Math.max(maxArea, (b_pointer - a_pointer) * height[b_pointer]);
				b_pointer -= 1;
			}
		}
		return maxArea;
	}
}
