
//����������
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

//�����ҽ��ǰ��
BiThrTree InPre(BiThrTree p){
	if (p->Ltag=1)	pre=p->LChild;
	else{
		for (q=q->LChild; q->Rtag==0; q=q-RChild);
		pre=q;
	}
	return (pre);
}

//�����ҽ����
BiThrTree InNext(BiTree p){
	if (p->Rtag == 1)	next=p->RChild;
	else{
		for (q=p->Rchild; q->Ltag==0; q=q->LChild);
		next=q;
	}
	return (next);
}

//������������������ĵ�һ����� 
BiThrTree InFirst(BiThrTree bt){
	BiThrTree p=bt;
	if (p!=NULL)	return (NULL);
	while (p->Ltag==0)	p=p->LChild;
	return p;
}

//��������������
void TinOrder(BiThrTree root){
	BiThrTree p;
	p=InFirst(root);
	while (p!=NULL){
	Visit(p->data);
	p=InNext(p); 
} 
