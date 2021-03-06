1、定义包的注意事项有哪些？
	答：参考答案，
		A：package语句必须是程序的第一条可执行的代码
		B：package语句在一个java文件中只能有一个
		C：如果没有package，默认表示无包名

2、带包的类如何编译和运行？
	答：参考答案，
		a:javac编译的时候带上-d即可
			javac -d . 类名.java
		b:通过java命令执行。
			java 包名.类名

3、package,import,class之间有没有顺序关系？
	答：参考答案，
		有，package必须放在类文件中的第一行，然后是import，之后是class。

4、Java中的权限修饰符有哪些？
	答：参考答案，
		共有四个，分别为: private,默认,protected,public

5、内部类的访问特点是什么？
	答：参考答案，
		a:内部类可以直接访问外部类的成员，包括私有。
		b:外部类要访问内部类的成员，必须创建对象。

6、局部内部类访问局部变量，该局部变量必须用哪个关键字修饰，为什么？
	答：参考答案，
		必须加final修饰。因为当调用这个方法时,局部变量如果没有用final修饰,他的生命周期和方法的生命周期是一样的,当方法弹栈,这个局部变量也会消失,那么如果局部内部类对象还没有马上消失想用这个局部变量,就没有了,如果用final修饰会在类加载的时候进入常量池,即使方法弹栈,常量池的常量还在,也可以继续使用。
		但是jdk1.8取消了这个事情,所以我认为这是个bug。

7、什么是匿名内部类，它的本质是什么？
	答：参考答案，
		匿名内部类指的是：没有名字的局部内部类。
		它的本质是：一个继承了该类或者实现了该接口的子类匿名对象。

8、匿名内部类的前提条件，格式分别是什么？
	答：参考答案，
		前提条件：
			必须存在一个类或者接口（这里的类可以是具体类也可以是抽象类）。
		格式：
			new 类名或者接口名(){
				重写方法;
			}
		

9、根据需求，完成如下代码（按照标准格式写），并在测试类中进行测试
	需求一：
		已知接口Play中有一个方法playGame()，再测试类中如何调用该方法？(用匿名内部类实现)
	答：参考答案见 Day10作业代码（文件夹）中的Test01.java文件。
		

	需求二：
		复习Day06-Day09的内容，并将Day06-Day09的代码题再做一遍。
		有问题及时记录，抓紧时间找老师或者同学解决。