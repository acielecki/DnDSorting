/**
* DnDSorting is a program which reads in a file of DnD characters,
* takes input from the user of what skill they would like to sort
* the characters by, and sorts them accordingly, printing the 
* characters in ascending order of the skill value.
* @author  Alissa Cielecki
* @version 1.0
* @since   2019-11-04
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.FileNotFoundException;

public class DnDSorting {
	static File stats = new File("characters.txt"); //File of Character information
	
	public static void main(String[] args)  throws FileNotFoundException {
	Scanner in = new Scanner(stats);
	
	ArrayList<Characters> characters = new ArrayList<>(); //make list for characters
	readFile(in, characters); //put Characters in characters ArrayList
	
	ArrayList<Sorted> sorted = new ArrayList<>(); //make list for sorting
	sorting(characters, sorted); //fill list for sorting and sort
	}
	
	//Read in file, setting each character's name and stats from the info in the file
	public static void readFile(Scanner in, ArrayList<Characters> characters) {
		while(in.hasNextLine()) {
			Characters player = new Characters();
			player.setName(in.nextLine());
			player.setStr(in.nextLine());
			player.setDex(in.nextLine());
			player.setCon(in.nextLine());
			player.setInt(in.nextLine());
			player.setWis(in.nextLine());
			player.setChar(in.nextLine());
			if(in.hasNextLine()) {in.nextLine();}
			characters.add(player);
		}
	}
	
	//Get user's choice of skill to sort by and return it.
	public static String getInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("By which skill would you like to sort the characters?");
		return input.next();
	}
	
	//Fill the list we will be sorting with Character names and the chosen stat/skill to sort by
	public static void sorting(ArrayList<Characters> characters, ArrayList<Sorted> sort) {
		SortByStat sortByStat = new SortByStat(); 
		boolean keepGoing = true;
		boolean validOption = true;
		while(keepGoing) {
			validOption = true;
			switch(getInput().toLowerCase()) { //make input lowercase and add players and given stat to list
				case "strength":
					for(Characters c: characters) {sort.add(new Sorted(c.getName(), c.getStr()));}
					break;
				case "dexterity":
					for(Characters c: characters) {sort.add(new Sorted(c.getName(), c.getDex()));}
					break;
				case "constitution":
					for(Characters c: characters) {sort.add(new Sorted(c.getName(), c.getCon()));}
					break;
				case "intelligence":
					for(Characters c: characters) {sort.add(new Sorted(c.getName(), c.getInt()));}
					break;
				case "wisdom":
					for(Characters c: characters) {sort.add(new Sorted(c.getName(), c.getWis()));}
					break;
				case "charisma":
					for(Characters c: characters) {sort.add(new Sorted(c.getName(), c.getChar()));}
					break;
				case "recursion!": 
					keepGoing = false; //end loop
					System.out.println("Have a great day!");
					break;
				default:
					validOption = false;
					System.out.println("Please enter a valid skill option.");
			}
			if(keepGoing && validOption) { //only sort if user has entered a skill to sort by
			Collections.sort(sort, sortByStat); //sorts
			printSorted(sort);
			}
		} 
	}	
	//print sorted list
	public static void printSorted(ArrayList<Sorted> sorted) {
		for(Sorted s: sorted) { 
			System.out.println(s);
		}
		System.out.println();
	}
}
