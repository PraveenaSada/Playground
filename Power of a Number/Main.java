#include <stdio.h>
#include<math.h>
int main()
{ int b,p,res;
 scanf("%d%d",&b,&p);
 if(p<0)
 {
   printf("Wrong input");
   exit(0);
 }
 int i;
 res=pow(b,p);
 printf("%d",res);
  	    
    return 0;
}