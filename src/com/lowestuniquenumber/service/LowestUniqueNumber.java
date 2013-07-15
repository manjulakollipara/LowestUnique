package com.lowestuniquenumber.service;

import java.io.BufferedReader;
import java.io.FileReader;

public class LowestUniqueNumber {

	Integer lowestUniqueNumber = -1;
	/**
	 * Method that will process the input File and display the lowest unique number
	 * Reads the input file from the data folder
	 */
	public void processFile(String filePath){

		try{
			//String inputFile = "src\\\\com\\\\lowestuniquenumber\\\\data\\\\inputFile.txt";
			//filePath = "src\\com\\lowestuniquenumber\\data\\inputFile.txt";
			
			BufferedReader br = new BufferedReader(new FileReader(filePath));

			String line=null;
			while( ( line = br.readLine() ) != null) {

				// Read each line from the input file
				line = line.replaceAll(" ", "");
				
				// Convert into character array
				char[] numbers = line.toCharArray();

				int[] array = new int[numbers.length];

				// Increment the count of numbers in the array
				for(int i=0; i< array.length; i++){
					int value = Character.getNumericValue(numbers[i]);
					++array[value];
				}

				// Loop through the array to find the first number having count=1
				for(int i=0; i< numbers.length; i++){
					if( array[i] == 1){
						lowestUniqueNumber = i;
						break;
					}
				}

				// Get the index of the LowestUniqueNumber from the original line string
				int player = line.indexOf(lowestUniqueNumber.toString()) + 1;

				if( lowestUniqueNumber > 0){
					System.out.println(player);
				}
				else
					System.out.println(lowestUniqueNumber);
				
				// Reset the lowestUniqueNumber for the next line
				lowestUniqueNumber = 0;

			}
		}catch(Exception e){
			e.printStackTrace();
			e.getMessage();
		}

	}
	
}
