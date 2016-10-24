package game.poker;

import java.util.ArrayList;
import java.util.List;

public class MkPoker {

	public static List<Poker> mkcard;
	
	/**
	 * 创建扑克牌
	 */
	public static void mkPoker(){
		System.out.println("-------即将创建扑克牌---------");
		mkcard =new ArrayList<Poker>();
		int i =1;
		String [] points ={"A","2","3","4","5","6","7","8","9","10","J","Q","K"} ;
		String [] colors = {"黑桃","红桃","梅花","方片"};
		System.out.println("----------创建扑克牌成功-----------");
		for (String color: colors) {//遍历扑克牌颜色
			for (String point : points) {//遍历扑克牌点数
				Poker p = new Poker(color,point);
				mkcard.add(p);//将扑克牌传入List中
				System.out.print(p.getColor()+p.getPoints()+" ");
				if(i++%13 == 0)
					System.out.println();
			}
		}
	}
}
