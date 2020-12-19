package com.practice;

public class StringManupulationsTest {
	public static int login(String strText) {     //To create method(login) by our own called as User defined method
		return strText.length();
	}

	public static void main(String[] args) {
		String sText1="hey there";
		String sText2="HELLO WORLD";
		String sText3="    WELCOME    ";
		System.out.println("length of the string is :" + sText1.length());  //Length of the string
		System.out.println(sText2.toLowerCase());    //Converting upper to lowercase
		System.out.println(sText1.toUpperCase());    //Converting lower to uppercase
		System.out.println(sText3);
		System.out.println(sText3.trim());           //Removing spaces from either sides
		System.out.println(sText1.charAt(2));        //Gives or returns what char is there at index 2
		System.out.println(sText2.indexOf('W'));     //Gives or returns the index no of W
		System.out.println(sText1.contains("hey"));  //Says true or false i.e.,returns bolean value
		System.out.println(sText2.contains(" world ".toUpperCase().trim()));  //initailly it gives false as it is in lower case and extra space, so we convert to uppercase and trim and then execute to give true
		System.out.println(sText1.concat(" I'm Chinni"));  //Joining/combining sText1 with another line or arguement using concat
		System.out.println(sText1 + " "+"I'm Chinni");     //Joining/combining sText1 with another line or arguement using + symbol
		System.out.println(sText2.equals("HELLO WORLD")); //Tells whether sText2 is equal to HELLO WORLD or not
		System.out.println(sText1.replace("there", "hi"));  //replaces one string with another
		System.out.println(sText2.equalsIgnoreCase("hello world"));  //ignores Case(upper or lower) and returns bolean
		System.out.println(login("demo test"));
	}

}
