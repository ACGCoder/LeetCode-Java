package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution541;

public class MySolution541 implements Solution541 {
    @Override
    public String reverseStr(String s, int k) {
        if(s == null || s.length() == 0)
            return "";

        StringBuilder sBuilder = new StringBuilder(s);
        int zeroCount = s.length() % k == 0 ? 0 : k - s.length() % k;
        for (int i = 0; i <  zeroCount; i++)
            sBuilder.append('0');
        s = sBuilder.toString();

        sBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i += k){
            if(i / k % 2 == 0){
                for(int j = i + k - 1; j >= i; j--){
                    if(s.charAt(j) != '0')
                        sBuilder.append(s.charAt(j));
                }
            }else {
                for(int j = i; j < i + k; j++){
                    if(s.charAt(j) != '0')
                        sBuilder.append(s.charAt(j));
                }
            }
        }
        return sBuilder.toString();
    }
}
