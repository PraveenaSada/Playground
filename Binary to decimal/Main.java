#include<stdio.h>
#include<math.h>
int main()
{
  int decimal=0 ,binary,r,i;
  scanf("%d",&binary);
  i=0;
  while(binary!=0)
  {
    r=binary%10;
    decimal+=r*pow(2,i);
    binary/=10;
    i=i+1;
  }
  printf("%d",decimal);
  
  return 0;
}