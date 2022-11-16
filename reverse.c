#include<stdio.h>
void main()
{
  char str[100],rev[100];
  int i,j,len;
  printf("Enter a string: ");
  gets(str);
  j=0;
  for(i=0;str[i]!='\0';i++);
  len=i;
  for(i=len-1;i>=0;i--){
    rev[j++]=str[i];}
  printf("\n the reversed string is %s",rev);

}