/**
 * 
 */
package com.lowestuniquenumber.main;

import com.lowestuniquenumber.service.LowestUniqueNumber;

/**
 * @author Manjula Kollipara
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if( args.length < 1){
			System.out.println("Please provide the input file");
			return;
		}
		
		LowestUniqueNumber lun = new LowestUniqueNumber();
		lun.processFile(args[0]);
		
	}

}
