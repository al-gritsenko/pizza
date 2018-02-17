package com.company;

public class Slice {

	private Cell topLeft;
	private Cell bottomRight;

	Slice (Cell topLeft, Cell bottomRight)
	{
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
	}

	int getLength() {
	    return Math.abs(topLeft.getCell()-bottomRight.getCell());
    }

	int getWidth() {
	    return Math.abs(topLeft.getRow()-bottomRight.getRow());
    }

}
