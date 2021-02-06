package com.array.controller;

import java.util.Random;

public class DoubleArray {

	public void basicDoubleArray() {
		//2차원배열 바둑판형식의 저장소를 의미한다.
		int[][] arr=new int[3][3];
		arr[0][0]=100; //[행][열]
		arr[0][1]=200;
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		
		//for문을 이용해서 2차원배열 처리하기
//		arr[0][0];
//		arr[0][1];
//		arr[0][2];
//		arr[1][0];
//		arr[1][1];
//		arr[1][2];
//		arr[2][0];
//		arr[2][1];
//		arr[2][2];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				 System.out.print(arr[i][j]+" ");
			    }
			System.out.println();
		  }
		
		arr=new int[3][5];
		//2차원배열에 값넣기
		for(int i=0;i<arr.length;i++) {  
			for(int j=0;j<arr[i].length;j++) {  //그냥 arr.length는 3줄밖에 안됨..[i]을 넣으면 그행에 할당된 열길이출력..
				arr[i][j]=new Random().nextInt(8)+1;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
}
