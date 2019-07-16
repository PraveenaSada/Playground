#include<stdio.h>
int main()
{
int n1,n2,i,n,gcd;
  scanf("%d%d",&n1,&n2);
  if(n1>n2)
    n=n2;
  else 
    n=n1;
  for(i=1;i<=n;i++)
  {
    if(n1%i==0&&n2%i==0)
      gcd=i;
  }
  int lcm=(n1*n2)/gcd;
  printf("%d",lcm);
  return 0;
}