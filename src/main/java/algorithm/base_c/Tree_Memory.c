/*
 *树的存储 
 *
 *
 */
 
//双亲表示法 
#define MAX 100
typedef struct TNode{
	DataType data;
	int parent;
}TNode;

//树的定义 
typedef struct{
	TNode tree[MAX];
	int root;
	int num;
}PTree;


//孩子表示法

typedef struct ChildNode{
	int Child;
	Struct ChildNode * next;
}ChildNode;
//顺序表结构定义  
typedef struct {
	DataType * FirstChild;
}DataNode;
//树定义
typedef struct{
	DataNode nodes[MAX];
	int root;
	int num;
}CTree;


//孩子兄弟表示法
typedef struct CSNode{
	DataType data;
	Struct CSNode * FirstChild;
	Struct CSNode * NextSibling;
}CSNode, * CSTree;


 
