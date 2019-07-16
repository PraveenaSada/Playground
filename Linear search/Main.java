#include<stdio.h>
int main()
{
  int n,a[40],f,i,pos,count=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d",&f);
  for(i=0;i<n;i++)
  {
  if(f==a[i])
  {
    count=1;
    pos=i;
    break;
  }}
  if(count==1)
    printf("%d",pos+1);
  else 
    printf("%d isn't present in the array.",f);
  return 0;
}