package top.acgcoder.leetcode.me;

import top.acgcoder.leetcode.Solution151;

public class MySolution151 implements Solution151 {
    @Override
    public String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        s = s.trim();
        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 1; i--){
            if(words[i].length() != 0){
                stringBuilder.append(words[i]);
                stringBuilder.append(" ");
            }
        }
        stringBuilder.append(words[0]);
        return stringBuilder.toString();

        // 最简单的内置函数调用方法
        /*s = s.trim();
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);*/
    }
}
