package game.poker;

public class Inital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MkPoker.mkPoker();//�����˿���

		System.out.println("��������Ҹ�����");//���������Ϣ
		MkPlayer.mkPlayer();
		
		System.out.println("------------��ʼ����------------");
		Deal.deal();//����
		System.out.println("---------------���ƽ���------------");
		System.out.println("------------------��Ϸ��ʼ-------------");
	
		Compare.compare();//�Ƚ����˫���ƵĴ�С
		Deal.card();//������˫������������
	}
}
