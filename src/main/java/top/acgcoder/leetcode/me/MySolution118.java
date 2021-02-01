package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution118;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MySolution118 implements Solution118 {
    @Override
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0)
            return Collections.emptyList();

        List<List<Integer>> finalList = new ArrayList<>(numRows);
        List<Integer> firstList = Stream.of(1).collect(Collectors.toList());
        finalList.add(firstList);
        if(numRows == 1)
            return finalList;

        List<Integer> secondList = Stream.of(1,1).collect(Collectors.toList());
        finalList.add(secondList);
        if(numRows == 2)
            return finalList;

        for(int i = 3; i <= numRows; i++){
            List<Integer> newList = new ArrayList<>(i);
            newList.add(1);
            for(int j = 1; j < i - 1; j++){
                newList.add(finalList.get(i - 2).get(j - 1) + finalList.get(i - 2).get(j));
            }
            newList.add(1);
            finalList.add(newList);
        }
        return finalList;
    }
}
