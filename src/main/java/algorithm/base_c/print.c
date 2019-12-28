#include <stdio.h>

int main(void){
	int a;
	do{
		printf("\t\t\t请输入你的选择：\n\n\n");
		printf("\t\t\t1----------创建随机迷宫\n");
		printf("\t\t\t2----------求解\n");
		int a;
		scanf("%d", &a);
		switch(a){
			case 2:
				printf("抱歉迷宫文件有误，请重新创建迷宫！！！") ;
		}
	}while(a != 0);
	return 0;
}
