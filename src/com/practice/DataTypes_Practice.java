package com.practice;

public class DataTypes_Practice {

	public static void main(String[] args) {
		byte a=1;
		short b=7;
		char c='y';
		int d=12;
		long e=34;
		float f=55.45f;
		double g= 3456.4567;
		//MIN AND MAX VALUES:-
		System.out.println("Minimum value of short is :" +Short.MIN_VALUE);
		System.out.println("Maximum value of float is:" +Float.MAX_VALUE);
		System.out.println("Minimum value of byte is :" +Byte.MIN_VALUE);
		System.out.println("Maximum value of byte is:" +Byte.MAX_VALUE);
		// CASTING-WIDENING:-
		byte k= 125;
		short h=k;
		System.out.println(h);
		//CASTING-NARROWING:-
		int s=23456;
		byte t=(byte)s;
		System.out.println(t);
		//String:-
		String sText="My name is Chinni";
		System.out.println(sText);
		String[] strNames= {"Chinni","Bablu","Lucky","Gudiya","Mani","Laddu"};
		System.out.println("First element of the array is:"+strNames[0]);
		System.out.println("Second element of the array is:" +strNames[1]);
		//If we have many elements,Instead of writing the above statement many times,we use FOR LOOP
		
		//FOR LOOP:-
		for(int i=0;i<strNames.length;i++){
			System.out.println(strNames[i]);
		}
		//WHILE LOOP:-
		int i=0,n=5;
		while(i<=n) {
			System.out.println(strNames[i]);
			i++;

		}

		//FOR EACH:-
		for(String name:strNames) {
		System.out.println(name);	
		}


	}

}
