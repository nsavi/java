#include<stdio.h>
#define size 3
char stack[size];
int rear = -1;
int front = -1;

void enqueue(char chr)
{
    if(rear == size -1)
    {
        printf("Queue is full");
    }
    else
    {
        if(front == -1)
            front = 0;
        rear=rear+1;
        stack[rear]=chr;
    }
}

void dequeue()
{
    if(front == -1)
        printf("Queue is empty !");
    else
    {
        printf("%c\n",stack[front]);
        front++;
        if(front > rear)
            front = rear = -1;
    }
}

int main()
{
    int i;
    char c;
    for(i=0;i<size;i++)
    {
        scanf("%c\n",&c);
        enqueue(c);
    }
    dequeue();
    dequeue();
    dequeue();
    return 0;
}
