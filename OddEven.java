class MyThread extends Thread
{
public void run()
{
for(int i=0;i<=21;i++)
if(i%2==0)
{
System.out.println("Even Thread:"+i);
}
}
}
class MyThread1 extends Thread
{
public void run()
{
for(int i=0;i<=21;i++)
if(i%2==1)
{
System.out.println("Odd Thread:"+i);
}
}
}
class OddEven
{
public static void main(String args[])
{
MyThread m1=new MyThread();
m1.start();
MyThread1 m2=new MyThread1();
m2.start();
System.out.println("ABHISHEK CHAUHAN,05");
}
}
