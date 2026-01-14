class Solution {
    public String solution(String my_string, int n) {
        String result = "";
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            
            for(int j = 0 ; j < n; j++){
                result = result + c;
            }
        }
            return result;
    }
}