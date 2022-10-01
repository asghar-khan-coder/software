#include<stdio.h>
int main()
{
    int lcotch=4;
    switch(lcotch){
    case 1:
        {
            printf("train will stop on the station\n");
            break;
        }

    case 2:
        {
            printf("train will not stop\n");
            break;
        }

    case 3:
        {

        printf("slow train\n");
        break;
        }

    case 4:
        {
            printf("fast train\n");
            break;
        }


    default :
        {

            printf("default");
        }
    }
}
