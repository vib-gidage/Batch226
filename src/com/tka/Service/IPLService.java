package com.tka.Service;

import java.util.List;

import com.tka.Entity.Player;
import com.tkaDao.IPLDao;

public class IPLService {

	public List<Player> getCSKPlayers() {
		
		System.out.println("In IPLService.getRCBPlayer");
		
		IPLDao ipldao = new IPLDao();
		
		List<Player> csk = ipldao.getCSKPlayer();
		
		return csk;
	}


	public List<Player> getMIPlayer() {
		
		System.out.println("In IPLService.getMIPlayer");
		
		IPLDao ipldao = new IPLDao();
		
		List<Player> mi = ipldao.getMIPlayer();
		
		return mi;
	}
	
	public List<Player> getRCBPlayer() {
		
		System.out.println("In IPLService.getRCBPlayer");
		
		IPLDao ipldao = new IPLDao();
		
		List<Player> rcb = ipldao.getRCBPlayer();
		
		return rcb;
	}
	
	public List<Player> getPBKSPlayer(){
		
		System.out.println("In IPLService.getPBKSPlayer");
		
		IPLDao ipldao = new IPLDao();
		
		List<Player> pbks = ipldao.getPBKSPlayer();
		
		return pbks;
		
	}
	
	
	
	

}
