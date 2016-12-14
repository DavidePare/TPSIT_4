#include<stdio.h>
#include<pthread.h>

float b,h;
void *area(){
   float a=b*h;
   printf("\n L'area è %.2f",a);
}

void *perimetro(){
   float p=(b+h)*2;
   printf("\n Il perimetro è %.2f",p);

}
main(){
  pthread_t t1,t2;
// input base
  printf("\n inserisci la base:");
  scanf("%f",&b);
// input altezza
  printf("\n inserisci l'altezza");
  scanf("%f",&h);
//esecuzione thread
  pthread_create(&t1,NULL,&area,NULL);
  pthread_create(&t2,NULL,&perimetro,NULL);
  pthread_join(t1,NULL);
  pthread_join(t2,NULL);
}
