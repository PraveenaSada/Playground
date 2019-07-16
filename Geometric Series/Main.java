#include<stdio.h>
#include<math.h>
int main()
{
 int n,r1,r2;
  scanf("%d",&n);
  if(n%2==1)
  {
    n=n/2;
    r1=pow(2,n);
    printf("%d",r1);
  }
  else if(n%2==0)
  {
    n=(n/2)-1;
    r2=pow(3,n);
    printf("%d",r2);
  }
  return 0;
}