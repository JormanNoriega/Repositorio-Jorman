Dim Dinero [100,12] de decimal Simple 
Dim Mes[12] de string [15] 
Dim Placas[100] de string [10]
Dim Promedio[12] de decimal Simple


INFORME
    REPITA
        escribir("SIVA");
        escribir("1.Captura de Datos.");
        escribir("2.Buses con mas Producido.");
        escribir("3.Mes con mayor Producido.");
        escribir("4.Salir del Programa")
        escribir("Ingrese una Opcion: ");lea(OP)

        DD OP HAGA
            1:llenarDatos;
            2:topBuses;
            3:topMes;
        FIN DD
    Hasta (OP=4)
FIN INFORME

llenarDatos
    escribir("INGRESO DE DATOS SIVA")
    escribir("Igrese el numero de meses");lea(numMes);
    PARA i <-1 Hasta numMes HAGA
        escribir("ingrese el mes numero "+i+":")lea(Mes[i]);
    FIN PARA

    escribir("Ingrese el numero de buses a ingresar: ");lea(Nel)
    SI (Nel<0) AND (Nel>100) ENTONCES
        escribir("Error.Rectifique el numero de elementos a introducir...")
        SINO
            PARA i <- 1 Hasta Nel HAGA
                PARA j <- 1 Hasta numMes HAGA
                    escribir("Ingrese la Placa del bus: ");lea(Placas[i])
                    escribir("Ingrese el Dinero Reportado en "+Mes[j]+": ");lea(Dinero[i][j])
                FIN PARA
            FIN PARA
        FIN SI
FIN llenarDatos

topBuses
    mayor1<-0
    mayor2<-0
    mayor3<-0

    PARA i <- 1 Hasta Nel HAGA
        PARA j <- 1 Hasta numMes HAGA
            SI (Dinero[i][j]>mayor1) ENTONCES
                mayor3<-mayor2
                mayor2<-mayor1
                mayor1<-Dinero[i][j]
                Placa1<-Placa[i]
            SINO
                SI(Dinero[i][j]>mayor2) ENTONCES
                    mayor3<-mayor2
                    mayor2<-Dinero[i][j]
                    Placa2<-Placa[i]
                SINO
                    SI(Dinero[i][j]>mayor3)
                        mayor3<-Dinero[i][j]
                        Placa3<-Placa[i]
                    FIN SI
                FIN SI
            FIN SI
        FIN PARA
    FIN PARA

    escribir("Informe de Buses SIVA");
    escribir("Bus con mayor producido ");    
    escribir("Primer Puesto: Placa:"+Placa1",Dinero Reportado: "+mayor1)
    escribir("Segundo Puesto: Placa:"+Placa2",Dinero Reportado: "+mayor2)
    escribir("Tercer Puesto: Placa:"+Placa3",Dinero Reportado: "+mayor3)

FIN topBuses  

topMes
    escribir("Informe de Meses SIVA")
    mayorProducido<-0
    PARA i <- 1 Hasta numMes HAGA
        sumaMEs<-0
        PARA j <- 1 Hasta Nel HAGA
            sumaMes<-sumaMes+Dinero[i][j]
            promedioMes<-sumaMes/Nel
            Promedio[i]<-promedioMes   
        FIN PARA
    FIN PARA

    PARA i <- 1 Hasta numMes HAGA
        SI(Promedio[i]>mayorProducido)ENTONCES
            mayorProducido<-Promedio[i]
            pos<-[i]
        FIN SI
    FIN PARA
    escribir("Mes Con mayor promedio de producion es: "+Mes[pos]+"Con : $"+mayorProducido)
FIN topMes 
