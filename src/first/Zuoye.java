package first;

public class Zuoye 
{
	public static void main(String[] args) 
	{	
	int n=99;
	for(int i=n;i>=0;i--)
	{
		if(i==0)
		{System.out.println("No more bottles of beer on the wall.");}
		else if(i==1)
		{
			System.out.println(i+" bottle of beer on the wall,"+i+" bottle of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			System.out.println(i-1+" bottle of beer on the wall."+"\n");
		}
		else
		{
		System.out.println(i+" bottles of beer on the wall,"+i+" bottles of beer.");
		System.out.println("Take one down.");
		System.out.println("Pass it around.");
		if(i==2)
		{System.out.println(i-1+" bottle of beer on the wall."+"\n");}
		else
		{System.out.println(i-1+" bottles of beer on the wall."+"\n");}
		}
	}
	  System.out.println("\n");
	  String s1 = "abc";
	  String s2 = new String("abc");
	  String s3 = "abc";
	  System.out.println(s1==s2);
	  //输出的结果是s1不等于s2,这说明了new出来的在堆中的对象与直接定义的变量（放在栈中的）是有区别的。
	  System.out.println(s1==s3);
	  //输出的结果是s1等于s3。
	  System.out.println(s1.getClass()+"@"+s1.hashCode());
	  System.out.println(s2.getClass()+"@"+s2.hashCode());
	  System.out.println(s3.getClass()+"@"+s3.hashCode());
	  //输出的结果是s1、s2、s3三者的地址都相同。
	  //输出出来的两个变量的地址相同。
	  //综上说明了，直接定义出来的两个变量共用同一块地址，拥有相同的值（地址中存放的数据是相同的）。
	  
	  String s4=s1;
	  System.out.println(s4.hashCode());
	  System.out.println(s4==s1);
	  //在s1的值没改变之前输出来的结果表示s4与s1的值相等且两者的地址也相等
	  s1="hello";
	  System.out.println(s4);
	  System.out.println(s1);
	  System.out.println(s1.hashCode());
	  System.out.println(s4.hashCode());
	  //当s1的值改变后输出出来的结果表明两者的地址并不相同，且当s1的值改变后s4的值并没有变。
	  
	  /*使用System.out.println(obj.hashcode())输出的时对象的哈希码， 而非内存地址。
	  在Java中是不可能得到对象真正的内存地址的，因为Java中堆是由JVM管理的不能直接操作。
	  只能说此时打印出的Hash码表示了该对象在JAVA虚拟机中的内存位置，Java虚拟机会根据该hash码
	  最终在真正的的堆空间中给该对象分配一个地址.但是该地址是不能通过java提供的api获取的。 */
	  
	 /*当执行String a="abc";时，JAVA虚拟机会在栈中创建三个char型的值'a'、'b'和'c',然后在堆中创建一个String对象，
	  它的值（value）是刚才在栈中创建的三个char型值组成的数组{'a','b','c'},最后这个新创建的String对象
	  会被添加到字符串池中。如果我们接着执行String b=new String（"abc"）；代码，由于"abc"已经被创建并保存于字符串池中，
	  因此JAVA虚拟机只会在堆中新创建一个String对象，但是它的值（value）是共享前一行代码执行时在栈中创建的
	  三个char型值值'a'、'b'和'c'.*/
	  
	 //String a="abc"; 创建了一个对象 这个对象是在字符串池里吧 而不是堆里 所以只创建了一个对象  
	 //而String b=new String（"abc"）；在字符串常量池以及 堆里都有对象所以是两个对象
	 //String a="abc"; 在常量池中
	 //new String（"abc"）；  在堆中
	 //String str1 = "abc";引用的对象在栈（或者叫String池）中。
	 //String str1 =new String （"abc"）； 引用的对象在内存/堆中。
	}
}



