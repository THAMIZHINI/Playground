#include <stdio.h>
int main() { int n;
	scanf("%d",&n);
 int fact=1;
  for(int f=1;f<=n;f++)
  {
    fact=fact*f;
  }
  printf("%d",fact);
	return 0;
}