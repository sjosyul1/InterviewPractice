package com.practice.interview;


import java.util.*;
class Test
{
public static void main(String[] args)
{
HashMap<String, Integer> h=new HashMap();
h.put("sambha",100);
h.put("veeru",100);
h.put("durga",100);
System.out.println(h);


Set s=h.keySet();
System.out.println(s);
Collection c=h.values();
System.out.println(c);
Set s1=h.entrySet();
System.out.println(s1);
Iterator itr=s1.iterator();
while (itr.hasNext())
{
Map.Entry m1=(Map.Entry)itr.next();
System.out.println(m1.getKey()+"------"+m1.getValue());
if (m1.getKey().equals("sambha"))
{
m1.setValue(10000);
}
}
System.out.println(s1);
}
}