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
    //assigning values for computer and player
    public static char chooseUserLetter(Scanner userInput)
    {
    	System.out.println("Choose your letter:");
    	return userInput.next().toUpperCase().charAt(0);
    }
    //displaying board
    public void viewBoard()
    {
    	System.out.println("\n" + board[1]+" | "+board[2]+" | "+board[3]);
        System.out.println("----------");
        System.out.println(board[4]+" | "+board[5]+" | "+board[6]);
        System.out.println("----------");
        System.out.println(board[7]+" | "+board[8]+" | "+board[9]);
        
    }
    public void insertInLocation(char userLetter)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter location for user input between 1 and 9");
    	int loc = sc.nextInt();
    	if(board[loc]==' ')
    		board[loc]= userLetter;
    	else
    		System.out.println("cell is not empty");
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
    	t.insertInLocation(userLetter);//taking for user
    	t.viewBoard();
    }
}
