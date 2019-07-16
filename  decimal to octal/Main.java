#include<stdio.h>
#include<math.h>
int main()
{
  int octal=0 , decimal,r,i;
  scanf("%d",&decimal);
  i=0;
  while(decimal!=0)
  {
    r=decimal%8;
    octal+=r*pow(10,i);
    decimal/=8;
    i=i+1;
  }
  printf("%d",octal);
  
  return 0;
}