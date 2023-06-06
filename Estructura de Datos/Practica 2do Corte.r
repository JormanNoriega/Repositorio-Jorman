/* PUNTO 1 */

struct L1{
    int num;
    L1 *sig;
    L1 *ant;
} *cab1, *p1, *fin1, *q1;

struct L2{
    int num;
    L2 *sig;
} *pos,*p2, *q2,*cab2; 

ListaDescendente
    REPITA
        escribir("Programa De Listas Descendente");
        escribir("1. Agregar En la lista 1 (L1)");
        escribir("2. Agregar En la lista 2 (L2)");
        escribir("3. Agregar Lista 2(L2) en 1(L1) eliminando repetidos");
        escribir("4. Salir");
        escribir("Seleccione una Opcion: ");lea(OP);

        DD OP HAGA
            1:Agregar_Ordenado_Descendente_ListaDoble;
            2:Agregar_sinDuplicados_ListaSimple;
            3:InsertarListas;
        FIN DD
    HASTA(OP=3)
FIN ListaDescendente

Agregar_Ordenado_Descendente_ListaDoble
    mas ← 'S';
    MQ(mas = 'S')HAGA
        new(p1);
        SI(p1=nil)ENTONCES
            escribir("No hay memoria suficiente");
            SINO
                /*llenarDatos*/
                escribir("Ingrese el numero: ");lea(num);
                existe ← 'n';

                /*Valido si existe o no*/
                q1 ← cab1;
                MQ (q1 <> nil AND existe='n')HAGA
                    SI(q1↑.num = num) ENTONCES
                        existe ← 's';
                        SINO
                            q1 ← q1^.sig;
                    FSI
                FMQ

                SI(existe='n')
                    p1↑.num ← num;
                    p1↑.ant ← nil;
                    p1↑.sig ← nil;

                    /*agregar nodos*/
                    SI(cab1=nil)ENTONCES
                        cab1 ← p1;
                        fin1 ← p1;

                        SINO
                            /*Si va antes de el primero: */
                            SI(p1↑.Num > cab1↑.num)ENTONCES
                                p1↑.sig ← cab1;
                                cab1↑.ant ← p1;
                                cab1 ← p1;
                                
                                SINO
                                    /*Si va despues del ultimo: */
                                    SI(p1↑.num < fin1↑.num)ENTONCES
                                        fin1↑.sig ← p1;
                                        p1↑.ant ← fin1;
                                        fin1 ← p1;

                                        SINO
                                            /*Si va en medio de 2 nodos*/
                                            q1 ← cab1;                                       
                                            MQ(q1↑.num > p1↑.num)HAGA
                                                q1 ← q1↑.sig;
                                            FIN MQ

                                            /*lo Enlazo por la izquierda*/
                                            p1↑.ant ← q1↑.ant;
                                            q1↑.ant↑.sig ← p1;

                                            /*lo Enlazo por la derecha*/
                                            p1↑.sig ← q1;
                                            q1↑.ant ← p1;
                                    FIN SI
                            FIN SI
                    SINO
                        escribir("El numero ya existe en la lista.");
                FIN SI
        FIN SI
        escribir("¿Desea ingresar otro número? (S/N)");lea(mas);
    FIN MQ       
FIN Agregar_Ordenado_Descendente_ListaDoble

Agregar_sinDuplicados_ListaSimple
    mas='s'
    MQ(mas='s')HAGA
        escribir("Ingrese el numero: ");lea(num);

        SI(cab2=nil)ENTONCES
            existe='n';
            SINO
                q2 ← cab2;
                existe ← 'n';
                MQ(q2<>nil AND existe='n')HAGA
                    SI(q2↑.num = num)ENTONCES
                        existe ← 's';                     
                    FIN SI
                    q2 ← q2↑.sig;
                FIN MQ

                SI(existe='s')ENTONCES
                    escribir("Este numero ya existe..");
                    SINO
                        new(p2);
                        SI(p2=nil)ENTONCES
                            escribir("No hay memoria suficiente");
                            SINO
                                /*lleno el nodo*/
                                p2↑.num ← num;
                                p2↑.sig ← nil;
                                SI(cab2=nil)ENTONCES
                                    cab2 ← p2;
                                    fin2 ← p2;
                                    SINO
                                        fin2↑.sig ← p2;
                                        fin2 ← p2;
                                FIN SI
                    escribir("¿Desea ingresar otro número? (S/N)");lea(mas);                    
                FIN SI         
        FIN SI
    FIN MQ
FIN Agregar_sinDuplicados_ListaSimple

InsertarListas
    /* Buscamos si L1 y L2 tienen elementos */
    SI (cab1 = nil) O (cab2 = nil) ENTONCES
        escribir("Ambas listas deben tener elementos");
    SINO
        /* Buscamos el último elemento de L1 */
        p1 ← cab1;
        MQ(p1^.sig <> nil)HAGA
            p1 ← p1^.sig;
        FIN MQ
        fin1 ← p1;

        /* Recorremos la lista L2 */
        p2 ← cab2;
        MQ(p2 <> nil)HAGA
            /* Buscamos si el número existe en L1 */
            q1 ← cab1;
            existe ← 'n';
            MQ (q1 <> nil AND existe='n')HAGA
                SI(q1↑.num = p2↑.num) ENTONCES
                    existe ← 's';
                    pos ← p2;
                SINO
                    q1 ← q1↑.sig;
                FIN SI
            FMQ

            /* Agregamos el número a L1 si no existe */
            SI(existe = 'n') ENTONCES
                new(p1);
                SI(p1 = nil) ENTONCES
                    escribir("No hay memoria suficiente");
                    SINO
                        p1↑.num ← p2↑.num;
                        p1↑.ant ← nil;
                        p1↑.sig ← nil;

                        /*Si va antes de el primero: */
                        SI(p1↑.Num > cab1↑.num)ENTONCES
                            p1↑.sig ← cab1;
                            cab1↑.ant ← p1;
                            cab1 ← p1;
                                SINO
                                    /*Si va despues del ultimo: */
                                    SI(p1↑.num < fin1↑.num)ENTONCES
                                        fin1↑.sig ← p1;
                                        p1↑.ant ← fin1;
                                        fin1 ← p1;
                                        SINO
                                            /*Si va en medio de 2 nodos*/
                                            q1 ← cab1;                                       
                                            MQ(q1↑.num > p1↑.num)HAGA
                                                q1 ← q1↑.sig;
                                            FIN MQ

                                            /*lo Enlazo por la izquierda*/
                                            p1↑.ant ← q1↑.ant;
                                            q1↑.ant↑.sig ← p1;

                                            /*lo Enlazo por la derecha*/
                                            p1↑.sig ← q1;
                                            q1↑.ant ← p1;
                                    FIN SI
                        FIN SI
                FIN SI
            SINO
                /*elimino el nodo en la lista 2*/
                
                SI(pos.sig = nil)ENTONCES
                    /*Cuando es el Ultimo*/
                    q2 ← cab2;
                    MQ(q2↑.sig <> pos)HAGA
                    q2 ← q2↑.sig;
                    FIN MQ
                    
                    q2↑.sig ← pos.sig
                    dispose(pos);
                    SINO
                        /*Cuando es el Primero*/
                        SI(pos = cab2)ENTONCES
                            cab2 ← cab2↑.sig;
                            dispose(pos);
                            SINO
                                /*Cuando esta entre 2 nodos*/
                                q2 ← cab2;
                                MQ(q2↑.sig <> pos)HAGA
                                    q2 ← q2↑.sig;
                                FIN MQ
                                q2↑.sig ← pos.sig;
                                dispose(pos);
                        FIN SI 
                FIN SI   
            FIN SI
            p2 ← p2^.sig;
        FIN MQ
        escribir("Listas combinadas exitosamente");
    FIN SI
FIN InsertarListas





/* PUNTO 2 */

struct rubros{
    int idRubro;
    char NomRubro[50];
    float SALDO;
    rubros *Sig;
    rubros *Ant;
} *cab1, *p1, *q1, *fin1;

struct proyectos{
    int IdProyecto;
    int IdRubro;
    char NomProyecto[80];
    char Estado;
    proyectos *Sig;
    proyectos *Ant;
} *cab2, *p2, *q2, *fin2;

struct auditoria{
    int IdRubro
    char NomRubro[50];
    auditoria *Sig;
    auditoria *Ant;
} *cab3, *p3, *q3, *fin3;

ListaRubros
    REPITA
        escribir("Programa De Rubros");
        escribir("1. Agregar un Rubro");
        escribir("2. Agregar un Proyecto");
        escribir("3. ");
        escribir("4. Salir");
        escribir("Seleccione una Opcion: ");lea(OP);

        DD OP HAGA
            1:
            2:
            3:
        FIN DD
    HASTA(OP=3)
FIN ListaRubros


        


    

      





