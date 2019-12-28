#include <stdio.h>

#include <malloc.h>

#define MAXSIZE 50

typedef int datatype;

typedef struct{
	datatype data[MAXSIZE];
	int top;
}SeqStack;

SeqStack* Init_SeqStack();//初始化

int Empty_SeqStack(SeqStack *s);//判空

int Push_SeqStack(SeqStack *s, datatype x);//入栈

int Pop_SeqStack(SeqStack* s, datatype *x);//出栈

datatype Top_SeqStack(SeqStack *s);//取栈顶元素

//初始化
SeqStack* Init_SeqStack(){
	SeqStack *s;
	s = (SeqStack*)malloc(sizeof(SeqStack));
	s->top = -1;
	return s;
}
//判空
int Empty_SeqStack(SeqStack *s){
	if (s->top == -1)
		return 1;
	else
		return 0;
}
//入栈
int Push_SeqStack(SeqStack *s, datatype x){
	if (s->top == MAXSIZE-1)
		return 0;
	else{
		s->top++;
		s->data[s->top] = x;
		return 1;
	}
}
//出栈
int Pop_SeqStack(SeqStack* s, datatype *x){
	if (Empty_SeqStack(s))
		return 0;
	else{
		*x = s->data[s->top];
		s->top--;
		return 1;
	}
}
//取栈顶元素
datatype Top_SeqStack(SeqStack *s){
	if (Empty_SeqStack(s))
		return 0;//空栈
	else
		return (s->data[s->top]); 
}
int main(void){
	
	SeqStack* s1;
	s1 = Init_SeqStack();//初始化

	printf("%d\n",Empty_SeqStack(&s1));//判空
	
	int in_stop = MAXSIZE;
	int data_in = 0, count = 1;
	printf("请输入入栈元素(个数少于50个，输入-1结束)：\n");
	while(in_stop-- && data_in != -1){
		scanf("%d",&data_in);
		if(data_in == -1)
			break;
		printf("Push_In Stack: result : %d\n",Push_SeqStack(s1, data_in));
		count++;
	}

	printf("Get_Top: result: %d\n",Top_SeqStack(s1));
	
	int data_out;
	int out_stop = count-1;
	printf("元素依次出栈：\n");
	while(out_stop--){
		Pop_SeqStack(s1, &data_out);
		printf("data: %d\n",data_out);
	}
	
	datatype Top_SeqStack(SeqStack *s);//取栈顶元素
	return 0;
}
