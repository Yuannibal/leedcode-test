package com.yzh.questions.stringUse;

/**
 * 67. 二进制求和
 * 给你两个二进制字符串，返回它们的和（用二进制表示）
 * 输入为 非空 字符串且只包含数字 1 和 0
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();

        int carry = 0;
        int index = 0;
        while (index < a.length() || index < b.length()) {
            int value = 0;
            if (index < a.length()) {
                value = value + (a.charAt(a.length() - 1 - index) - '0');
            }
            if (index < b.length()) {
                value = value + (b.charAt(b.length() - 1 - index) - '0');
            }
            value = value + carry;

            if (value >= 2) {
                carry = 1;
            } else {
                carry = 0;
            }
            index++;
            stringBuilder.append(value % 2);
        }

        // 最高位是否进位
        if (carry > 0) {
            stringBuilder.append(1);
        }

        return stringBuilder.reverse().toString();
    }
}
