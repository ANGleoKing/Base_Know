/*
 *���Ĵ洢 
 *
 *
 */
 
//˫�ױ�ʾ�� 
#define MAX 100
typedef struct TNode{
	DataType data;
	int parent;
}TNode;

//���Ķ��� 
typedef struct{
	TNode tree[MAX];
	int root;
	int num;
}PTree;


//���ӱ�ʾ��

typedef struct ChildNode{
	int Child;
	Struct ChildNode * next;
}ChildNode;
//˳���ṹ����  
typedef struct {
	DataType * FirstChild;
}DataNode;
//������
typedef struct{
	DataNode nodes[MAX];
	int root;
	int num;
}CTree;


//�����ֵܱ�ʾ��
typedef struct CSNode{
	DataType data;
	Struct CSNode * FirstChild;
	Struct CSNode * NextSibling;
}CSNode, * CSTree;


 
