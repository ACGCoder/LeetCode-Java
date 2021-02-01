package top.acgcoder.leetcode.me;

import org.junit.jupiter.api.Test;
import top.acgcoder.leetcode.Solution118;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MySolution118Test {

    private Solution118 solution118 = new MySolution118();

    @Test
    void generate() {
        List<Integer> firstList = Stream.of(1).collect(Collectors.toList());
        List<Integer> secondList = Stream.of(1,1).collect(Collectors.toList());
        List<Integer> thirdList = Stream.of(1,2,1).collect(Collectors.toList());
        List<Integer> forthList = Stream.of(1,3,3,1).collect(Collectors.toList());
        List<Integer> fifthList = Stream.of(1,4,6,4,1).collect(Collectors.toList());

        List<List<Integer>> finalList = new ArrayList<>(5);
        finalList.add(firstList);
        finalList.add(secondList);
        finalList.add(thirdList);
        finalList.add(forthList);
        finalList.add(fifthList);

        assertEquals(finalList, solution118.generate(5));
    }
}