#include<stdio.h>
void main()
{
  int base,exponent;
  int result=1;
  printf("Enter a base number: ");
  scanf("%d",&base);
  printf("enter the exponent: ");
  scanf("%d",&exponent);
  while(exponent!=0)//decrement exponent
  {
    result=result*base;
    exponent--;
  }
printf("The result is %d",result);
  }