package com.heima.tests;

import java.util.Arrays;

/**
 * 4.�����������󣬲��ô���ʵ�֣�
 *	(1)��дһ�����η�����ʵ��ָ��λ������Ԫ�صĽ���
 *	(2)��дһ�����η���������һ���������飬����ת�����е�����Ԫ��
 * @author JX
 *
 */
public class Test04 {
	public static void main(String[] args) {
		String s[] = {"a","b","c"};
        exchange(s, 0, 2);
        //Arrays.asList(s):������sת���ɼ���
        System.out.println(Arrays.asList(s));
        
        String s1 [] = {"a","b","c","d"};
        reverse(s1);
        System.out.println(Arrays.asList(s1));
	}
	//1.��дһ�����η�����ʵ��ָ��λ������Ԫ�صĽ���
	public static <T> void exchange(T[] t, int index1, int index2) {
		T temp = t[index1];
		t[index1] = t[index2];
		t[index2] = temp;
	}
	//2.��дһ�����η���������һ���������飬���ߵ������е�����Ԫ��
    public static <T> void reverse(T[] t){
        
        int startIndex = 0;
        int endIndex = t.length -1;
        
        while(startIndex<endIndex){
            T temp = t[startIndex];
            t[startIndex] = t[endIndex];
            t[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
        
    }
}
