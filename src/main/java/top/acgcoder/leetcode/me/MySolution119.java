package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution119;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MySolution119 implements Solution119 {
    @Override
    public List<Integer> getRow(int rowIndex) {
        rowIndex += 1;

        // Lambda 表达式慢，需要3ms
//        List<Integer> result = IntStream.range(0, rowIndex)
//                .map(e -> 1)
//                .boxed()
//                .collect(Collectors.toList());


        // 1ms
        List<Integer> result = new ArrayList<>(rowIndex);
        for(int i = 0; i < rowIndex; i++)
            result.add(1);

        for(int i = 1; i <= rowIndex; i++){
            for(int j = i - 3; j >= 0; j--){
                result.set(j + 1, result.get(j + 1) + result.get(j));
            }
        }
        return result;
    }
}
