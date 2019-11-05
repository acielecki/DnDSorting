/*This class holds all of the information for a given character,
 * reading in from the characters.txt file in its specific format.
 */
public class Characters {
	private String name;
	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
//Constructor sets generic values for error-checking
public Characters() {
	this.name = "Character";
	this.strength = -1;
	this.dexterity = -1;
	this.constitution = -1;
	this.intelligence = -1;
	this.wisdom = -1;
	this.charisma = -1;
}
//Getters
public String getName() {
	return this.name;
}
public int getStr() {
	return this.strength;
}
public int getDex() {
	return this.dexterity;
}
public int getCon() {
	return this.constitution;
}
public int getInt() {
	return this.intelligence;
}
public int getWis() {
	return this.wisdom;
}
public int getChar() {
	return this.charisma;
}
//Setters take whole line of text as arguments
public void setName(String nameLine) {
	this.name = nameLine;
}
//Setters for character stats check to see if stat is single or double digit number
//and set the stat to the number after the text

//set strength
public void setStr(String strLine) {
	String num = "";
	if(strLine.length() == 10) {
		num += strLine.charAt(9);
	}
	else {
		num += "" + strLine.charAt(9) + strLine.charAt(10);
	}
	this.strength = Integer.parseInt(num);
}
//set dexterity
public void setDex(String dexLine) {
	String num = "";
	if(dexLine.length() == 11) {
		num += dexLine.charAt(10);
	}
	else {
		num += "" + dexLine.charAt(10) + dexLine.charAt(11);
	}
	this.dexterity = Integer.parseInt(num);
}
//set constitution
public void setCon(String conLine) {
	String num = "";
	if(conLine.length() == 14) {
		num += conLine.charAt(13);
	}
	else {
		num += "" + conLine.charAt(13) + conLine.charAt(14);
	}
	this.constitution = Integer.parseInt(num);
}
//set intelligence
public void setInt(String intLine) {
	String num = "";
	if(intLine.length() == 14) {
		num += intLine.charAt(13);
	}
	else {
		num += "" + intLine.charAt(13) + intLine.charAt(14);
	}
	this.intelligence = Integer.parseInt(num);
}
//set wisdom
public void setWis(String wisLine) {
	String num = "";
	if(wisLine.length() == 8) {
		num += wisLine.charAt(7);
	}
	else {
		num += "" + wisLine.charAt(7) + wisLine.charAt(8);
	}
	this.wisdom = Integer.parseInt(num);
}
//set charisma
public void setChar(String charLine) {
	String num = "";
	if(charLine.length() == 10) {
		num += charLine.charAt(9);
	}
	else {
		num += "" + charLine.charAt(9) + charLine.charAt(10);
	}
	this.charisma = Integer.parseInt(num);
}
//Print formatted Character info
public String toString() {
	return this.name + "\nStr: " + this.strength + "\nDex: " + this.dexterity + "\nCon: " + this.constitution
			+ "\nInt: " + this.intelligence + "\nWis: " + this.wisdom + "\nChar: " + this.charisma + "\n";
}
}
