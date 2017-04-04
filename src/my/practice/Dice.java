package my.practice;

public class Dice {
	int faceValue;
	void roll(){
		faceValue= (int)((Math.random())*10)%5+1;
	}
}
