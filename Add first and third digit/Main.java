#include<stdio.h>
int main()
{ int num;
 scanf("%d",&num);
  //int num=789;
  int num1=num/100;
  int num2=num%10;
  printf("%d",num1+num2);
  return 0;
}