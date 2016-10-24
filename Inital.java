package game.poker;

public class Inital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MkPoker.mkPoker();//创建扑克牌

		System.out.println("请输入玩家个数：");//输入玩家信息
		MkPlayer.mkPlayer();
		
		System.out.println("------------开始发牌------------");
		Deal.deal();//发牌
		System.out.println("---------------发牌结束------------");
		System.out.println("------------------游戏开始-------------");
	
		Compare.compare();//比较玩家双方牌的大小
		Deal.card();//输出玩家双方的所有手牌
	}
}
