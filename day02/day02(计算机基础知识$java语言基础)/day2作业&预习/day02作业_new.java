1.什么是变量?变量的定义格式?要使用变量需要注意什么?

2.Java中的数据类型分几类?基本数据类型有哪些?

3.数据类型转换：
	隐式转换：
	强制转换：


	面试题：
		第一题：
		byte b1=3,b2=4,b;
		b=b1+b2;
		b=3+4;
		哪句是编译失败的呢？为什么呢？

		第二题：
		byte  by = 130;有没有问题?有问题如何解决?结果是多少呢?

		第三题:
		byte b = 10;
		b++;
		b = b + 1;
		哪句是编译失败的呢？为什么呢？
4.常见的算术运算符有哪些?
	(1)+运算符的作用有哪些?
	(2)除法和取余的区别?
	(3)++和--的使用规则?

5.常见的赋值运算符有哪些?
	(1)+=运算的作用是什么?
	(2)扩展的赋值运算符有什么特点?

6. short s = 1; s = s + 1;有没有问题?如果有怎么解决?
   short s = 1; s += 1;有没有问题?如果有怎么解决?
	
7.分析以下需求，并用代码实现：
	(1)已知一个三位数，请分别获取该三位数上每一位的数值
	(2)例如：123的个位、十位、百位，分别是3、2、1
	(3)打印格式"数字123的个位是 3, 十位是 2, 百位是 1"

8.看程序说结果，请不要提前运行？
	public class Test1 {
		public static void main(String[] args) {
			 int x = 4;
			 int y = (--x)+(x--)+(x*10);
			 System.out.println("x = " + x + ",y = " + y);
		}
	}


	