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
	  //����Ľ����s1������s2,��˵����new�������ڶ��еĶ�����ֱ�Ӷ���ı���������ջ�еģ���������ġ�
	  System.out.println(s1==s3);
	  //����Ľ����s1����s3��
	  System.out.println(s1.getClass()+"@"+s1.hashCode());
	  System.out.println(s2.getClass()+"@"+s2.hashCode());
	  System.out.println(s3.getClass()+"@"+s3.hashCode());
	  //����Ľ����s1��s2��s3���ߵĵ�ַ����ͬ��
	  //������������������ĵ�ַ��ͬ��
	  //����˵���ˣ�ֱ�Ӷ��������������������ͬһ���ַ��ӵ����ͬ��ֵ����ַ�д�ŵ���������ͬ�ģ���
	  
	  String s4=s1;
	  System.out.println(s4.hashCode());
	  System.out.println(s4==s1);
	  //��s1��ֵû�ı�֮ǰ������Ľ����ʾs4��s1��ֵ��������ߵĵ�ַҲ���
	  s1="hello";
	  System.out.println(s4);
	  System.out.println(s1);
	  System.out.println(s1.hashCode());
	  System.out.println(s4.hashCode());
	  //��s1��ֵ�ı����������Ľ���������ߵĵ�ַ������ͬ���ҵ�s1��ֵ�ı��s4��ֵ��û�б䡣
	  
	  /*ʹ��System.out.println(obj.hashcode())�����ʱ����Ĺ�ϣ�룬 �����ڴ��ַ��
	  ��Java���ǲ����ܵõ������������ڴ��ַ�ģ���ΪJava�ж�����JVM����Ĳ���ֱ�Ӳ�����
	  ֻ��˵��ʱ��ӡ����Hash���ʾ�˸ö�����JAVA������е��ڴ�λ�ã�Java���������ݸ�hash��
	  �����������ĵĶѿռ��и��ö������һ����ַ.���Ǹõ�ַ�ǲ���ͨ��java�ṩ��api��ȡ�ġ� */
	  
	 /*��ִ��String a="abc";ʱ��JAVA���������ջ�д�������char�͵�ֵ'a'��'b'��'c',Ȼ���ڶ��д���һ��String����
	  ����ֵ��value���Ǹղ���ջ�д���������char��ֵ��ɵ�����{'a','b','c'},�������´�����String����
	  �ᱻ��ӵ��ַ������С�������ǽ���ִ��String b=new String��"abc"�������룬����"abc"�Ѿ����������������ַ������У�
	  ���JAVA�����ֻ���ڶ����´���һ��String���󣬵�������ֵ��value���ǹ���ǰһ�д���ִ��ʱ��ջ�д�����
	  ����char��ֵֵ'a'��'b'��'c'.*/
	  
	 //String a="abc"; ������һ������ ������������ַ�������� �����Ƕ��� ����ֻ������һ������  
	 //��String b=new String��"abc"�������ַ����������Լ� ���ﶼ�ж�����������������
	 //String a="abc"; �ڳ�������
	 //new String��"abc"����  �ڶ���
	 //String str1 = "abc";���õĶ�����ջ�����߽�String�أ��С�
	 //String str1 =new String ��"abc"���� ���õĶ������ڴ�/���С�
	}
}



