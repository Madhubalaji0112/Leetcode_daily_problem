class Solution {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(i%2 != 0){
                arr[i] = (char)((int)arr[i-1]+ arr[i] - '0'     );
                // s = s.replace(s.charAt(i),shift(s.charAt(i-1),1));
            }
        }
        return new String(arr);
    }
}