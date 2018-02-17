package com.company;

public class Cell {

	private int row;
	private int col;

	Cell(int row, int col)
	{
		this.row = row;
		this.col = col;
	}

	public int getRow()
	{
		return row;
	}

	public int getCell()
	{
		return col;
	}
}
