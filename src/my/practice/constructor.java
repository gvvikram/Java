package my.practice;

public class constructor {

	public constructor(int n) {
		System.out.println("this is constructor 1 and value of n is " +n);}
	
	public constructor(String a, int b) {
		System.out.println("this is constructor 1 and value of n is " + a  +b);}

	public static void main(String[] args) {
		System.out.println("main method");
		constructor c = new constructor("varma", 3);

	}

}
