#include<stdio.h>

int main()
{
 char s[100];
  int count=0,i;
 
 gets(s);
  for(i=0;s[i]!='\0';i++)
  {
    count++;
  }
  printf("%d",count);
  return 0;
}