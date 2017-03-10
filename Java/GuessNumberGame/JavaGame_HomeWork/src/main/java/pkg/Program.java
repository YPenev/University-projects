package pkg;

import java.lang.*;

public class Program {
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		System.out.println("Sq gi pochnah");

		new Thread(new Runnable() {
    public void run() {
	
	for(int i = 0; i < 100000;i++){}

        System.out.println("ThreadOne");
  
	
    }
}).start();

new Thread(() -> {
   System.out.println("ThreadTwo");
}).start();

	}
}

public class PlayerOne implements Player {

   @Override
   public int Gues() {
     int rand = 1;//TODO

	 return secretNumber - rand;
   }
}

public class PlayerTwo implements Player {
private List<Integer> usedNumbers;

public  PlayerTwo(){
this.usedNumbers =  new ArrayList<Integer>();
}

   @Override
   public int Gues() {


   do{
     int rand = 1;//TODO
	 }
	 while(!this.usedNumbers.Contains(rand))

	 this.usedNumbers.add(rand);

	 return secretNumber - rand;
   }
}



public class PlayerFactory {
	
   //use getShape method to get object of type shape 
   public Player getPlayer(int playerType){
     
      if(playerType.equalsIgnoreCase(1)){
         return new PlayerOne();
         
      } else if(playerType.equalsIgnoreCase(2)){
         return new PlayerTwo();
		 }
		 else{
      return null;
		 }
   }
}


/*
factory design pattern
laizy inicialization desing pattern



*/

