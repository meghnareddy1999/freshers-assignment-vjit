package com.codebind;

public class CouponCode
{
public static void main(String[] args)
{
String result=makeCode(8);
System.out.println(result);
}
public static String makeCode(int length)
{
String code="";
for(int i=0;i<=5;i++)
{
code=code+randomCharacter("abcdefghijklmnopqrstuvwxyz");
}
String randomDigit=randomCharacter("0123456789");
String randomSymbol=randomCharacter("!@#$%^&*");
code=insertAtRandom(code,randomDigit);
return code;
}


  //Get random character from string
public static String randomCharacter(String characters)
{
int n=characters.length();
int r=(int)(n*Math.random());
return characters.substring(r,r+1);
}


//Insert one string into another at a random position
public static String insertAtRandom(String str,String toInsert)
{
int n=str.length();
int r=(int)((n+1)*Math.random());
return str.substring(0,r)+toInsert+str.substring(r);
}
}

