package Day01_HelloJava;

public class Hello {
	public static void main(String[] args) {
		// 注释

		/*
		 * 多行注释
		 */

		/**
		 * 我是文档注释
		 */

		System.out.println("第二个java程序");

		// 定义一个变量
		// 这个变量的值是18

		// 18是内存中的，我们如果使用内存地址去找18的话，太费劲了所以我们使用变量去找到他 age就是变量名
		int age = 18;
		// 下面的这行代码，机会将口号中的内容输出到控制台，输出的是18，而不是age，因为会根据age变量名，找到18这个变量。

		System.out.println(age);

		double score = 91.72;
		int increment = 2;
		double secondScore = score + increment;

		int d = 1;
		long l = d;
		// 强制类型转换：将long类型的l强制转换成int类型的i 强转
		int i = (int) l;

		// 定义一个字符
		char c = 'a';
		char e = 'A';

		// 使用int类型的变量ic接受c的值
		int ic = c;
		System.out.println(ic);
		int i1;
		int i2 = 0;
		double d1;
		double d2 = 0.30;
		char c1;
		char c2 = 'n';

		String yourName = null;
		// 初始化：就是给一个变量赋值的过程，
		// 如果只创建一个变量，但是没有给这个变量赋值那么这个过程叫做声明
		String youName;// 这就是声明
		youName = "name";
		System.out.println(yourName);

		int big = 5;
		/*
		 * big is int 2 also int so big/2 get int while 2.5 will be 2
		 * 
		 * big is int 2.0 is float this time big/2.0 get the result is float so the
		 * result is 2.5
		 */

		int result = big / 2;
		double result01 = big / 2.0;
		System.out.println(result);
		System.out.println(result01);

		
		//let hight incerement
		//let itself  add 1;
		//hight++ = hight + 1;
		
		
		//++on the first is add first ,used last(++ to increase before use)
		//++on the last is used first , add last(++ to use before increase)
		int high = 180;
		high++;//181
		++high;//182
		System.out.println(high);
		
		System.out.println();
		
		
		
		
	}
}