package game.poker;


import java.util.ArrayList;  
import java.util.Collections;  
import java.util.HashMap;  
import java.util.TreeSet;  
  
public class main {  
    public main(String[] args){  
        //创建一个ArrayList集合  
        ArrayList<Integer> al = new ArrayList<Integer>();  
        //创建一个HashMap集合  
        HashMap<Integer,String> hm = new HashMap<Integer,String>();  
         
        // 创建花色数组和点数数组  
        // 定义一个花色数组  
        String[] colors = {"紅桃","梅花","黑桃","方片"};  
        // 定义一个点数数组  
        String[] numbers = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q",  
            "K", "A", "2", };  
      
        // 从0开始往HashMap里面存储编号，并存储对应的牌,同时往ArrayList里面存储编号即可。  
        int index = 0;  
      
        for(String color : colors){  
            for(String number : numbers){  
                String poker = color.concat(number);//eg.poker = 红桃5  
                hm.put(index, poker);  
                al.add(index);  
                index++;  
            }  
        }  
        System.out.println("-----------------------------------------");  
        System.out.println("洗牌之前的情況："+hm);  
        System.out.println("-----------------------------------------");  
          
        // 洗牌(洗的是编号)  
        Collections.shuffle(al);  
          
        // 发牌(发的也是编号，为了保证编号是排序的，就创建TreeSet集合接收)  
        TreeSet<Integer> LeiDong = new TreeSet<Integer>();  
        TreeSet<Integer> HouShourong = new TreeSet<Integer>();  
        TreeSet<Integer> YaoLei = new TreeSet<Integer>();  
        TreeSet<Integer> LiangKai = new TreeSet<Integer>();  
          
        for(int i = 0; i < al.size(); i++){//依次发牌，每名玩家只发四张牌  
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
          
        // 遍历TreeSet集合，获取编号，到HashMap集合找对应的牌  
        lookPoker("雷棟",LeiDong,hm);  
        lookPoker("侯守榮",HouShourong,hm);  
        lookPoker("姚磊",YaoLei,hm);  
        lookPoker("梁凱",LiangKai,hm);  
          
        System.out.println("-----------------------------------------");  
          
        //查看四名玩家最大的牌的权值  
        int player1Max = lookMaxCard("雷栋",LeiDong,hm);  
        int player2Max = lookMaxCard("侯守榮",HouShourong,hm);  
        int player3Max = lookMaxCard("姚磊",YaoLei,hm);  
        int player4Max = lookMaxCard("梁凱",LiangKai,hm);  
        System.out.println("雷栋的最大牌的权值是："+player1Max);  
        System.out.println("侯守荣的最大牌的权值是："+player2Max);  
        System.out.println("姚磊的最大牌的权值是："+player3Max);  
        System.out.println("梁凯的最大牌的权值是："+player4Max);  
          
        System.out.println("-----------------------------------------");  
          
        //比较四名玩家手牌最大权值的大小来最终决定谁的牌最大，谁是赢家  
        result(player1Max,player2Max,player3Max,player4Max);  
          
        System.out.println("-----------------------------------------");  
    }  
  
    /** 
     * 完成四个玩家的发牌 
     * @param name 
     * @param ts 
     * @param hm 
     */  
    private static void lookPoker(String name, TreeSet<Integer> ts,  
            HashMap<Integer, String> hm) {  
        // TODO Auto-generated method stub  
        System.out.println(name+" 的牌是：");  
          
        for(Integer key : ts){  
            String value = hm.get(key);  
            System.out.print(value+" ");//输出该名玩家的手牌  
        }  
        System.out.println();//换行  
    }  
      
    /** 
     * 从每个玩家手中的扑克牌里选出最大的牌的权值 
     * @param name 
     * @param ts 
     * @param hm 
     */  
    private static int lookMaxCard(String name, TreeSet<Integer> ts,  
            HashMap<Integer, String> hm) {  
        // TODO Auto-generated method stub  
        ArrayList<String> valueNum = new ArrayList<String>();  
        ArrayList<Integer> valueNumToInt = new ArrayList<Integer>();  
          
        System.out.println(name+" 的牌的牌面值是：");  
          
        for(Integer key : ts){  
            String value = hm.get(key);  
            //取value的最后一位形成一个新的字符串  
            String temp = value.substring(value.length()-1, value.length());  
            if(temp.equals("0")){//最後一位为0的时候，实际上表明牌面大小是10  
                valueNum.add("10");  
            }  
            else{//最后一位不是0时，temp就是牌面大小  
                valueNum.add(temp);  
            }  
        }  
        System.out.print(valueNum);//输出牌面的值  
          
        System.out.println();//换行  
          
        for(int i = 0; i < valueNum.size(); i++){  
            switch(valueNum.get(i)){//给不同的牌面大小不同的权值，适用于挖坑/拐三  
            case "4":  
                valueNumToInt.add(1);//4的权值是1  
                break;  
            case "5":  
                valueNumToInt.add(2);//5的权值是2  
                break;  
            case "6":  
                valueNumToInt.add(3);//6的权值是3  
                break;  
            case "7":  
                valueNumToInt.add(4);//7的权值是4  
                break;  
            case "8":  
                valueNumToInt.add(5);//8的权值是5  
                break;  
            case "9":  
                valueNumToInt.add(6);//9的权值是6  
                break;  
            case "10":  
                valueNumToInt.add(7);//10的权值是7  
                break;  
            case "J":  
                valueNumToInt.add(8);//J的权值是8  
                break;  
            case "Q":  
                valueNumToInt.add(9);//Q的权值是9  
                break;  
            case "K":  
                valueNumToInt.add(10);//K的权值是10  
                break;  
            case "A":  
                valueNumToInt.add(11);//A的权值是11  
                break;  
            case "2":  
                valueNumToInt.add(12);//2的权值是12  
                break;  
            case "3":  
                valueNumToInt.add(13);//3的权值是13  
                break;    
            }         
        }  
          
        Collections.sort(valueNumToInt);//对valueNumToInt从小到大排序  
        //取valueNumToInt的最大元素赋值给maxNum  
        int maxNum = valueNumToInt.get(valueNumToInt.size()-1);  
        return maxNum;  
    }  
      
    /** 
     * 比较四个玩家最大牌的权值，最终谁的牌最大，谁就是赢家 
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
            System.out.println("雷栋是赢家！他手中的牌最大权值为："+maxPoker);  
        if(maxPoker == player2Max)  
            System.out.println("侯守荣是赢家！他手中的牌最大权值为："+maxPoker);  
        if(maxPoker == player3Max)  
            System.out.println("姚磊是赢家！他手中的牌最大权值为："+maxPoker);  
        if(maxPoker == player4Max)  
            System.out.println("梁凯是赢家！他手中的牌最大权值为："+maxPoker);  
    }  
} 