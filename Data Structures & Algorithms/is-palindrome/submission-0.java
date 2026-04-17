class Solution {
    public boolean isPalindrome(String s) {     
        char[] arr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        int p1=0, p2 = arr.length - 1;
        while(p1 <= p2){
            System.out.println(arr[p1] + " " + arr[p2] + " " + (arr[p1] == arr[p2]));
            if(arr[p1] != arr[p2]) return false;
            p1++;
            p2--;
        }

        return true;
    }
}
