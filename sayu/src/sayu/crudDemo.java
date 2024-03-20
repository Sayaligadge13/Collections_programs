package sayu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class crudDemo {
	private int empno;
	private String name;
	private int salary;

	public crudDemo(int empno, String name, int salary) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "crudDemo [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {

List<crudDemo>c=new ArrayList<>();
int ch;
Scanner s=new Scanner(System.in);
do
{
System.out.println("1.Insert\n2.Display\n3.Search\n4.Delete\n5.Update");
System.out.println("Enter your choice:");
ch=s.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter Empno:");
int eno=s.nextInt();
System.out.println("Enter Empname:");
String name=s.next();
System.out.println("Enter Salary:");
int salary=s.nextInt();
c.add(new crudDemo(eno,name,salary));//constructor called here
break;
case 2:
//System.out.println(c);
System.out.println("----------------------");
Iterator<crudDemo> i=c.iterator();
while(i.hasNext())
{
	crudDemo e=i.next();
	System.out.println(e);
}
System.out.println("----------------------");
break;
case 3:
boolean found=false;
System.out.println("Enter the employee no to search:");
int empno=s.nextInt();
System.out.println("----------------------");
i=c.iterator();
while(i.hasNext())
{
	crudDemo e=i.next();
	if(e.getEmpno()==empno)
	{
	System.out.println(e);
	found=true;
}
}
if(!found)
{
	System.out.println("Record Not Found......");
}
System.out.println("----------------------");
break;
case 4:
found=false;
System.out.println("Enter the employee no to delete:");
empno=s.nextInt();
System.out.println("----------------------");
i=c.iterator();
while(i.hasNext())
{
	crudDemo e=i.next();
	if(e.getEmpno()==empno)
	{
	i.remove();
	found=true;
}
}
if(!found)
{
	System.out.println("Record Not Found......");
}
else
{
	System.out.println("Record deleted Successfully......");
}
System.out.println("----------------------");
break;
case 5:
found=false;
System.out.println("Enter the employee no to update:");
empno=s.nextInt();
System.out.println("----------------------");
ListIterator<crudDemo>li=c.listIterator();
while(li.hasNext())
{
	crudDemo e=li.next();
	if(e.getEmpno()==empno)
	{
	System.out.println("Enter new name:");
	name=s.next();
	System.out.println("Enter new Salary:");
	salary=s.nextInt();
	li.set(new crudDemo(empno,name,salary));
	found=true;
	}
}
if(!found)
{
	System.out.println("Record Not Found......");
}
else
{
	System.out.println("Record updated Successfully......");
}
System.out.println("----------------------");
break;
}
}
while(ch!=0);


	}

}
