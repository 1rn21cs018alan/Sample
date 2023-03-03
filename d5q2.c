

// Online C compiler to run C program online
#include <stdio.h>
#include<stdlib.h>
int * sanvi(int *a,int n)
{
    int i,j,count=0,* arr;
    arr=(int*)malloc(sizeof(int));
    for(i=0;i<n;i++)
    {
        if(a[i]==0)
            continue;
        for(j=0;j<i;j++)
        {
            if(a[i]==a[j])
                break;
        }
        if(j==i)
        {
            count++;
            arr=(int*)realloc(arr,count*sizeof(int));
            arr[count-1]=a[i];
        }
    }
    return arr;
}


int main() {
    /*
    printf("enter number of ballons\n");
    int a[11]={0},i,n,t;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&t);
        if(a[t]==0)
            printf("%d ",t);
        a[t]++;
    }*/
    int arr[10]={2,3,7,1,8,2,4,9,6,8};
    int arr=sanvi(arr,10);
    for(int i=0;i<10;i++)
    {
        printf("%d ",arr[i]);
    }
    return 0;
}
