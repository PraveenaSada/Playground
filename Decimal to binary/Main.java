#include<stdio.h>
#include<math.h>
int main()
{
  int binary=0 , decimal,r,i;
  scanf("%d",&decimal);
  i=0;
  while(decimal!=0)
  {
    r=decimal%2;
    binary+=r*pow(10,i);
    decimal/=2;
    i=i+1;
  }
  printf("%d",binary);
  
  return 0;
}