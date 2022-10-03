#include<stdio.h>
int main()
{
    int a = 3,b = 6,c = 9;

    printf("%d == %d \n",a,b, a == b);
    printf("%d == %d \n",a,c, a == b);
    printf("%d > %d \n",a,b, a > b);
    printf("%d > %d \n",a,c, a >c );
    printf("%d < %d \n",a,b, a < b);
    printf("%d < %d \n",a,c, a < c);
    printf("%d != %d \n",a,b, a != b);
    printf("%d != %d \n",a,c, a != c);
    printf("%d >= %d \n",a,b, a >= b);
     printf("%d >= %d \n",a,c, a >= c);
     printf("%d <= %d \n",a,b, a <= b);
      printf("%d <= %d \n",a,c, a <= c);

      return 0;
}
