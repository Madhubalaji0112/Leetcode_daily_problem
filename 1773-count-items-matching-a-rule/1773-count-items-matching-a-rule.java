// class Solution {
//     public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//         int res = 0;
//         int m = -1;
//         if(ruleKey.equals("type")){
//             m = 0;
//         }else if(ruleKey.equals("color")){
//             m = 1;
//         }else{
//             m=2;
//         }
//         for(List<String> l : items){
//             if(l.get(m).equals(ruleValue)){
//                 res++;
//             }
//         }
//         return res;
//     }
// }
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;
        int m = switch(ruleKey){
            case "type" -> 0;
            case "color" -> 1;
            default -> 2;
        };
        for(List<String> l : items){
            if(l.get(m).equals(ruleValue)){
                res++;
            }
        }
        return res;
    }
}