class Solution {
    public String solution(String code) {
        boolean mode = false;
        String[] arr = code.split("");
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("1")) {
                mode = !mode;
                continue;
            }
            if(mode) {
                if(i % 2 == 1) {
                    sb.append(arr[i]);
                }
            }
            else {
                if(i % 2 == 0) {
                    sb.append(arr[i]);
                }
            }
        }
        
        return sb.length() != 0 ? sb.toString() : "EMPTY";
    }
}