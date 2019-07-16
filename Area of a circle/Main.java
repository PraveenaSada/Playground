#include<stdio.h>
int main()
{
  int d;
  scanf("%d",&d);
  float r=(float)d/2;
  float res;
  res=(float)3.14*r*r;
  printf("%0.2f",res);
  return 0;
}