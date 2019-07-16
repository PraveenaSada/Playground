#include<stdio.h>
int main()
{
  	int a[100],n,large,i;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  large=a[0];
  for(i=0;i<n;i++)
  {
    
  if(a[i]>large)
    large=a[i];
  }
  printf("%d",large);
  
}