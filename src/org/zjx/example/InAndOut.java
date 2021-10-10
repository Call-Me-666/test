package org.zjx.example;

import java.io.Console;
import java.util.Scanner;

/**
 * @Description:
 * @Program: test
 * @Author: zjx
 * @Create: 2021-10-10 21:43:33
 * @Version: 1.0
 **/
public class InAndOut {
    // 输出System.out.println
    // 输入Scanner System.in
    // 输入密码 Console

    public static void main(String[] args) {
        System.out.println("请输入名字");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("输入的名称是："+name);

        // 获取的是控制台的实例，如果是在Debug模式下，console这个对象会为null
        // 如果是在控制台中运行，console这个对象将会获取到实例
        Console console = System.console();
        String name2 = console.readLine("请输入用户名：");
        char[] password = console.readPassword("请输入密码:");
        System.out.println("用户名为："+name2+"    密码为："+new String(password));
    }
}
