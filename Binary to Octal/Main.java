#include<stdio.h>
#include<math.h>

int main()
{
  int binary,octal,decimal;
  int r,rr;
  scanf("%d",&binary);
  int i=0;
  while (binary!=0)
  {
    r=binary%10;
    decimal+=r*pow(2,i);
    binary=binary/10;
    i=i+1;
}i=0;
  while (decimal!=0)
  {
    rr=decimal%8;
    octal+=rr*pow(10,i);
    decimal/=8;
    i=i+1;
}
  printf("%d",octal);
}