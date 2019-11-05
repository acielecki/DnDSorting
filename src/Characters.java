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
//set strength
public void setStr(String strLine) {
	this.strength = Integer.parseInt(strLine.replaceAll("[^0-9]", ""));
}
//set dexterity
public void setDex(String dexLine) {
	this.dexterity = Integer.parseInt(dexLine.replaceAll("[^0-9]", ""));
}
//set constitution
public void setCon(String conLine) {
	this.constitution = Integer.parseInt(conLine.replaceAll("[^0-9]", ""));
}
//set intelligence
public void setInt(String intLine) {
	this.intelligence = Integer.parseInt(intLine.replaceAll("[^0-9]", ""));
}
//set wisdom
public void setWis(String wisLine) {
	this.wisdom = Integer.parseInt(wisLine.replaceAll("[^0-9]", ""));;
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
