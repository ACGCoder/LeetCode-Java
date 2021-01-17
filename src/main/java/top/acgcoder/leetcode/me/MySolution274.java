package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution274;

public class MySolution274 implements Solution274 {
    @Override
    public int hIndex(int[] citations) {
        int hIndex = 0;

        if(citations.length == 0)
            return 0;

        if(citations.length == 1)
            return citations[0] >= 1 ? 1 : 0;

        for(int i = 1; i <= citations.length; i++){
            int count = 0;
            for (int citation : citations) {
                if (citation >= i)
                    count++;
            }
            if(count >= i && i > hIndex)
                hIndex = i;
        }

        return hIndex;
    }
}
