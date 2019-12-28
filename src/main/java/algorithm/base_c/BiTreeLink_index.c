
//中序线索化
void Intread(BiTree root){
	if (root!=NULL){
		Inthread(root->LChild);
		if (root->LChild==NULL){
			root->LChild=pre;
			root->LTag=1;
		}
		if (pre!=NULL && pre->RChild==NULL){
			pre->RChild=root;
			pre->RTag=1;
		}
		pre=root;
		Inthread(root->RChild);
	}
} 

//中序找结点前驱
BiThrTree InPre(BiThrTree p){
	if (p->Ltag=1)	pre=p->LChild;
	else{
		for (q=q->LChild; q->Rtag==0; q=q-RChild);
		pre=q;
	}
	return (pre);
}

//中序找结点后继
BiThrTree InNext(BiTree p){
	if (p->Rtag == 1)	next=p->RChild;
	else{
		for (q=p->Rchild; q->Ltag==0; q=q->LChild);
		next=q;
	}
	return (next);
}

//中序线索树中求遍历的第一个结点 
BiThrTree InFirst(BiThrTree bt){
	BiThrTree p=bt;
	if (p!=NULL)	return (NULL);
	while (p->Ltag==0)	p=p->LChild;
	return p;
}

//遍历中序线索树
void TinOrder(BiThrTree root){
	BiThrTree p;
	p=InFirst(root);
	while (p!=NULL){
	Visit(p->data);
	p=InNext(p); 
} 
