                                                     //Array Partition
/*class Solution {
    public int arrayPairSum(int[] nums) {
        int a =0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length;i+=2){
            a += nums[i];
        }

       return a;
        
    }
}*/


                                                    //Find the difference

/*class Solution {
    public char findTheDifference(String s, String t) {
        char ans = 0;
        for(char ch : s.toCharArray()){
            ans ^= ch;

        }
         for(char ch : t.toCharArray()) {
            ans ^= ch;
        }
        return ans;


        
    }
}*/

                                              //Intersection of two Arrays

/*class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int n2 : nums2){
            set.add(n2);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int n1:nums1){
            if(set.contains(n1)){
                list.add(n1);
                set.remove(n1);
            }
        }
        int res[] = new int [list.size()];
        for(int i = 0; i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
}*/

                                                    // Assign Cookies
/*class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int m = g.length;
        int n = s.length;

        int i = 0 , j= 0;
        while( i< m && j<n){
            if(g[i] <= s[j]){
                i++;
            }
            j++;

        }
        return i;
        
    }
}*/


//Buy two chocolets
/*class Solution {
    public int buyChoco(int[] prices, int money) {
        int first = 999;
        int second = 999;
        for(int price:prices)
       {
        if(price<=first){
            second = first;
            first = price;
        }
        else if(price < second )
        second = price;
       }
       int total = first + second ;
       if(total <=money)
       return money-total;
       else
       return money;
    }   
    }*/

