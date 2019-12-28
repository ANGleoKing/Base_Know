#include <stdio.h>

//������
int Count = 0; 

//ͳ�ƽ�����
void PreOrder(BiTree root){
	if (root){
		Count++;
		PreOrder(root->LChild);
		PreOrder(root->RChild);
	}
}

//���Ҷ���
void InOrder(BiTree root){
	if (root){
		inPreOrder(root->LChild);
		if (root->LChild==NULL && root->Rchild==NULL){
			print(root->data);
			InOrder(root->EChild);
		}
	}
}

//ͳ��Ҷ�ӽ����Ŀ
int leaf(Bitree root){
	int nl, nr;
	if (root==NULL)	return 0;
	if ((root->LChild==NULL) && (root->RChild==NULL)){
		nl=leaf(root->LChild);
		nr=leaf(root->RChild);
		return (nl+nr);
	}
}

//���߶ȣ�ȫ�ֱ��� 
int depth;

//�������߶�
void TreeDepth(BiTree root, int h){
	if (root){
		if (h>depth)	depth=h;
		TreeDepth(root->LChild, h+1);
		TreeDepth(root->RChild, h+1); 
	}
}

//�������߶�
int PostTreeDepth(BiTree root){
	int hl, hr, h;
	if (root==NULL)	return 0;
	else {
		hl=PostTreeDepth(root->LChild);
		hr=PostTreeDepth(root->RChild);
		h=(hl>hr ? hl : hr) + 1;
		return h;
	}
} 

//���˫��
BiTree parent(BiTree root, BiTree current){
	BiTree * p;
	if (root==NULL)	return NULL;
	if (root->LChild==current || root->RChild==current){
		return root;
	}
	p=parent(root->LChild, current);
	if (p!=NULL)	return p;
	else return(parent(root->RChild, current));
} 

//�����������ж�
int like(BiTree t1, BiTree t2){
	int like1, link2;
	if (t1==NULL && t2==NULL)	return 1;
	else if(t1==NULL || t2 == NULL)	return 0;
	else {
		like1=like(t1->LChild, t2->LChild);
		like2=like(t1->RChild, t2->Rchild);
		return (like1 && like2);
	}
}

//��״��ӡ������
void PrintTree(BiTree root, int h){
	if (root==NULL)	return;
	PrintTree(root->RChild, h+1);
	for (int i=0; i<h; i++){
		printf(" ");
	} 
	printf("%c\n", root->data);
	PrintTree(root->LChild, h+1);
}  

