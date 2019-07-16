#include <stdio.h>
#include<math.h>
int main() {
	int n,r,a=0,t,i=0,n1;
  scanf("%d",&n);
  t=n;
  n1=n;
  while(n1!=0)
  {
    i++;
    n1=n1/10;
   
  }
 
  while(n!=0)
  {
    r=n%10;
    a=a+pow(r,i);
    n=n/10;
  }
  if(t==a)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}