package com.bridgeLabz.workShop;

import java.util.*;

public class TicTacToeGame
{
	char[]board=new char[10];
    public void initializeBoard()
    {
    	//inbuilt method
    	Arrays.fill(board, '_');
    }
    //assigning values for computer and player
    public static char chooseUserLetter(Scanner userInput)
    {
    	System.out.println("Choose your letter:");
    	return userInput.next().toUpperCase().charAt(0);
    }
    //displaying board
    public void viewBoard()
    {
    	for(int i=0;i<9;i++)
    	{
    		if(i%3 == 0)
    			System.out.println("");
    		System.out.print(board[i]+" ");
    	}
    }
    public static void main(String args[])
    {
    	Scanner userInput = new Scanner(System.in);
    	TicTacToeGame t = new TicTacToeGame();
    	//creating board
    	t.initializeBoard();
    	System.out.println("Board initalized");
    	char userLetter = chooseUserLetter(userInput);
    	char computerLetter=(userLetter=='X')?'O':'X';
    	System.out.println("user="+userLetter+" "+"computer="+computerLetter);
    	t.viewBoard();//displaying board
    }
}
