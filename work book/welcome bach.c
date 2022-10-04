#include<stdio.h>

int main(){

    printf("Welcome back Mr. Asghar khan\n");
    printf("Pleased to meet you\n");

    printf("Now you can do Arithmetic opreations\n");

    int num1,num2,answer;

    printf("Enter your first number : ");
    scanf("%d",&num1);

    printf("Enter your second number : ");
    scanf("%d",&num2);

    answer = num1+num2;
    printf("\nThe addition value is : %d",answer);

    answer = num1-num2;
    printf("\nThe Substraction value is : %d",answer);

    answer = num1*num2;
    printf("\nThe multiplication value is : %d",answer);

    answer = num1/num2;
    printf("\nThe Division value is : %d",answer);

    answer = num1%num2;
    printf("\nThe Modulas value is : %d",answer);

    return 0;
}
