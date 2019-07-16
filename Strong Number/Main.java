#include <stdio.h>
int main() {
  int n,s=0,r,t,i,f;
  scanf("%d",&n);
  t=n;
	while(n!=0)
  {
    r=n%10;
      f=1;
      for(i=1;i<=r;i++)
      {
        f=f*i;
      }
    s=s+f;
  
    n=n/10;
  }
  
  if(t==s)
    printf("Yes");
  else
    printf("No");
    
	return 0;
}