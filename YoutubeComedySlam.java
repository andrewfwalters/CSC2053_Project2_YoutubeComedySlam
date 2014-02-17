/*************************************************************************
 *  Compilation:  javac YoutubeComedySlam.java
 *  Execution:    java YoutubeComedySlam input
 *  Dependencies: java.io.* java.util.Scanner BinarySearchST.java Item.java
 *  Data files:   http://algs4.cs.princeton.edu/31elementary/tinyST.txt  
 *  
 *  Reads data from UCI machine learning repo into BinarySearchST and
 *  determines video with the most votes, average num of votes per video
 *
 *************************************************************************/

import java.util.Scanner;
import java.io.*;

public class YoutubeComedySlam {
    
    private static String left = ",left";
    
    public static void main(String args[]) throws IOException {
        
        String vidL,vidR,winner;
        int tempi;
        
        BinarySearchST<String,Integer> vids = new BinarySearchST<String,Integer>();
        
        Scanner scan = null;
        
        try {
            scan = new Scanner(new BufferedReader(new FileReader(args[0])));
            scan.useDelimiter(",");
            
            while(scan.hasNext()) {
                
                vidL = scan.next();
                vidR = scan.next();
                
                //determine winner
                winner = scan.nextLine();
                
                if(winner.equals(left)) {
                    winner = vidL;
                }
                else {
                    winner = vidR;
                }
                
                //determine new value of winner
                if(vids.contains(winner)) {
                    tempi = vids.get(winner) + 1;
                }
                else {
                    tempi = 1;
                }
                
                //create winner or increment winner's value
                vids.put(winner,tempi);
            
            }//end loop
        }//end try
        finally {
            if(scan != null) {
                scan.close();
            }
        }//end finally
        
        //iterate through vids to finds stats
        Iterable<String> list = vids.keys();
        
        String max = vids.min();
        double total = 0;
        double wins = 0;
        double av;
        
        for(String key: list) {
            total++;
            wins+=vids.get(key);
            if(vids.get(max) < vids.get(key)) {
                max = key;
            }
        }//end loop
        
        av = wins/total;
        System.out.println("Total number of youtube videos in the running " + total);
        System.out.println("Average number of wins " + av);
        System.out.println("Top winner = " + max + " won " + vids.get(max) + " times.");
        
    }//end main
    
}//end class