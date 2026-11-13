// class Solution {
//     public String capitalizeTitle(String title) {
//         String[] arr = title.split(" ");
//         for(int i=0;i<arr.length;i++){
//             if(arr[i].length() <= 2) arr[i] = arr[i].toLowerCase();
//             else{
//                 arr[i] = arr[i].toLowerCase();
//                 arr[i] = Character.toUpperCase(arr[i].charAt(0))+arr[i].substring(1);
//             }
//         }
//         return String.join(" ",arr);
//     }
// }

class Solution {
    public String capitalizeTitle(String title) {

        String[] arr = title.split(" ");

        for(int i = 0; i < arr.length; i++) {

            arr[i] = arr[i].toLowerCase();

            if(arr[i].length() > 2) {
                arr[i] = Character.toUpperCase(arr[i].charAt(0))
                         + arr[i].substring(1);
            }
        }

        return String.join(" ", arr);
    }
}