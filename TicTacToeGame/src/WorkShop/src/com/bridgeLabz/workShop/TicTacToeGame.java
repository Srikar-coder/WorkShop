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
    public static char playerAndComputerChoice(char player,char computer)
    {
    	if(player == 'o')
    		computer='x';
    	else
    		computer='o';
    	return computer;
    	
    }
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	TicTacToeGame t = new TicTacToeGame();
    	//creating board
    	t.initializeBoard();
    	System.out.println("Board initalized");
    	System.out.println("Enter value for player x or o");
    	char player = sc.next().charAt(0);
    	char computer = ' ';
    	if(player == 'o' || player == 'x')
    	computer=playerAndComputerChoice(player,computer);//giving alternate value
    	else
    		System.out.println("Invalid input");
    	System.out.println("player choice is "+player);
    	System.out.println("computer choice is "+computer);
    	
    }
}
