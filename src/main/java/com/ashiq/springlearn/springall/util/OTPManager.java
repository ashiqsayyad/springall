package com.ashiq.springlearn.springall.util;

import java.util.Random;

public class OTPManager {
	
	public static Random random = new Random() ;
	
	public static String  getOTP() {
		return String.format("%04d", Integer.valueOf(random.nextInt(1001)));
	}

}
