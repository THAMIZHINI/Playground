#include<stdio.h>
int main()
{
  int a,b,n,c;
  scanf("%d",&n);
  a=n/100;
  b=n%10;
  c=a+b;
  printf("%d",c);
  return 0;
}