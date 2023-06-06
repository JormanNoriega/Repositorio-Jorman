#include <iostream>
#include <stdio.h>
#include <conio.h>
#include <windows.h>
#include <cmath>

using namespace std;

int gotoxy(USHORT x,USHORT y){                                
COORD cp={x,y};                                               
SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE),cp); 
}

char PILA1_LLENA();
char PILA2_LLENA();
char PILA1_VACIA();
char PILA2_VACIA();
void EmpilarPila1(char dato);
void EmpilarPila2(double dato);
char DesempilarPila1();
double DesempilarPila2();
int Prioridad(char operado);


char PILA1[100];
int tope1 = -1;
double PILA2[100];
int tope2 = -1;
 
main(){
	char infija[100];
    string postfija;
    
    system("cls");
    system("color f0");
    gotoxy(27,4); cout<<"CONVERTIDOR DE INFIJA A POSTFIJA";
    gotoxy(27,5); cout<<"      by:JORMAN NORIEGA";
    gotoxy(15,8); cout<<"INGRESE LA EXPRESION INFIJA: ";
	gotoxy(44,8); cin >> infija;
	
	for(int i = 0; i < strlen(infija); i++ ){
		char caracter =	infija[i];
		
		if(isalpha(caracter)){
			postfija+=caracter;//los += concatenan una posicion despues del ultimo		
		}else{
			if(caracter=='^'|| caracter=='*'||caracter=='/'||caracter=='+'||caracter=='-'||caracter=='('||caracter==')'){
				if(PILA1_VACIA()=='S'){
					EmpilarPila1(caracter);
					
				}else if(caracter=='('){
					EmpilarPila1(caracter);
							
					}else if(caracter==')'){				
						while(PILA1[tope1] != '('){
							postfija+=DesempilarPila1();	
						}
						DesempilarPila1();
						}else{
							while(PILA1_VACIA() == 'N' && Prioridad(caracter) <= Prioridad(PILA1[tope1])){
							postfija+=DesempilarPila1();
							}
							EmpilarPila1(caracter);
						}
			}				
		}
	}
	while(PILA1_VACIA()=='N'){
		postfija+=DesempilarPila1();		
	}
	gotoxy(15,10);cout<<"SU EXPRESION POSTFIJA ES: "<<postfija;
	
	for(int i = 0; i < postfija.length(); i++){
		char caracter =	postfija[i];
		if(isalpha(caracter)){
			double valor;
			gotoxy(15,12);cout<<"                                                          ";
			gotoxy(15,12);cout<<"INGRESE EL VALOR PARA ["<<caracter<<"]: ";cin>>valor;
			EmpilarPila2(valor);
		}else if(caracter=='^'|| caracter=='*'||caracter=='/'||caracter=='+'||caracter=='-'){
			double b= DesempilarPila2();
			double a= DesempilarPila2();
			double resultado;
			
			switch (caracter) {
                case '^':
                    resultado = pow(a, b);//pow es para elevar
                    break;
                case '*':
                    resultado = a * b;
                    break;
                case '/':
                    resultado = a / b;
                    break;
                case '+':
                    resultado = a + b;
                    break;
                case '-':
                    resultado = a - b;
                    break;
			}
			EmpilarPila2(resultado);
		}	
	}
	double resultadoFinal = DesempilarPila2();
    gotoxy(15, 14); cout << "EL RESULTADO ES: " << resultadoFinal;
					
}

// PARA PILA 1

char PILA1_LLENA(){
	if(tope1<=100){
		return 'N';
	}else{
		return 'S';
	}	
}

char PILA1_VACIA(){
	if(tope1==-1){
		return 'S';
	}else{
		return 'N';
	}
}

void EmpilarPila1(char dato){
	if(PILA1_LLENA()=='S'){
		gotoxy(15,20);cout<<"Stack overflow";
	}else{
		tope1++;
		PILA1[tope1]=dato;				
	}
}

char DesempilarPila1(){
	char dato;
	if(PILA1_VACIA()=='S'){
		return gotoxy(15,20);cout<<"Stack Underflow";
		dato = ' ';
	}else{
		dato = PILA1[tope1];
		tope1--;		
	}
	return dato;
}

//PARA PILA 2

char PILA2_LLENA(){
	if(tope2<=100){
		return 'N';
	}else{
		return 'S';
	}	
}

char PILA2_VACIA(){
	if(tope2==-1){
		return 'S';
	}else{
		return 'N';
	}
}

void EmpilarPila2(double dato){
	if(PILA2_LLENA()=='S'){
		gotoxy(15,20);cout<<"Stack overflow";
	}else{
		tope2++;
		PILA2[tope2]=dato;				
	}
}

double DesempilarPila2(){
	double dato;
	if(PILA2_VACIA()=='S'){
		return gotoxy(15,20);cout<<"Stack Underflow";
		dato = 0.0;
	}else{
		dato = PILA2[tope2];
		tope2--;		
	}
	return dato;
}

//Prioridad de Caracter
int Prioridad(char operador) {
    if (operador == '^') {
        return 3;
    } else {
        if (operador == '*' || operador == '/') {
            return 2;
        } else {
            if (operador == '+' || operador == '-') {
                return 1;
            } else {
                if (operador == '('|| operador == ')') {
                    return 0;
                }
            }
        }
    }
}







