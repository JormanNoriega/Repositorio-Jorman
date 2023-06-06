DIM PILA1[100] de tipo char;
int tope1 = 0;
DIM PILA2[100] de tipo double;
int tope2 = 0;

Algoritmo_EvaluarExpresionAritmetica
    char infija[20];
    char postfija[20];

    escribir("Ingrese la expresion infija: ");lea(infija);

    PARA i <- 1 hasta Length(infija) HAGA
        k <- 1;
        SI(infija[i] IN ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y','z'])ENTONCES
            postfija[k] <- infija[i];
            k++;
            SINO
                SI(infija[i] IN ['^', '*', '/', '+', '-','(',')'])
                    SI(Pila1_Vacia() = "S")ENTONCES                   
                        EmpilarPILA1(infija[i]);                    
                        SINO
                            SI(infija[i] = '(')ENTONCES
                                EmpilarPILA1(infija[i]);
                                SINO
                                    SI(infija[i] = ')')ENTONCES
                                        MQ(PILA1[tope1] <> '(' )HACER 
                                        postfija[k] <- DesempilarPILA1();
                                        k++;
                                        FIN_MQ
                                        DesempilarPILA1();
                                        SINO
                                            SI(Prioridad(infija[i]) > Prioridad(PILA1[tope1]))ENTONCES
                                                EmpilarPILA1(infija[i]);
                                                SINO
                                                    SI(Prioridad(infija[i]) <= Prioridad(PILA1[tope1]))ENTONCES  
                                                        MQ(PILA1_VACIA='N' AND Prioridad(infija[i]) >= Prioridad(PILA1[tope1]))ENTONCES                                                         
                                                        postfija[k]<- DesempilarPILA1();
                                                        k++;
                                                        FIN_MQ
                                                        EmpilarPILA1(infija[i]);
                                                    FIN_SI
                                            FIN_SI    
                                    FIN_SI 
                            FIN_SI
                    FIN_SI
                FIN_SI                                                                                
        FIN_SI    
    FIN_PARA

    MQ(Pila1_Vacia() = 'N')HACER
        postfija[k]<- DesempilarPILA1();
        k++;
    FIN_MQ

    escribir("Su Expresion Postfija es: "+postfija);

    PARA i <- 1 hasta Length(postfija) HAGA
        SI(postfija[i] IN ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y','z'])ENTONCES 
            double valor;
            escribir("Ingrese el valor de ["+postfija[i]"]: ");lea(valor);
            EmpilarPILA2(valor);
            SINO
                SI(postfija[i] IN ['^', '*', '/', '+', '-'])
                double a= DesempilarPILA2();
                double b= DesempilarPILA2();
                double resultado;

                DD(postfija[i])HAGA
                    '^': resultado=a^b;
                    '*': resultado=a*b;
                    '/': resultado=a/b;
                    '+': resultado=a+b;  
                    '-': resultado=a-b;    
                FIN_DD
                EmpilarPILA2(resultado)
                FIN_SI
        FIN_SI
    FIN_PARA
    double resultadoFinal=DesempilarPILA2();
    escribir("El resultado De la Expresion es: "+resultadoFinal);
FIN_Algoritmo_EvaluarExpresionAritmetica    


//PARA PILA1

Pila1_Llena(){
    SI(tope1 < 100) ENTONCES
        RETURN("N");
        SINO
            RETURN("S");
    FIN_SI    
}

Pila1_Vacia(){
    SI(tope1 = 0) ENTONCES
        RETURN("S");
        SINO
            RETURN("N");
    FIN_SI    
}

EmpilarPILA1(dato char){
    SI(Pila1_Llena()="S")ENTONCES
        escribir("Stack overflow")
        SINO
            tope1 <- tope1+1;
            PILA1[tope1] <- dato;
    FIN_SI
}

DesempilarPILA1(dato char){
    SI(Pila1_Vacia()="S")ENTONCES
        escribir("Stack Underflow");
        dato <- "";
        SINO
            dato <- PILA1[tope1];
            tope1 <- tope1 - 1;
            RETURN dato;            
    FIN_SI
}

//PARA PILA2

Pila2_Llena(){
    SI(tope2 < 100) ENTONCES
        RETURN("N");
        SINO
            RETURN("S");
    FIN_SI    
}

Pila2_Vacia(){
    SI(tope2 = 0) ENTONCES
        RETURN("S");
        SINO
            RETURN("N");
    FIN_SI    
}

EmpilarPILA2(dato char){
    SI(Pila2_Llena()="S")ENTONCES
        escribir("Stack overflow")
        SINO
            tope2 <- tope2+1;
            PILA2[tope2] <- dato;
    FIN_SI
}

DesempilarPILA2(dato char){
    SI(Pila2_Vacia()="S")ENTONCES
        escribir("Stack Underflow");
        dato <- "";
        SINO
            dato <- PILA2[tope2];
            tope2 <- tope2 - 1;
            RETURN dato;            
    FIN_SI
}


Prioridad(operador char){
    SI(operador = '^')ENTONCES
        RETURN 3
        SINO
            SI(operador IN ['*', '/'])ENTONCES
            RETURN 2
            SINO
                SI(operador IN ['+', '-'])ENTONCES
                RETURN 1
                SINO
                    SI(operador = '(')ENTONCES
                    RETURN 0;
                FIN_SI                        
            FIN_SI        
    FIN_SIs
} 