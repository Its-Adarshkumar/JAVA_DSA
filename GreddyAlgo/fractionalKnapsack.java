package GreddyAlgo;

import java.util.*;
public class fractionalKnapsack {
    public static void main(String[] args) {
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int w=50;

        double ratio[][]=new double[val.length][2];
        //0th col=> idx;  1st col=> ratio

        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
        }

        //ascending order of ratio
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity=w;
        int FinalVal=0;
        for(int i=ratio.length-1;i>=0;i--){ //descending order
            int idx=(int)ratio[i][0];
            if(capacity>=weight[idx]){ //include full item
                FinalVal +=val[idx];
                capacity -=weight[idx];
            }else{ //fractional item
                FinalVal +=ratio[i][1]*capacity;
            capacity=0;
            break;
            }
        }

        System.out.println("FinalValue= "+FinalVal);
    }
}
