package com.practice.algo.excercise.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode438 {

	public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<Integer>();
         
        if(s.length() == 0 || s == null) return result;
        
        int[] hash = new int[26];
      //record each character in p to hash
        for(char c: p.toCharArray())
            hash[c-'a']++;
        
        System.out.println("First load char_count: "+ Arrays.toString(hash));
      //two points, initialize count to p's length
        int left=0, right=0, count=p.length();
        
        while(right < s.length()){
        	System.out.println("1. left: "+left+" right: "+right+" count: "+count+" result: "+result.toString()+" char_count: "+Arrays.toString(hash));
        	//move right everytime, if the character exists in p's hash, decrease the count
            //current hash value >= 1 means the character is existing in p
        	if(hash[s.charAt(right++)-'a']-- >= 1) 
                count--;
            System.out.println("2. left: "+left+" right: "+right+" count: "+count+" result: "+result.toString()+" char_count: "+Arrays.toString(hash)+" result: "+result.toString());
          //when the count is down to 0, means we found the right anagram
            //then add window's left to result list
            if(count == 0) 
                result.add(left);
            System.out.println("3. left: "+left+" right: "+right+" count: "+count+" result: "+result.toString()+" char_count: "+Arrays.toString(hash)+" result: "+result.toString());
            
          //if we find the window's size equals to p, then we have to move left (narrow the window) to find the new match window
            //++ to reset the hash because we kicked out the left
            //only increase the count if the character is in p
            //the count >= 0 indicate it was original in the hash, coz it won't go below 0
            if(right-left == p.length() && hash[s.charAt(left++)-'a']++ >= 0)
                count++;
            System.out.println("4. left: "+left+" right: "+right+" count: "+count+" result: "+result.toString()+" char_count: "+Arrays.toString(hash)+" result: "+result.toString());
        }
        System.out.println("5.left: "+left+" right: "+right+" count: "+count+" result: "+result.toString()+" char_count: "+Arrays.toString(hash)+" result: "+result.toString());
        
        return result;
    }
	

	public static void main(String[] args) {
		LeetCode438 lc = new LeetCode438();
		lc.findAnagrams("cbaebabacd", "abc");
	}
}
