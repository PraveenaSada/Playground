#include<stdio.h>
int main()
{
  int num;
  scanf("%d",&num);
  int r=num/10;
  int rr=num%10;
  printf("%d",r+rr);
  return 0;
}