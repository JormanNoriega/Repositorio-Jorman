---------------------------------------------------------------------------------------
Ejercicio 1

Dim A [20] de entero corto
var Nel de tipo entero corto 
var Opcion de tipo caracter

INICIO algoritmo

    MQ(Nel<20)AND(Opcion='S')
        Nel<-Nel+1
        escribir("Ingrese el numero en la posicon"+Nel+":")lea(A[Nel])
        escribir("Desea ingresar mas datos?:[S/N]")lea(Opcion)
    FIN MQ

    MayorPar
        mayorPar<-0
        PARA i<-1 Hasta Nel DE PASO 2 HAGA
            SI(A[i]>5)ENTONCES
                acumuladorImpar<-acumuladorImpar+menorImpar
                numMayorImpar<-numMayorImpar+1
                promedio<-acumuladorImpar/numMayorImpar                
            FIN SI
            Si(A[i]>mayorPar)AND(A[i]%2=0)ENTONCES
                mayorPar<-A[i]           
            FIN SI    
        FIN PARA
    FIN MayorPar

    menorImpar
        PARA i<-1 Hasta Nel HAGA
            maximoValor<-maximoValor+A[i]
        FIN PARA
        menorImpar<-maximoValor

        PARA i<-2 Hasta Nel DE PASO 2 HAGA
            Si(A[i]<menorImpar)AND(A[i]%2!=0)ENTONCES
                menorImpar<-A[i]
            FIN SI    
        FIN PARA
    FIN menorImpar

    escribir("Mayor numero Par: "+mayorPar)
    escribir("Menor numero ImPar: "+menorImpar)
    escribir("Promedio numero impares mayor a 5: "+promedio)

FIN algoritmo
---------------------------------------------------------------------------------------
Ejercico 2

Dim letras[20] de tipo caracter
var Nel de tipo entero corto 
var Opcion de tipo caracter

INICIO algoritmo

    MQ(Nel<20)AND(Opcion='S')
        Nel<-Nel+1
        escribir("Ingrese la letra en la posicion"+Nel+": ")lea(letras[Nel])
        escribir("Desea agregar mas letras?[S/N]")lea(Opcion)
    FIN MQ

    PARA i<-1 Hasta Nel ENTONCES
        Definir frecuencia como entero
        frecuencia <- 0
        PARA j<-1 Hasta Nel ENTONCES
            SI(letras[i]=letras[j])ENTONCES                
                frecuencia<-frecuencia+1
                FIN SI
            FIN SI
        FIN PARA
        escribir("La letra "+letras[i]+"Aparece "+frecuencia+"Veces.")
    FIN PARA
FIN algoritmo

---------------------------------------------------------------------------------------
Ejercicio 3

Registro articulos
    referencia de tipo cadena
    nomArticulo de tipo cadena
    precio de tipo decimal Simple
    cantidad de tipo entero corto
FIN Registro listaArticulos[100] de articulos

var Nel de tipo entero corto 
var Opcion de tipo caracter

INICIO algoritmo
    MQ(Nel<100)AND(Opcion="S")
    Nel<-Nel+1
    escribir("Ingresar Referencia: ")lea(listaArticulos[Nel].referencia)
    escribir("Ingresar Nombre Articulo: ")lea(listaArticulos[Nel].nomArticulo)
    escribir("Ingresar Precio: ")lea(listaArticulos[Nel].precio)
    escribir("Ingresar Cantidad: ")lea(listaArticulos[Nel].cantidad)
    escribir("Desea ingresar mas Articulos?[S/N]")lea(Opcion)
    FIN MQ


    ordenarDescendentemente                   /*quickShort*/
            i<-primero
            j<-ultimo
            pivote<-A[int(primero+ultimo)/2]
        REPITA
            var bandera de tipo booleano
            bandera<-false
            MQ(A[i]>pivote)HAGA              /*Si quiero que ascienda <*/
                i<-i+1
            FIN MQ
            MQ(A[j]<pivote)HAGA             /*Si quiero que ascienda >*/
                j<-j-1
            FIN MQ
            SI(i<=j)
                intercambiar(A[i],A[j])
                i<-i+1
                j<-j-1
            FIN SI
        Hasta(i>j)
            SI(primero<j)ENTONCES
                ordenarDescendentemente(primero,j)
            FIN SI
            SI(i<ultimo)ENTONCES
                ordenarDescendentemente(i,ultimo)
            FIN SI
    FIN ordenarDescendentemente

    insetarArticulo
        posicion de tipo entero
        SI(Nel<100)AND(NEL<0)ENTONCES
            escribir("En que posicion desea ingresar el articulo: ");lea(posicion)
            SI(posicion>0)AND(posicion<=Nel)
                PARA i<-Nel Hasta posicion+1 HAGA
                    listaArticulos[i].referencia<-listaArticulos[i-1].referencia
                    listaArticulos[i].nomArticulo<-listaArticulos[i-1].nomArticulo
                    listaArticulos[i].precio<-listaArticulos[i-1].precio
                    listaArticulos[i].cantidad<-listaArticulos[i-1].cantidad
                FIN PARA

                escribir("Ingrese la referencia del articulo:");lea(listaArticulos[posicion].referencia)
                escribir("Ingrese el nombre del articulo:");lea(listaArticulos[posicion].nomArticulo)
                escribir("Ingrese el presio del articulo:");lea(listaArticulos[posicion].precio)
                escribir("Ingrese la del articulo:");lea(listaArticulos[posicion].cantidad)
                Nel<-Nel+1
            FIN SI
        FIN SI
    FIN insetarArticulo
FIN algoritmo




