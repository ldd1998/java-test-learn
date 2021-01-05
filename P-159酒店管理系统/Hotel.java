public class Hotel{
	Room[][] rooms=new Room[5][10];
	
	public Hotel(){
		for(int i = 0; i<rooms.length;i++){
			for(int j = 0;j<rooms[i].length;j++){
				if(i==0 || i==1){
					rooms[i][j]=new Room((100*(i+1)+j),"标准间",false);
				}
				if(i==2 || i==3){
					rooms[i][j]=new Room((100*(i+1)+j),"双人间",false);
				}
				if(i==4){
					rooms[i][j]=new Room((100*(i+1)+j),"豪华间",false);
				}
			}
		}
	}
	public void print(){
		for(int i = 0;i<rooms.length;i++){
			for(int j = 0;j<rooms[i].length;j++){
				System.out.print(rooms[i][j]);
			}
			System.out.println();
		}
	}
	public void order(int no){
		for(int i = 0;i<rooms.length;i++){
			for (int j = 0;j<rooms[i].length;j++){
				if(rooms[i][j].no==no && rooms[i][j].isUse==false){
					rooms[i][j].isUse=true;
					return;
				}
			}
		}
	}
	
}