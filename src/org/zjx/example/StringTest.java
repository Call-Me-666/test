package org.zjx.example;

/**
 * @Description:
 * @Program: test
 * @Author: zjx
 * @Create: 2021-10-10 20:01:54
 * @Version: 1.0
 **/
public class StringTest {
    public static void main(String[] args) {

        // StringBuffer 和 StringBuilder的区别在于
        // 前者效率慢，但是可以做到多线程处理字符串
        // 后者效率快，但是无法做到多线程处理
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("");
//        stringBuffer.b

        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder
    }
}
