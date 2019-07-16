#include<stdio.h>
int main()
{
  	int a[100],n,i;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  int n1=-1,n2=-1,n11,n22;
  scanf("%d%d",&n11,&n22);
  for(i=0;i<n;i++)
  {
    if(a[i]==n11)
    {
      n1=i;
    printf("Element 1 index = %d",n1);
      break;
     }
}if(i==n)
    printf("Element 1 index = %d",n1);
    
  printf("\n");
  for(i=0;i<n;i++)
  {
    if(a[i]==n22)
    {
      n2=i;
    printf("Element 2 index = %d",n2);
      break;
     }
}if(i==n)
     printf("Element 2 index = %d",n2);
    
}