package game.poker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * �������
 * @author Administrator
 *
 */
public class MkPlayer {

	static Scanner input = new Scanner(System.in);
	
	public static List<Player> mkplayer;
	static int num = input.nextInt();//�������
	
	public static void mkPlayer(){
		mkplayer = new ArrayList<Player>();
		
		for(int i=1; i <= num ; i++){
			Player player = new Player();		
			System.out.println("�������"+ i + "λ��ҵ�id������");
			System.out.println("���������ID��");
			int id = input.nextInt();
			System.out.println("���������������");
			String name = input.next();
			player.setId(id);
			player.setName(name);
			mkplayer.add(player);
			}
		for (Player player1 : mkplayer) {
			System.out.println("��ӭ���"+player1.getName());
		}
	}
}
