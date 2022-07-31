package com.dsa.constructionorder.service;
import java.util.Scanner;
public class FloorSizeOrder {
	 Scanner scanr = new Scanner(System.in);
	 public boolean sizeOrderOfFloor(int [] floorSize, int noOfFloors, Boolean result){
		for(int i=0; i<noOfFloors; i++) {
			System.out.println("Floor size given on Day : "+(i+1));
			int sizeOrder = scanr.nextInt();
			while(sizeOrder > noOfFloors || sizeOrder == 0) {
			System.out.println("invalid input : " + sizeOrder);
			System.out.println("Floor size value should be less than no of floors and should not be zero");
			return false;
			}	
			floorSize[sizeOrder] = i;	 	
		}
		scanr.close();
		return result;
	}
	public void constructionSizeOrder (int[] floorSize, int noOfFloors, int currentFloor ) {
		for(int i=0; i<noOfFloors;i++) {
			System.out.println("Day :"+ (i+1));
			while(currentFloor>=1 && floorSize[currentFloor]<=i) {
			System.out.print(currentFloor+" ");
			currentFloor--;
			}
			System.out.println();
		}
	}
}