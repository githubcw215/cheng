package game.poker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 创建玩家
 * @author Administrator
 *
 */
public class MkPlayer {

	static Scanner input = new Scanner(System.in);
	
	public static List<Player> mkplayer;
	static int num = input.nextInt();//玩家数量
	
	public static void mkPlayer(){
		mkplayer = new ArrayList<Player>();
		
		for(int i=1; i <= num ; i++){
			Player player = new Player();		
			System.out.println("请输入第"+ i + "位玩家的id和姓名");
			System.out.println("请输入玩家ID：");
			int id = input.nextInt();
			System.out.println("请输入玩家姓名：");
			String name = input.next();
			player.setId(id);
			player.setName(name);
			mkplayer.add(player);
			}
		for (Player player1 : mkplayer) {
			System.out.println("欢迎玩家"+player1.getName());
		}
	}
}
