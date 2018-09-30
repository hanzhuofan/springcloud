package org.eureka.client.regex;
/**
*@author   created by hanzhuofan  2018.09.30
*/
class MyObj{
    public int b=99;
}
public class ReferenceAndValue {
	 public static void main(String[] args) { 
		 ReferenceAndValue t = new ReferenceAndValue(); 
	        int a=99; 
	        t.test1(a);//这里传递的参数a就是按值传递 
	        System.out.println(a);
	         
	        MyObj obj=new MyObj(); 
	        t.test2(obj);//这里传递的参数obj就是引用传递
	        System.out.println(obj.b);
	        
	        ReferenceAndValue pk=new ReferenceAndValue();
	        //String类似基本类型，值传递，不会改变实际参数的值
	        String test1="Hello";
	        pk.change(test1);
	        System.out.println(test1);
	         
	        //StringBuffer和StringBuilder等是引用传递
	        StringBuffer test2=new StringBuffer("Hello");
	        pk.change(test2);
	         
	        System.out.println(test2.toString());
	    } 
	     
	    public void test1(int a){ 
	        a=a+1;
	        System.out.println(a);
	        } 
	     
	    public void test2(MyObj obj){ 
	        obj.b=obj.b+1;
	        System.out.println(obj.b);
	        }
	    
	    public void change(String str){
	        str=str+"world";
	    }
	     
	    public void change(StringBuffer str){
	        str.append("world");
	    }
}
