#include<stdio.h>
void main()
{
  char c[100];
  int i;
  printf("enter a string :");
  scanf("%s",c);
  for(i=0;c[i]!='\0';i++);
  printf("the length of string is %d",i);
  
}