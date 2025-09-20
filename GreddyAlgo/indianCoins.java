package GreddyAlgo;

import java.util.*;
public class indianCoins {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,200,500,2000};

        Arrays.sort(coins, Comparator.reverseOrder());


        int countofCoins=0;
        int amount=590;
        ArrayList<Integer>ans= new ArrayList<>();

        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(amount>=coins[i]){
                    countofCoins++;
                    ans.add(coins[i]);
                    amount -=coins[i];
                }
            }
        }

        System.out.println("Minimum nuber of coins:" +countofCoins);

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
