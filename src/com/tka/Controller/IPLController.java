package com.tka.Controller;

import java.util.List;

import com.tka.Entity.Player;
import com.tka.Service.IPLService;

public class IPLController {

	public static void main(String[] args) {
		
		System.out.println("In IPLController.getRCBPlayer");
		
		IPLService iplservice = new IPLService();
		
		List<Player> csk = iplservice.getCSKPlayers();
		
		System.out.println("All Players in CSK : ");
		
		for(Player player : csk) {
			System.out.println(player);
		}
		
		
		for(Player data : csk) {
			if(data.getRuns() > 5000) {
				System.out.println("\n" +data.getName() +" has scored " + data.getRuns() + " runs");	
			}
		}
		
		
		
		System.out.println("\n------------------||-----------------");
		
		System.out.println("\nIn IPLController.getMIPlayer");
		
		IPLService iplservice2 = new IPLService();
		
		List<Player> mi = iplservice2.getMIPlayer();
		
		System.out.println("All Players in MI : ");
		
		
		for(Player player : mi) {
			System.out.println(player);
		}

	    for(Player data : mi) {
		   if(data.getRuns() > 1000 && data.getWickets() > 20) {
			   System.out.println("\n"+data.getName() +" have more than 1000 runs and more than 20 wickets");
		}
	    } 
	    
	    
	    System.out.println("\n------------------||-----------------");
	    
	    System.out.println("\nIn IPLController.getRCBPlayer");
	    
	    IPLService iplservice3 = new IPLService();
	    
	    List<Player> rcb = iplservice3.getRCBPlayer();
		
	    System.out.println("All Players in RCB : ");
	    
	    for(Player player : rcb) {
			System.out.println(player);
		}
	    
	    System.out.println("\n------------------||-----------------");
	    
	    System.out.println("\nIn IPLController.getPBKSPlayer");
	    
	    IPLService iplservice4 = new IPLService();
	    
	    List<Player> pbks = iplservice4.getPBKSPlayer();
	    
	    System.out.println("All Players in PBKS : ");
	    
	    for(Player player : pbks) {
	    	System.out.println(player);
	    }
	    
	}

}



