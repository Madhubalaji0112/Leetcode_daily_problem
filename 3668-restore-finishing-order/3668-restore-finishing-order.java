// class Solution {
//     public int[] recoverOrder(int[] order, int[] friends) {
//         int[] arr = new int[friends.length];
//         int m=0;
//         for(int i=0;i<order.length;i++){
//             for(int j=0;j<friends.length;j++){
//                 if(order[i] == friends[j]){
//                     arr[m] = order[i];
//                     m++;
//                 }
//             }
//         }
//         return arr;
//     }
// }

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] arr = new int[friends.length];
        List<Integer> list = new ArrayList<>(friends.length);
        for(int i:friends){
            list.add(i);
        }
        int m=0;
        for(int i:order){
            if(list.contains(i)){
                arr[m] = i;
                m++;
            }
        }
        return arr;
    }
}