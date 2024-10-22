                                                          //Separate White And Black balls
/**class Solution {
    public long minimumSteps(String s) {
        long swap = 0;
        int black = 0; 
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') 
                swap += (long) black; 
            else
                black++; 
        }
        return swap;
    }
}*/

                                                           // Valid Anagram
/*class Solution {
    public boolean isAnagram(String s, String t) {
        int s1= s.length();
        int t1 = t.length();
        if(s1 != t1){
            return false;
        }
        int[] arr = new int [26];
        for(int i =0; i<s.length();i++){
            arr[s.charAt(i) - 'a']++;

        }
          for(int i =0; i<t.length();i++){
            arr[t.charAt(i) - 'a']--;
            if(arr[t.charAt(i) - 'a'] < 0){
                return false;
            }
       
    }

return true; 
}
}*/


                                                 //Remove Dublicates from sorted list 

/*class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
        return head;
        ListNode prev = head,curr = head.next;
        while(curr!=null){
            if(prev.val==curr.val){
                prev.next = curr.next;
                curr = curr.next;
            }
            else{
                prev = curr;
                curr = curr.next;
            }
        }
        
        return head;
        
    }
}*/

                                                    //Maximum Swap
/*class Solution {

    public int maximumSwap(int num) {
        String numStr = Integer.toString(num); 
        int n = numStr.length();
        int maxNum = num; 

       
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                char[] numeral = numStr.toCharArray(); 

                
                char temp = numeral[i];
                numeral[i] = numeral[j];
                numeral[j] = temp;

                int tempNum = Integer.parseInt(new String(numeral)); 
                maxNum = Math.max(maxNum, tempNum);
        }
        }

        return maxNum; 
    }
}
/* */