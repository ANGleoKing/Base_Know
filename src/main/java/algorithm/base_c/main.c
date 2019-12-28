#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char st = "";
	while (scanf("%s", &st)==1 && st != 'q'){
		printf("you input : %s\n", &st);
	}
	system("pause"); 
}
