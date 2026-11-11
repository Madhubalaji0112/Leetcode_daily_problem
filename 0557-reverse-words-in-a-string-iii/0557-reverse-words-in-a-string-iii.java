class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        for(int j=0;j<arr.length;j++){
            StringBuilder sb = new StringBuilder();
            for(int i=arr[j].length()-1;i>=0;i--){
                sb.append(arr[j].charAt(i));
            }
            arr[j] = sb.toString();
        }

        return String.join(" ",arr);
    }
}