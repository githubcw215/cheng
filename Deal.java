package game.poker;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;


/**
 * ·¢ÅÆ
 * @author Administrator
 *
 */
public class Deal {
	public static List<Poker>poker1;
	public static List<Poker>poker2;
	
	public static void deal(){
		poker1 = new ArrayList<Poker>();
		poker2= new ArrayList<Poker>();
		
		ArrayList <Integer>comparePoints = new ArrayList<Integer>();
		ArrayList <Integer>compareColor = new ArrayList<Integer>();
		
		
		
		for(int j=0 ; j< 2 ; j++){
			for(int i = 0; i < MkPlayer.num ; i++){
				int a = (int)(Math.random()*52);
				System.out.print("------Íæ¼Ò"+MkPlayer.mkplayer.get(i).getName()+"ÄÃÅÆ:");
				System.out.println(MkPoker.mkcard.get(a).getColor()+MkPoker.mkcard.get(a).getPoints());
				if (i==0){
					Poker hand1 = new Poker(null, null);
					hand1.setColor(MkPoker.mkcard.get(a).getColor());
					hand1.setPoints(MkPoker.mkcard.get(a).getPoints());
					poker1.add(hand1);
				}
		
				if (i==1){
					Poker hand2 = new Poker(null, null);
					hand2.setColor(MkPoker.mkcard.get(a).getColor());
					hand2.setPoints(MkPoker.mkcard.get(a).getPoints());
					poker2.add(hand2);
				}
				switch(MkPoker.mkcard.get(a).getPoints()){
				case "2":
					comparePoints.add(1);
					break;
				case "3":
					comparePoints.add(2);
					break;
				case "4":
					comparePoints.add(3);
					break;
				case "5":
					comparePoints.add(4);
					break;
				case "6":
					comparePoints.add(5);
					break;
				case "7":
					comparePoints.add(6);
					break;
				case "8":
					comparePoints.add(7);
					break;
				case "9":
					comparePoints.add(8);
					break;
				case "10":
					comparePoints.add(9);
					break;
				case "J":
					comparePoints.add(10);
					break;
				case "Q":
					comparePoints.add(11);
					break;
				case "K":
					comparePoints.add(12);
					break;
				case "A":
					comparePoints.add(13);
					break;
				}
				
				switch(MkPoker.mkcard.get(a).getColor()){
				case "ºÚÌÒ":
					compareColor.add(1);
					break;
				case "ºìÌÒ":
					compareColor.add(2);
					break;
				case "Ã·»¨":
					compareColor.add(3);
					break;
				case "·½Æ¬":
					compareColor.add(4);
					break;
				}
			}
		}
	}	
}

