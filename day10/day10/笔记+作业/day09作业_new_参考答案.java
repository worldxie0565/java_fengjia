1、多态是什么，多态的前提条件是什么?
	答：参考答案，
		多态指的是同一事物在不同时刻表现出来的不同形态。
		前提条件：
			a:要有继承关系。
			b:要有方法重写。
			c:要有父类引用指向子类对象。

2、多态中成员访问的特点分别是什么?
	答：参考答案，
		成员变量：编译看左边(父类)，运行看左边(父类)。
		成员方法(非静态方法)：编译看左边(父类)，运行看右边(子类)。
		静态方法：编译看左边(父类)，运行看左边(父类)。：

3、多态的好处和弊端分别是什么？
	答：参考答案，
		好处：
			a：提高了代码的维护性(继承保证)
			b：提高了代码的扩展性(由多态保证)
			c：可以当作形式参数,可以接收任意子类对象
		弊端：
			父引用不能使用子类的特有属性和行为

4、什么是向上转型，什么是向下转型？
	答：参考答案，
		//假设Person是父类，SuperMan类是Person类的子类
		Person p = new SuperMan();	//向上转型
		SuperMan sm = (SuperMan)p;	//向下转型
	
5、什么是抽象类，它的特点是什么？
	答：参考答案，
		有抽象方法的类就是抽象类（或者是接口）。
		特点：
			 a:抽象类和抽象方法必须用abstract关键字修饰
				 abstract class 类名 {}
				 public abstract void eat();
			 b:抽象类不一定有抽象方法，有抽象方法的类一定是抽象类或者是接口
			 c:抽象类不能实例化，按照多态的方式，可以由其具体的子类进行实例化。
			   其实这也是多态的一种，抽象类多态。
			 d:抽象类的子类
				 要么是抽象类
				 要么重写抽象类中的所有抽象方法2016/1/15

6、抽象类的成员特点有哪些?
	答：参考答案，
		a:成员变量：
			既可以是变量，也可以是常量。abstract是否可以修饰成员变量?不能修饰成员变量
		b:构造方法：
			有构造方法，用于子类访问父类数据的初始化。
		c:成员方法：
			既可以是抽象的，也可以是非抽象的。

7、抽象类的面试题：
	A、一个类如果没有抽象方法，可不可以定义为抽象类?如果可以，有什么意义?
		答：参考答案，
			可以，这么做目的只有一个,就是不让其他类创建本类对象,交给子类完成
	B、abstract不能和哪些关键字共存，为什么？
		答：参考答案，
			abstract和static不能共存
				被abstract修饰的方法没有方法体
				被static修饰的可以用类名.调用,但是类名.调用抽象方法是没有意义的
			abstract和final不能共存
				被abstract修饰的方法强制子类重写
				被final修饰的不让子类重写,所以他俩是矛盾
			abstract和private不能共存
				被abstract修饰的是为了让子类看到并强制重写
				被private修饰不让子类访问,所以他俩是矛盾的

8、什么是接口，它的特点是什么？
	答：参考答案，
		用interface修饰的内容就是接口。
		特点：
			a:接口用关键字interface表示	
				interface 接口名 {}
			b:类实现接口用implements表示
				class 类名 implements 接口名 {}
			c:接口不能实例化
				那么，接口如何实例化呢?
				按照多态的方式来实例化。
			d:接口的子类
				可以是抽象类。但是意义不大。
				可以是具体类。要重写接口中的所有抽象方法。(推荐方案)

9、接口的成员特点有哪些？
	答：参考答案，
		成员变量；只能是常量，并且是静态的并公共的。
			默认修饰符：public static final
			建议：自己手动给出。
		构造方法：接口没有构造方法。
		成员方法：只能是抽象方法。
			默认修饰符：public abstract
			建议：自己手动给出。

10、抽象类和接口的区别是什么?
	答：参考答案，
		 A:成员区别
			 抽象类：
				 成员变量：可以变量，也可以常量
				 构造方法：有
				 成员方法：可以抽象，也可以非抽象
			 接口：
				 成员变量：只可以常量
				 成员方法：只可以抽象
				
		 B:关系区别
			 a:类与类：
				 继承关系,只能单继承,可以多层继承。
			 b:类与接口：
				 实现关系,可以单实现,也可以多实现。
				 并且还可以在继承一个类的同时实现多个接口。
			 c:接口与接口：
				 继承关系,可以单继承,也可以多继承。
				
		 C:设计理念区别
			 抽象类 被继承体现的是：”is a”的关系。抽象类中定义的是该继承体系的共性功能。
			 接口 被实现体现的是：”like a”的关系。接口中定义的是该继承体系的扩展功能。


11、根据需求，完成如下代码（按照标准格式写），并在测试类中进行测试。
	需求一：
		具体事物：基础班老师，就业班老师
		共性：姓名，年龄，讲课。
		特性：
			基础班老师讲JavaSE
			就业班老师讲Android
		答：参考答案见 Day09作业代码（文件夹）中的Test01.java文件。

	需求二：
		具体事物:基础班学生,就业班学生
		共性:姓名,年龄,学习
		特性：
			基础班学生学JavaSE
			就业班学生学Android
		答：参考答案见 Day09作业代码（文件夹）中的Test02.java文件。

	需求三：
		已知猫类和狗类：
			属性:毛的颜色,腿的个数
			行为:吃饭
			猫特有行为:抓老鼠catchMouse
			狗特有行为:看家lookHome
		答：参考答案见 Day09作业代码（文件夹）中的Test03.java文件。

	需求四：
		已知接口Play中有一个方法playGame()，再测试类中如何调用该方法？
		答：参考答案见 Day09作业代码（文件夹）中的Test04.java文件。

	需求五：
		已知动物类（姓名，年龄，吃饭，睡觉），它有两个子类，分别是猫类和狗类。
		不同的是猫吃鱼，狗吃肉。
		经过马戏团的培训后，部分猫会跳高，部分狗也会跳高。
		请写代码实现。
		答：参考答案见 Day09作业代码（文件夹）中的Test05.java文件。