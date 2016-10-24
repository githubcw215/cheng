package game.poker;


import java.util.ArrayList;  
import java.util.Collections;  
import java.util.HashMap;  
import java.util.TreeSet;  
  
public class main {  
    public main(String[] args){  
        //����һ��ArrayList����  
        ArrayList<Integer> al = new ArrayList<Integer>();  
        //����һ��HashMap����  
        HashMap<Integer,String> hm = new HashMap<Integer,String>();  
         
        // ������ɫ����͵�������  
        // ����һ����ɫ����  
        String[] colors = {"�t��","÷��","����","��Ƭ"};  
        // ����һ����������  
        String[] numbers = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q",  
            "K", "A", "2", };  
      
        // ��0��ʼ��HashMap����洢��ţ����洢��Ӧ����,ͬʱ��ArrayList����洢��ż��ɡ�  
        int index = 0;  
      
        for(String color : colors){  
            for(String number : numbers){  
                String poker = color.concat(number);//eg.poker = ����5  
                hm.put(index, poker);  
                al.add(index);  
                index++;  
            }  
        }  
        System.out.println("-----------------------------------------");  
        System.out.println("ϴ��֮ǰ����r��"+hm);  
        System.out.println("-----------------------------------------");  
          
        // ϴ��(ϴ���Ǳ��)  
        Collections.shuffle(al);  
          
        // ����(����Ҳ�Ǳ�ţ�Ϊ�˱�֤���������ģ��ʹ���TreeSet���Ͻ���)  
        TreeSet<Integer> LeiDong = new TreeSet<Integer>();  
        TreeSet<Integer> HouShourong = new TreeSet<Integer>();  
        TreeSet<Integer> YaoLei = new TreeSet<Integer>();  
        TreeSet<Integer> LiangKai = new TreeSet<Integer>();  
          
        for(int i = 0; i < al.size(); i++){//���η��ƣ�ÿ�����ֻ��������  
            if(i % 4 == 0){  
                if(LeiDong.size()<4)  
                    LeiDong.add(al.get(i));  
                else  
                    break;  
            }  
            else if(i % 4 == 1){  
                if(HouShourong.size()<4)  
                    HouShourong.add(al.get(i));  
                else  
                    break;  
            }  
            else if(i % 4 == 2){  
                if(YaoLei.size()<4)  
                    YaoLei.add(al.get(i));  
                else  
                    break;  
            }  
            else{  
                if(LiangKai.size()<4)  
                    LiangKai.add(al.get(i));  
                else  
                    break;  
            }  
        }  
          
        // ����TreeSet���ϣ���ȡ��ţ���HashMap�����Ҷ�Ӧ����  
        lookPoker("�ח�",LeiDong,hm);  
        lookPoker("���ؘs",HouShourong,hm);  
        lookPoker("Ҧ��",YaoLei,hm);  
        lookPoker("���P",LiangKai,hm);  
          
        System.out.println("-----------------------------------------");  
          
        //�鿴������������Ƶ�Ȩֵ  
        int player1Max = lookMaxCard("�׶�",LeiDong,hm);  
        int player2Max = lookMaxCard("���ؘs",HouShourong,hm);  
        int player3Max = lookMaxCard("Ҧ��",YaoLei,hm);  
        int player4Max = lookMaxCard("���P",LiangKai,hm);  
        System.out.println("�׶�������Ƶ�Ȩֵ�ǣ�"+player1Max);  
        System.out.println("�����ٵ�����Ƶ�Ȩֵ�ǣ�"+player2Max);  
        System.out.println("Ҧ�ڵ�����Ƶ�Ȩֵ�ǣ�"+player3Max);  
        System.out.println("����������Ƶ�Ȩֵ�ǣ�"+player4Max);  
          
        System.out.println("-----------------------------------------");  
          
        //�Ƚ���������������Ȩֵ�Ĵ�С�����վ���˭�������˭��Ӯ��  
        result(player1Max,player2Max,player3Max,player4Max);  
          
        System.out.println("-----------------------------------------");  
    }  
  
    /** 
     * ����ĸ���ҵķ��� 
     * @param name 
     * @param ts 
     * @param hm 
     */  
    private static void lookPoker(String name, TreeSet<Integer> ts,  
            HashMap<Integer, String> hm) {  
        // TODO Auto-generated method stub  
        System.out.println(name+" �����ǣ�");  
          
        for(Integer key : ts){  
            String value = hm.get(key);  
            System.out.print(value+" ");//���������ҵ�����  
        }  
        System.out.println();//����  
    }  
      
    /** 
     * ��ÿ��������е��˿�����ѡ�������Ƶ�Ȩֵ 
     * @param name 
     * @param ts 
     * @param hm 
     */  
    private static int lookMaxCard(String name, TreeSet<Integer> ts,  
            HashMap<Integer, String> hm) {  
        // TODO Auto-generated method stub  
        ArrayList<String> valueNum = new ArrayList<String>();  
        ArrayList<Integer> valueNumToInt = new ArrayList<Integer>();  
          
        System.out.println(name+" ���Ƶ�����ֵ�ǣ�");  
          
        for(Integer key : ts){  
            String value = hm.get(key);  
            //ȡvalue�����һλ�γ�һ���µ��ַ���  
            String temp = value.substring(value.length()-1, value.length());  
            if(temp.equals("0")){//����һλΪ0��ʱ��ʵ���ϱ��������С��10  
                valueNum.add("10");  
            }  
            else{//���һλ����0ʱ��temp���������С  
                valueNum.add(temp);  
            }  
        }  
        System.out.print(valueNum);//��������ֵ  
          
        System.out.println();//����  
          
        for(int i = 0; i < valueNum.size(); i++){  
            switch(valueNum.get(i)){//����ͬ�������С��ͬ��Ȩֵ���������ڿ�/����  
            case "4":  
                valueNumToInt.add(1);//4��Ȩֵ��1  
                break;  
            case "5":  
                valueNumToInt.add(2);//5��Ȩֵ��2  
                break;  
            case "6":  
                valueNumToInt.add(3);//6��Ȩֵ��3  
                break;  
            case "7":  
                valueNumToInt.add(4);//7��Ȩֵ��4  
                break;  
            case "8":  
                valueNumToInt.add(5);//8��Ȩֵ��5  
                break;  
            case "9":  
                valueNumToInt.add(6);//9��Ȩֵ��6  
                break;  
            case "10":  
                valueNumToInt.add(7);//10��Ȩֵ��7  
                break;  
            case "J":  
                valueNumToInt.add(8);//J��Ȩֵ��8  
                break;  
            case "Q":  
                valueNumToInt.add(9);//Q��Ȩֵ��9  
                break;  
            case "K":  
                valueNumToInt.add(10);//K��Ȩֵ��10  
                break;  
            case "A":  
                valueNumToInt.add(11);//A��Ȩֵ��11  
                break;  
            case "2":  
                valueNumToInt.add(12);//2��Ȩֵ��12  
                break;  
            case "3":  
                valueNumToInt.add(13);//3��Ȩֵ��13  
                break;    
            }         
        }  
          
        Collections.sort(valueNumToInt);//��valueNumToInt��С��������  
        //ȡvalueNumToInt�����Ԫ�ظ�ֵ��maxNum  
        int maxNum = valueNumToInt.get(valueNumToInt.size()-1);  
        return maxNum;  
    }  
      
    /** 
     * �Ƚ��ĸ��������Ƶ�Ȩֵ������˭�������˭����Ӯ�� 
     * @param player1Max 
     * @param player2Max 
     * @param player3Max 
     * @param player4Max 
     */  
    private static void result(int player1Max, int player2Max, int player3Max,  
            int player4Max) {  
        // TODO Auto-generated method stub  
        ArrayList<Integer> resultArray = new ArrayList<Integer>();  
        resultArray.add(player1Max);  
        resultArray.add(player2Max);  
        resultArray.add(player3Max);  
        resultArray.add(player4Max);  
        Collections.sort(resultArray);  
        int maxPoker = resultArray.get(resultArray.size()-1);  
        System.out.println("maxPoker = "+maxPoker);  
          
        System.out.println("-----------------------------------------");  
      
        if(maxPoker == player1Max)  
            System.out.println("�׶���Ӯ�ң������е������ȨֵΪ��"+maxPoker);  
        if(maxPoker == player2Max)  
            System.out.println("��������Ӯ�ң������е������ȨֵΪ��"+maxPoker);  
        if(maxPoker == player3Max)  
            System.out.println("Ҧ����Ӯ�ң������е������ȨֵΪ��"+maxPoker);  
        if(maxPoker == player4Max)  
            System.out.println("������Ӯ�ң������е������ȨֵΪ��"+maxPoker);  
    }  
} 