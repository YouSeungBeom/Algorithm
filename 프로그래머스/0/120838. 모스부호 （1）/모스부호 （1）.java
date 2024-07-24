class Solution {
    public String solution(String letter) {
        String[] str = letter.split(" ");
        
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(".-")) {
                str[i] = "a";
            } else if (str[i].equals("-...")) {
                str[i] = "b";
            } else if (str[i].equals("-.-.")) {
                str[i] = "c";
            } else if (str[i].equals("-..")) {
                str[i] = "d";
            } else if (str[i].equals(".")) {
                str[i] = "e";
            } else if (str[i].equals("..-.")) {
                str[i] = "f";
            } else if (str[i].equals("--.")) {
                str[i] = "g";
            } else if (str[i].equals("....")) {
                str[i] = "h";
            } else if (str[i].equals("..")) {
                str[i] = "i";
            } else if (str[i].equals(".---")) {
                str[i] = "j";
            } else if (str[i].equals("-.-")) {
                str[i] = "k";
            } else if (str[i].equals(".-..")) {
                str[i] = "l";
            } else if (str[i].equals("--")) {
                str[i] = "m";
            } else if (str[i].equals("-.")) {
                str[i] = "n";
            } else if (str[i].equals("---")) {
                str[i] = "o";
            } else if (str[i].equals(".--.")) {
                str[i] = "p";
            } else if (str[i].equals("--.-")) {
                str[i] = "q";
            } else if (str[i].equals(".-.")) {
                str[i] = "r";
            } else if (str[i].equals("...")) {
                str[i] = "s";
            } else if (str[i].equals("-")) {
                str[i] = "t";
            } else if (str[i].equals("..-")) {
                str[i] = "u";
            } else if (str[i].equals("...-")) {
                str[i] = "v";
            } else if (str[i].equals(".--")) {
                str[i] = "w";
            } else if (str[i].equals("-..-")) {
                str[i] = "x";
            } else if (str[i].equals("-.--")) {
                str[i] = "y";
            } else if (str[i].equals("--..")) {
                str[i] = "z";
            }
        }
        StringBuilder answer = new StringBuilder();
        for (String s : str) {
            answer.append(s);
        }
        
        return answer.toString();
    }
}