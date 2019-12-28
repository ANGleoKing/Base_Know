
#define N 30
#define M 2*N-1

typedef struct {
	int weight;
	int parent, Lchild, Rchild;
}HTNode, HuffmanTree[M+1];

//½¨Á¢¹ş·òÂüÊ÷
void CrtHuffmanTree(HuffmanTree ht, int w[], int n){
	m=2*n-1;
	for (i=1; i<=n; i++){
		ht[i] = {w[i], 0, 0, 0}
	}
	for (i=n+1; i<=m; i++){
		ht[i] = {0, 0, 0, 0}
	}
	for (i=n+1; i<=m; i++){
		select(ht, i-1, &s1, &s2);
		ht[i].weight = ht[s1].weight + ht[s2].weight;
		ht[i].Lchild = s1;
		ht[i].Rchild = s2;
		ht[i].parent = i;
		ht[s2].parent = i;
	}
} 
