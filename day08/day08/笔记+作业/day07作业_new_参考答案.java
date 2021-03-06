1、构造方法的格式是什么？有哪些注意事项？
	答：参考答案，
		无参构造格式：
			修饰符 类名(){
			}
		带参构造格式：
			修饰符 类名(参数类型1 参数1,参数类型2 参数2...){
			}
		注意事项：	
			构造方法的方法名与类名相同
			构造方法没有返回之类，连void也没有
			没有具体的返回值return;

2、构造方法可以重载吗？ 里边可以有return语句吗？
	答：参考答案，
		构造方法可以重载，里边可以有return语句。

3、给成员变量赋值有几种方式？有什么区别？
	答：参考答案，
		给成员变量赋值有两种方式。
		第一种是setXxx()方法，只能修改属性值 
		第二种是通过构造方法，是用来给对象中属性进行初始化的

4、static关键字有什么特点，使用的时候有什么注意事项？
	答：参考答案，
		特点：
			A：随着类的加载而加载
			B：优先于对象存在
			C；被类的所有对象共享
			D：可以通过类名点的方式调用
		注意事项：
			A：静态方法中是没有this关键字
			B：静态只能访问静态

5、public static void main(String[] args) {
		Person p = new Person();  
   }，这段代码在内存中做了哪些事情？
	答：参考答案，
		A：通过类加载器，将Person类的字节码文件加载到内存中。
		B：在main函数中创建Person类的引用p，等待接收堆内存中传来的地址值。
		C：成员变量进堆，系统给出默认值。
		D：对成员变量进行显示初始化（如果有）。
		E：构造方法进栈，对成员变量进行赋值。执行完后构造方法弹栈。
		F：将堆中创建好的Person对象的地址值赋值给main函数的p。至此，对象创建完毕。

6、静态变量和成员变量的区别是什么？
	答：参考答案，
		 静态变量也叫类变量，成员变量也叫对象变量。
		 A：所属不同
			 静态变量属于类，所以也称为为类变量
			 成员变量属于对象，所以也称为实例变量(对象变量)
		 B：内存中位置不同
			 静态变量存储于方法区的静态区
			 成员变量存储于堆内存
		 C：内存出现时间不同
			 静态变量随着类的加载而加载，随着类的消失而消失
			 成员变量随着对象的创建而存在，随着对象的消失而消失
		 D：调用不同
			 静态变量可以通过类名调用，也可以通过对象调用
			 成员变量只能通过对 象名调用

7、如何使用JDK提供的帮助文档？
	答：参考答案，
		 A：找到文档，打开文档
		 B：点击显示，找到索引，出现输入框
		 C：在输入框中输入要查找的类名
		 D：看下类的说明，了解这个类是做什么用的。
		 E：看类的结构（是否需要导包）
		 F：看该类有无构造方法：
			有：该类的成员一般是非静态的，需要创建对象然后调用。
			无：该类的成员一般是静态的，可以通过类名点的方式调用。
		 G：按照正常的逻辑调用方法即可。

8、通过Math类如何获取1-100之间的随机数？
	答：参考答案，
		int number = (int)(Math.random()*100)+1;

9、需求：定义一个长方形类,定义求周长和面积的方法，然后定义一个测试类进行测试。
	答：参考答案见 Day07作业代码（文件夹）中的Test01.java文件。
		
10、根据需求，完成如下代码（按照标准格式写），并在测试类中进行测试。
	需求一：
		员工类Employee
			属性：姓名name,工号id,工资salary 
			行为：显示所有成员信息的方法show()
		答：参考答案见 Day07作业代码（文件夹）中的Test02.java文件。

	需求二：
		动物类Animal
			属性：姓名name,年龄age
			行为：吃饭eat，睡觉sleep
		答：参考答案见 Day07作业代码（文件夹）中的Test03.java文件。

	需求三：
		人类Person
			属性：姓名name,年龄age,性别gender
			行为：学习study,睡觉sleep
		答：参考答案见 Day07作业代码（文件夹）中的Test04.java文件。

11、自学Random类，然后通过Random类来实现猜数字的小游戏。
	 答：参考答案见 Day07作业代码（文件夹）中的Test05.java文件。