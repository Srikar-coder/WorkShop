package com.bridgeLabz.workShop;

import java.util.*;

public class TicTacToeGame
{
	char[]board=new char[10];
    public void initializeBoard()
    {
    	//inbuilt method
    	Arrays.fill(board, ' ');
    }
    public static void main(String args[])
    {
    	TicTacToeGame t = new TicTacToeGame();
    	//creating board
    	t.initializeBoard();
    	System.out.println("Board initalized");
    }
}
