package game.poker;

import java.util.ArrayList;
import java.util.List;

public class MkPoker {

	public static List<Poker> mkcard;
	
	/**
	 * �����˿���
	 */
	public static void mkPoker(){
		System.out.println("-------���������˿���---------");
		mkcard =new ArrayList<Poker>();
		int i =1;
		String [] points ={"A","2","3","4","5","6","7","8","9","10","J","Q","K"} ;
		String [] colors = {"����","����","÷��","��Ƭ"};
		System.out.println("----------�����˿��Ƴɹ�-----------");
		for (String color: colors) {//�����˿�����ɫ
			for (String point : points) {//�����˿��Ƶ���
				Poker p = new Poker(color,point);
				mkcard.add(p);//���˿��ƴ���List��
				System.out.print(p.getColor()+p.getPoints()+" ");
				if(i++%13 == 0)
					System.out.println();
			}
		}
	}
}
