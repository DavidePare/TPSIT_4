/*
Alunno: Davide Parente
Classe: 4INA
Data 29/09/2016
Programma che fa morire il padre e fa eseguire i processi dopo
*/
#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/types.h>
main(){
   pid_t pid;
   int x,i;
   printf("\n inserire un numero da 1 a 4:");
   do{
        scanf("%d",&x);
   }while((x<0)||(x>4));
    printf("Processo padre: %d\n",getpid());
    for(i=0;i<x;i++){
        pid=fork();
        if(pid==0){
         sleep(1);
         printf("Processo figlio %d Processo padre  %d\n",getpid(),getppid());         
        }
    }
   exit(0);
}
