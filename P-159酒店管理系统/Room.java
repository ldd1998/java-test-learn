public class Room{
	int no;
	String name;
	boolean isUse;
	
	public Room(int no,String name, boolean isUse){
		this.no=no;
		this.name=name;
		this.isUse=isUse;
	}
	public String toString(){
		return no+"·¿¼ä|"+name+"|"+(isUse?"ÒÑÂú|":"¿ÕÏÐ|");
	}
}