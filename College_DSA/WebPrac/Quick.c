#include <stdio.h>

void Quicksort(int a[], int beg, int end);
int partition(int a[], int beg, int end);

int main()
{
    int n, i;
    printf("Enter the size of the array: ");
    scanf("%d", &n);
    printf("\n");
    int a[n];

    printf("Enter the elements into the array: \n");
    for(i=0; i<n; i++)
    {
        printf("Enter an element: ");
        scanf("%d", &a[i]);
    }

    printf("\n");
    printf("Array before sorting is: ");
    for(i=0; i<n; i++)
    {
        printf("%d ", a[i]);
    }

    Quicksort(a, 0, n-1);
    printf("Array after Quick Sort is: ");
    for(i=0; i<n; i++)
    {
        printf("%d ", a[i]);
    }
}

void Quicksort(int a[], int beg, int end)
{
    int loc;
    if(beg<end)
    {
        loc = partition(a, beg, end);
        Quicksort(a, loc+1, end);
        Quicksort(a, beg, loc-1);
    }
}

int partition(int a[], int beg, int end)
{
    int left, right, loc, temp, flag=0;
    left=beg;
    right=end;
    loc=left;
    while (flag!=1)
    {
        while(a[loc]<a[right] && loc!=right)
        {
            right--;
        }
        if(loc==right)
        {
            flag=1;
        }
        else if(a[loc]>a[right])
        {
            temp=a[loc];
            a[loc]=a[right];
            a[right]=temp;
            loc=right;
        }
        if(flag!=1)
        {
            while(a[loc]>a[left] && loc!=left)
            {
                left++;
            }
            if(loc==left)
            {
                flag=1;
            }
            else if(a[loc]<a[left])
            {
                temp=a[loc];
                a[loc]=a[left];
                a[left]=temp;
                loc = left;
            }
        }
    }

    return loc;
}
