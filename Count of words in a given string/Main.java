#include<stdio.h>

int main()
{ char s[100];
 int count=0,i;
  scanf("%[^\n]s",&s);
 for(i=0;s[i]!='\0';i++)
 {
   if(s[i]==' ')
     count=count+1;
 }
 printf("%d",count+1);
  
}