package com.yzh.questions.hashUse;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 12. 整数转罗马数字
 * 罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边
 * 但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。
 * (1) I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * (2) X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
 * (3) C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 */
public class IntToRoman {

    /**
     * 方法一: 全模拟
     * LinkedHashMap 保证其插入有序性
     */
    private static final Map<Integer, String> map = new LinkedHashMap<Integer, String>(13) {
        {
            put(1000, "M");
            put(900, "CM");
            put(500, "D");
            put(400, "CD");
            put(100, "C");
            put(90, "XC");
            put(50, "L");
            put(40, "XL");
            put(10, "X");
            put(9, "IX");
            put(5, "V");
            put(4, "IV");
            put(1, "I");
        }
    };

    public String intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        while (num > 0) {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if (num >= entry.getKey()) {
                    stringBuilder.append(entry.getValue());
                    num = num - entry.getKey();
                    break;
                }
            }
        }
        return stringBuilder.toString();
    }
}
