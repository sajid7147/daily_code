#include<stdio.h>
#include<stdlib.h>
struct exam
{
  int marks;
  char subject[30];
};
void main()
{
struct exam *ptr;
int i,n;
printf("enter the number of exams :");
scanf("%d",&n);
ptr=(struct exam*)malloc(n*sizeof(struct exam) );
for(i=0;i<n;i++)
{
  printf("enter the name of subject and its marks :");
  scanf("%s %d",&(ptr+i)->subject,&(ptr+i)->marks);
}
printf("\nDisplaying information :\n");
for(i=0;i<n;i++)
  printf("%s\t%d\n",(ptr+i)->subject,(ptr+i)->marks);
}