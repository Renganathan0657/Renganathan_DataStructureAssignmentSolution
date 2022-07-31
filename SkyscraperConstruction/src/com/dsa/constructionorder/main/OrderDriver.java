package com.dsa.constructionorder.main;
import java.util.Scanner;
import com.dsa.constructionorder.service.FloorSizeOrder;
public class OrderDriver {
	public static void main(String[] args) {
		int noOfFloors;
		System.out.println("Please enter the total no of floors in the building");
		Scanner scan = new Scanner(System.in);
		noOfFloors = scan.nextInt();
		int floorSize[] = new int [noOfFloors+1];
		Boolean result = true;
		FloorSizeOrder objSizeOrder = new FloorSizeOrder();
		result = objSizeOrder.sizeOrderOfFloor(floorSize, noOfFloors, result);	
		if(result) {
					int currentFloor = noOfFloors;
					System.out.println("\n"+"The order of construction is as follows" +"\n");
					objSizeOrder.constructionSizeOrder(floorSize,noOfFloors,currentFloor);
					}
		scan.close();
	}
}