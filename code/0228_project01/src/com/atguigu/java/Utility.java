package com.atguigu.java;

import java.util.*;

/*
 * 
 * 工具类：用来读取键盘 输入的数据
 * 
 */
public class Utility {
	//创建Scanner的对象
    private static Scanner scanner = new Scanner(System.in);
    
    /**
     * 读取菜单项
     * @return 返回一个char类型
     */
	public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4') {
                System.out.print("选择错误，请重新输入：");
            } else break;
        }
        return c;
    }

	/**
	 * 读取一个数值
	 * @return 返回一个int
	 */
    public static int readNumber() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(4);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("数字输入错误，请重新输入：");
            }
        }
        return n;
    }

    /**
     * 读取一个字符串
     * @return 返回一个String
     */
    public static String readString() {
        String str = readKeyBoard(8);
        return str;
    }

    /**
     * 读取确认选项 只有两个值  y / n
     * @return 返回一个char 值也只有两个 y / n
     */
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
     
            	System.out.print("选择错误，请重新输入：");
            }
        }
        return c;
    }

    
    private static String readKeyBoard(int limit) {
        String line = "";

        while (scanner.hasNext()) {
            line = scanner.nextLine();
            if (line.length() < 1 || line.length() > limit) {
                System.out.print("输入长度（不大于" + limit + "）错误，请重新输入：");
                continue;
            }
            break;
        }

        return line;
    }
}
