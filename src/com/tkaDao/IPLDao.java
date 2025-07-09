package com.tkaDao;


import java.util.ArrayList;
import java.util.List;

import com.tka.Entity.Player;

public class IPLDao {

	public List<Player> getCSKPlayer() {
		
		System.out.println("In IPLDao.getCSKPlayer");
		
		List<Player> csk = new ArrayList<>();
		
		csk.add(new Player(7,"Thala",9000,0,"Chennai"));
		csk.add(new Player(8,"Ravindra Jadeja",1000,20,"Chennai"));
		csk.add(new Player(10,"Jamie Overton",500,78,"Chennai"));
		csk.add(new Player(17,"Rachin Ravindra",5000,8,"Chennai"));
		csk.add(new Player(25,"Shivam Dube",2500,50,"Chennai"));
		csk.add(new Player(52,"Rahul Tripathi",3500,80,"Chennai"));
		csk.add(new Player(57,"Deepak Hooda",1000,15,"Chennai"));
	
		return csk;
	}
	
	
	public List<Player> getMIPlayer(){
		
		System.out.println("In IPLDao.getMIPlayer");
		
        List<Player> mi = new ArrayList<>();
		
		mi.add(new Player(45,"Rohit Sharma",11000,0,"Mumbai"));
		mi.add(new Player(63,"Suryakumar Yadav",2000,30,"Mumbai"));
		mi.add(new Player(9,"Tilak Varma",400,70,"Mumbai"));
		mi.add(new Player(74,"Mitchell Santner",5000,90,"Mumbai"));
		mi.add(new Player(33,"Hardik Pandya",4000,5,"Mumbai"));
		mi.add(new Player(56,"Deepak Chahar",300,90,"Mumbai"));
		mi.add(new Player(93,"Jasprit Bumrah",6000,200,"Mumbai"));
		
		return mi;
		
	}
	
        public List<Player> getRCBPlayer(){
		
		System.out.println("In IPLDao.getRCBPlayer");
		
        List<Player> rcb = new ArrayList<>();
		
        rcb.add(new Player(97,"Rajat Patidar",5000,0,"Bengluru"));
		rcb.add(new Player(18,"Virat kohli",10000,10,"Bengluru"));
		rcb.add(new Player(37,"Devdutt Padikkal",500,50,"Bengluru"));
		rcb.add(new Player(55,"Jitesh Sharma",7000,8,"Bengluru"));
		rcb.add(new Player(25,"Krunal Pandya",3500,80,"Bengluru"));
		rcb.add(new Player(8,"Tim David",2500,30,"Bengluru"));
		rcb.add(new Player(2,"Jacob Bethell",8000,25,"Bengluru"));
		
		
		return rcb;
		
	}

		public List<Player> getPBKSPlayer() {
			
        	System.out.println("In IPLDao.getPBKSPlayer");
        	
        	List<Player> pbks = new ArrayList<>();
			
    		pbks.add(new Player(96,"Shreyas Iyer",10000,0,"Punjab"));
    		pbks.add(new Player(19,"Nehal Wadhera",2000,10,"Punjab"));
    		pbks.add(new Player(27,"Shashank Singh",5000,46,"Punjab"));
    		pbks.add(new Player(4,"Vishnu Vinod",7000,30,"Punjab"));
    		pbks.add(new Player(16,"Mitchell Owen",1500,90,"Punjab"));
    		pbks.add(new Player(18,"Priyansh Arya",3000,100,"Punjab"));
    		pbks.add(new Player(5,"Suryansh Shedge",7000,88,"Punjab"));
			
			return pbks;
		}
}
