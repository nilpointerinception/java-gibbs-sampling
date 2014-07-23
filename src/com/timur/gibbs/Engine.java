package com.timur.gibbs;

public class Engine {
	
	public static void main(String[] args) {
		String[] data = { "ABCDAAAABDB", "AAAADCBBCA", "DDBCABAAAACBBD",
				"AABAAAACCDD" };
		int length = 4;
		@SuppressWarnings("unused")
		Gibbs gibbs = new Gibbs(data, length);
	}

}