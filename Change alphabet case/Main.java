#include <stdio.h>
int main() {
	char i;
  scanf("%c",&i);
  if((i>='a')&&(i<='z'))
    i=i-32;
  else if((i>='A')&&(i<='Z'))
    i=i+32;
  printf("%c",i);
	return 0;
}