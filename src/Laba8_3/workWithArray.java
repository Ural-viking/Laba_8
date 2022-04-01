package Laba8_3;

import java.util.Random;

public class workWithArray{
	int newArray[];
	int i = 0;
	int j = 0;
	Random random = new Random();
	
	public void fillingTheArray(int[] zArray) {
		this.newArray = zArray;
		if (i<newArray.length) {
			newArray[i] = random.nextInt(100);
			System.out.println("["+i+"]" + " = " + newArray[i]);
			i++;
			fillingTheArray(zArray);
		}
		else {
			return;
		}
	}
	public void arrayOutput (int[]outArray) {
		if (j<newArray.length) {
			System.out.println("["+j+"]" + " = " + newArray[j]);
			j++;
			arrayOutput(outArray);
		}
	}
}