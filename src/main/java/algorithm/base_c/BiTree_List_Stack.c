#include <stdio.h>

#include <malloc.h>

#define MAXSIZE 50

typedef int datatype;

typedef struct{
	datatype data[MAXSIZE];
	int top;
}SeqStack;

SeqStack* Init_SeqStack();//��ʼ��

int Empty_SeqStack(SeqStack *s);//�п�

int Push_SeqStack(SeqStack *s, datatype x);//��ջ

int Pop_SeqStack(SeqStack* s, datatype *x);//��ջ

datatype Top_SeqStack(SeqStack *s);//ȡջ��Ԫ��

//��ʼ��
SeqStack* Init_SeqStack(){
	SeqStack *s;
	s = (SeqStack*)malloc(sizeof(SeqStack));
	s->top = -1;
	return s;
}
//�п�
int Empty_SeqStack(SeqStack *s){
	if (s->top == -1)
		return 1;
	else
		return 0;
}
//��ջ
int Push_SeqStack(SeqStack *s, datatype x){
	if (s->top == MAXSIZE-1)
		return 0;
	else{
		s->top++;
		s->data[s->top] = x;
		return 1;
	}
}
//��ջ
int Pop_SeqStack(SeqStack* s, datatype *x){
	if (Empty_SeqStack(s))
		return 0;
	else{
		*x = s->data[s->top];
		s->top--;
		return 1;
	}
}
//ȡջ��Ԫ��
datatype Top_SeqStack(SeqStack *s){
	if (Empty_SeqStack(s))
		return 0;//��ջ
	else
		return (s->data[s->top]); 
}
int main(void){
	
	SeqStack* s1;
	s1 = Init_SeqStack();//��ʼ��

	printf("%d\n",Empty_SeqStack(&s1));//�п�
	
	int in_stop = MAXSIZE;
	int data_in = 0, count = 1;
	printf("��������ջԪ��(��������50��������-1����)��\n");
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
	printf("Ԫ�����γ�ջ��\n");
	while(out_stop--){
		Pop_SeqStack(s1, &data_out);
		printf("data: %d\n",data_out);
	}
	
	datatype Top_SeqStack(SeqStack *s);//ȡջ��Ԫ��
	return 0;
}
