#include <stdio.h>
#include <malloc.h>

typedef char DataType;

typedef struct Node{
	DataType data;
	struct Node * Lchild;
	struct Node * Rchild;
}BiNode, * BiTree;

void BiTree_Print(DataType p);//��ӡ

void BiTree_Creat(BiTree * s);//�޷���ֵ���򴴽�������

void BiTree_Ergodic_H(BiTree root);//������������(�ݹ飩

void BiTree_Ergodic_M(BiTree root);//������������(�ݹ飩

void BiTree_Ergodic_E(BiTree root);//������������(�ݹ飩

void BiTree_Print(DataType p);//��ӡ
 
//�޷���ֵ���򴴽������� 
void BiTree_Creat_H(BiTree * s){
	*s = (BiNode*)malloc(sizeof(BiNode));
	(*s)->Lchild = NULL;
	(*s)->Rchild = NULL;
	char get_data = getchar();
	if (get_data == '\n')	return;
	if (get_data == '#')	(*s) = NULL;
	else{
		(*s)->data = get_data;
		BiTree_Creat_H(&((*s)->Lchild));
		BiTree_Creat_H(&((*s)->Rchild));
	}
}

//������������(�ݹ飩
void BiTree_Ergodic_H(BiTree root){
	if (root != NULL){
		BiTree_Print(root->data);
		BiTree_Ergodic_H(root->Lchild);
		BiTree_Ergodic_H(root->Rchild);
	}else{
		BiTree_Print(NULL);
	}
}

//������������(�ݹ飩
void BiTree_Ergodic_M(BiTree root){
	if (root != NULL){
		BiTree_Ergodic_M(root->Lchild);
		BiTree_Print(root->data);
		BiTree_Ergodic_M(root->Rchild);
	}else{
		BiTree_Print(NULL);
	}
}

//������������(�ݹ飩
void BiTree_Ergodic_E(BiTree root){
	if (root != NULL){
		BiTree_Ergodic_E(root->Lchild);
		BiTree_Ergodic_E(root->Rchild);
		BiTree_Print(root->data);
	}else{
		BiTree_Print(NULL);
	}
}

//ĳ��Ҷ�ӽ��ĸ���
int BiTree_CountLeaves(BiTree root, int layer){
	int count;//��¼Ҷ�Ӹ���
	int i = 1;//�����жϲ��� 
	if (i == layer && (root->Lchild == NULL) && (root->Rchild == NULL)){
		count++;
	}else{
		BiTree_CountLeaves(root->Lchild, i+1);
		BiTree_CountLeaves(root->Rchild, i+1);
	}
	return count;
}
 
//��ӡ
void BiTree_Print(DataType p){
//	if (p != NULL)
//		printf(" %c ",p);
//	else
//		printf("#");
	if (p != NULL)
		printf("%c",p);
	else
	;
}


int main(void){
	
	BiTree t;
	
	printf("Please input the number of the tree: ");
	BiTree_Creat_H(&t);
	printf("\n\n");
	
	printf("This is the result of first order traversal:\n");
	BiTree_Ergodic_H(t);
	printf("\n\n");
	printf("This is the result of middle order traversal:\n");
	BiTree_Ergodic_M(t);
	printf("\n\n");
	printf("This is the result of end order traversal:\n");
	BiTree_Ergodic_E(t);
	printf("\n\n");
	
	printf("The leaves of this layler : %d",BiTree_CountLeaves(t, 1));
	
	return 0;
}
