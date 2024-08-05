import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        BigInteger BI_a = new BigInteger(a);
        BigInteger BI_b = new BigInteger(b);
        return BI_a.add(BI_b).toString();
    }
}