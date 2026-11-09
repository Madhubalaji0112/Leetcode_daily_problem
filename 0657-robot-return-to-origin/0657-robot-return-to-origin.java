class Solution {
    public boolean judgeCircle(String moves) {
        int m = 0;int n=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i) == 'U'){ 
                m++; 
            }else if(moves.charAt(i) == 'L'){
                n--;
            }else if(moves.charAt(i) == 'R'){
                n++;
            }else{
                m--;
            }

        }
        if(m == 0 && n == 0){
            return true;
        }
        return false;
    }
}