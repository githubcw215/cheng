package game.poker;

import java.util.ArrayList;
import java.util.List;

/**
 * �Ƚ��ƴ�С
 * @author Administrator
 *
 */
public class Compare {
	
	public static List<Integer>comparePoints1;//���1�ĵ���
	public static List<Integer>comparePoints2;//���2�ĵ���
	public static List<Integer>comparePoints3;//�������Ƶĵ���
	public static List<Integer>compareColor1;//���1����ɫ
	public static List<Integer>compareColor2;//���2����ɫ
	public static List<Integer>compareColor3;//�������Ƶ���ɫ
	
	public static void compare(){
		comparePoints1 = new ArrayList<Integer>();
		compareColor1= new ArrayList<Integer>();
		comparePoints2 = new ArrayList<Integer>();
		compareColor2 = new ArrayList<Integer>();
		comparePoints3 = new ArrayList<Integer>();
		compareColor3 = new ArrayList<Integer>();
		
		for(int i = 0 ;i < 2;i++){
		switch(Deal.poker1.get(i).getPoints()){
		case "2":
			comparePoints1.add(1);
			break;
		case "3":
			comparePoints1.add(2);
			break;
		case "4":
			comparePoints1.add(3);
			break;
		case "5":
			comparePoints1.add(4);
			break;
		case "6":
			comparePoints1.add(5);
			break;
		case "7":
			comparePoints1.add(6);
			break;
		case "8":
			comparePoints1.add(7);
			break;
		case "9":
			comparePoints1.add(8);
			break;
		case "10":
			comparePoints1.add(9);
			break;
		case "J":
			comparePoints1.add(10);
			break;
		case "Q":
			comparePoints1.add(11);
			break;
		case "K":
			comparePoints1.add(12);
			break;
		case "A":
			comparePoints1.add(13);
			break;
		}
		switch(Deal.poker1.get(i).getColor()){
		case "����":
			compareColor1.add(1);
			break;
		case "����":
			compareColor1.add(2);
			break;
		case "÷��":
			compareColor1.add(3);
			break;
		case "��Ƭ":
			compareColor1.add(4);
			break;
		}
	}
		for(int j = 0 ;j< 2;j++){
			switch(Deal.poker2.get(j).getPoints()){
			case "2":
				comparePoints2.add(1);
				break;
			case "3":
				comparePoints2.add(2);
				break;
			case "4":
				comparePoints2.add(3);
				break;
			case "5":
				comparePoints2.add(4);
				break;
			case "6":
				comparePoints2.add(5);
				break;
			case "7":
				comparePoints2.add(6);
				break;
			case "8":
				comparePoints2.add(7);
				break;
			case "9":
				comparePoints2.add(8);
				break;
			case "10":
				comparePoints2.add(9);
				break;
			case "J":
				comparePoints2.add(10);
				break;
			case "Q":
				comparePoints2.add(11);
				break;
			case "K":
				comparePoints2.add(12);
				break;
			case "A":
				comparePoints2.add(13);
				break;
			}
		
		switch(Deal.poker2.get(j).getColor()){
		case "����":
			compareColor2.add(1);
			break;
		case "����":
			compareColor2.add(2);
			break;
		case "÷��":
			compareColor2.add(3);
			break;
		case "��Ƭ":
			compareColor2.add(4);
			break;
		}
	}
			if(Compare.comparePoints1.get(0) > Compare.comparePoints1.get(1)){//�ж����1�ĵ�һ�����Ƿ���ڵڶ���
				System.out.println("���"+MkPlayer.mkplayer.get(0).getName()+"������Ϊ��"+Deal.poker1.get(0).getColor()+Deal.poker1.get(0).getPoints());
				comparePoints3.add(Compare.comparePoints1.get(0));
				compareColor3.add(Compare.compareColor1.get(0));
			}else if(Compare.comparePoints1.get(0) < Compare.comparePoints1.get(1))	{//		�ж����1�ĵ�һ�����Ƿ�С�ڵڶ���
				System.out.println("���"+MkPlayer.mkplayer.get(0).getName()+"������Ϊ��"+Deal.poker1.get(1).getColor()+Deal.poker1.get(1).getPoints());
				comparePoints3.add(Compare.comparePoints1.get(1));
				compareColor3.add(Compare.compareColor1.get(1));
			}else {
				if(Compare.compareColor1.get(0) > Compare.compareColor1.get(1)){
					System.out.println("���"+MkPlayer.mkplayer.get(0).getName()+"������Ϊ��"+Deal.poker1.get(0).getColor()+Deal.poker1.get(0).getPoints());
					comparePoints3.add(Compare.comparePoints1.get(0));
					compareColor3.add(Compare.compareColor1.get(0));
			}else{
				if(Compare.compareColor1.get(0) < Compare.compareColor1.get(1)){
					System.out.println("���"+MkPlayer.mkplayer.get(0).getName()+"������Ϊ��"+Deal.poker1.get(1).getColor()+Deal.poker1.get(1).getPoints());
					comparePoints3.add(Compare.comparePoints1.get(1));
					compareColor3.add(Compare.compareColor1.get(1));
					}
				}
			}
			if(Compare.comparePoints2.get(0) > Compare.comparePoints2.get(1)){//�ж����2�ĵ�һ�����Ƿ���ڵڶ���
				System.out.println("���"+MkPlayer.mkplayer.get(1).getName()+"������Ϊ��"+Deal.poker2.get(0).getColor()+Deal.poker2.get(0).getPoints());
				comparePoints3.add(Compare.comparePoints2.get(0));
				compareColor3.add(Compare.compareColor2.get(0));
			}else if(Compare.comparePoints2.get(0) < Compare.comparePoints2.get(1))	{//		�ж����2�ĵ�һ�����Ƿ�С�ڵڶ���
				System.out.println("���"+MkPlayer.mkplayer.get(1).getName()+"������Ϊ��"+Deal.poker2.get(1).getColor()+Deal.poker2.get(1).getPoints());
				comparePoints3.add(Compare.comparePoints2.get(1));
				compareColor3.add(Compare.compareColor2.get(1));
			}else {
				if(Compare.compareColor2.get(0) > Compare.compareColor2.get(1)){
					System.out.println("���"+MkPlayer.mkplayer.get(1).getName()+"������Ϊ��"+Deal.poker2.get(0).getColor()+Deal.poker2.get(0).getPoints());
					comparePoints3.add(Compare.comparePoints2.get(0));
					compareColor3.add(Compare.compareColor2.get(0));
				}else if(Compare.compareColor2.get(0) < Compare.compareColor2.get(1)){
					System.out.println("���"+MkPlayer.mkplayer.get(1).getName()+"������Ϊ��"+Deal.poker2.get(1).getColor()+Deal.poker2.get(1).getPoints());
					comparePoints3.add(Compare.comparePoints2.get(1));
					compareColor3.add(Compare.compareColor2.get(1));
				}
			}
			if(comparePoints3.get(0) > comparePoints3.get(1)){
				System.out.println("------���"+MkPlayer.mkplayer.get(0).getName()+"��ʤ����-------");
			}else if(comparePoints3.get(0) < comparePoints3.get(1)){
				System.out.println("------���"+MkPlayer.mkplayer.get(1).getName()+"��ʤ����-------");
			}else {
				if(compareColor3.get(0) > compareColor3.get(1)){
					System.out.println("------���"+MkPlayer.mkplayer.get(0).getName()+"��ʤ����-------");
				}else if (compareColor3.get(0) < compareColor3.get(1)){
					System.out.println("------���"+MkPlayer.mkplayer.get(1).getName()+"��ʤ����-------");
				}
			}
		}
}
