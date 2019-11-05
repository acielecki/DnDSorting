//Similar to Character class, but only deals with name and 1 skill/stat
public class Sorted {
	private String name;
	private int stat;
	//Constructor
	Sorted(String name, int stat) {
		this.name = name;
		this.stat = stat;
	}
	//Getter for SortByStat
	public int getStat() {
		return this.stat;
	}
	//print name and value of given stat
	public String toString() {
		return name + " (" + this.stat + ")";
	}
}