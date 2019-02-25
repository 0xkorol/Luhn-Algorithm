package test;
import java.util.*;

import java.io.*;


public class Verify {

	public static void main(String[] args) {
		
			//int[] cc = {5,2,0,4,4,0,8,0,8,6,5,6,6,4,9,2};
		int[] cc = new int[16];
		String mycc = "5204408086566492";
		char[] mycc2 = new char[16];
		mycc.getChars(0, 16, mycc2, 0);
		
		for(int i=0;i<mycc2.length;i++) {
			cc[i]=Character.getNumericValue(mycc2[i]);
		}
		
		//System.out.println(cc[1]);
		
		for(int j=0;j<15;j=j+2) {
			cc[j] = cc[j]*2;
			if(cc[j]>=10) {
				cc[j] = cc[j]-9;
				
			}
		}
		int sum=0;
		for(int x=0;x<cc.length;x++) {
		sum += cc[x];
		}
		if(sum%10==0) {
			System.out.println("CC Valid");
		}
		else {
			System.out.println("CC Invalid");
		}
		
	}
}
