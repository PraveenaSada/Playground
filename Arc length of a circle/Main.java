#include<stdio.h>
int main()
{
float r,a,res;
scanf("%f%f",&r,&a);
res=(float)(2*3.14*r)*(a/360);
printf("%0.2f",res);
return 0;
}