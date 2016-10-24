package game.poker;

import java.util.ArrayList;
import java.util.List;


/**
 * ����
 * @author Administrator
 *
 */
public class Deal {
	public static List<Poker>poker1;
	public static List<Poker>poker2;
	
	public static void deal(){
		poker1 = new ArrayList<Poker>();//���1 ������
		poker2= new ArrayList<Poker>();//���2������
		
		for(int j=0 ; j< 2 ; j++){
			for(int i = 0; i < MkPlayer.num ; i++){
				int a = (int)(Math.random()*52);
				System.out.print("------���"+MkPlayer.mkplayer.get(i).getName()+"����:");
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
			}
		}
	}	
	public static void card(){
		System.out.println("���"+MkPlayer.mkplayer.get(0).getName()+"����������Ϊ��");
		for (Poker poker : poker1) {
			System.out.print(poker.getColor()+poker.getPoints()+"\t");
		}
		System.out.println();
		System.out.println("���"+MkPlayer.mkplayer.get(1).getName()+"����������Ϊ��");
		for (Poker poker : poker2) {
			System.out.print(poker.getColor()+poker.getPoints()+"\t");
		}
	}
}

