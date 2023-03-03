// Online C compiler to run C program online
#include <stdio.h>
#include<string.h>
int main() {
    // Write C code here
    printf("Enetr strings\n");
    char a[100],b[100];
    scanf("%s%s",a,b);
    int i,j,l;
    l=strlen(a);
    if(strlen(b)!=l)
        return 0;
    for(i=0;i<l;i++)
    {
        for(j=0;j<l;j++)
        {
            if(a[j]!=b[(i+j)%l])
            {
                printf("%c!=%c\n",a[i],b[(i+j)%l]);
                break;
            }
        }
        if(j==l)
        {
            printf("rotated\n");
            return 0;
        }
    }
    printf("not rotated\n");

    return 0;
}
