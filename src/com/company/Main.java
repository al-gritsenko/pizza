package com.company;

public class Main {

    public static void main(String[] args) {
	
		Slice slice = new Slice(new Cell(1, 2), new Cell(3, 4));
		System.out.println(slice->getLength());
		System.out.println(slice->getWidth());
    }
}
