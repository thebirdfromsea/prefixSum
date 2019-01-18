package practice04;

import java.util.Arrays;

public class prefixSum {

	public static void main(String[] args) {
		 TODO Auto-generated method stub
		int [] arr={10, 20, 10, 5, 15};
		int [] prefixSum = new int [arr.length];
		for(int i=0; i<arr.length;i++) {
			if(i==0) {
				prefixSum[0]=arr[0];
			}
			if(i>0) {
				prefixSum[i]=prefixSum[i-1]+arr[i];
			}
		}
		System.out.println(Arrays.toString(prefixSum));
	}

}
