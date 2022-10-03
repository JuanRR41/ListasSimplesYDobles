public class MainListas {
    public static void main(String[] args) throws Exception {

        System.out.println("EJEMPLO DE LISTA SIMPLE: ");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        ListaSimple<Integer> listaS = new ListaSimple<>();

        listaS.insertarInicio(6);
        listaS.insertarInicio(4);
        listaS.insertarInicio(7);
        listaS.insertarInicio(1);
        listaS.insertarInicio(23);
        listaS.insertarInicio(43);
        listaS.insertarFin(9);

        System.out.println(listaS.mostrarLista());
        System.out.println("Eliminamos el inicio de la lista: "+listaS.eliminarInicio());
        System.out.println(listaS.mostrarLista());
        System.out.println("Eliminamos el final de la lista: "+listaS.eliminarFin());
        System.out.println(listaS.mostrarLista());
        System.out.println("Eliminamos el 7 de la lista: "+listaS.eliminarX(7));
        System.out.println(listaS.mostrarLista());
        System.out.println("Buscamos en que posicion esta el elemento 4: "+listaS.buscarX(4));
        System.out.println("Eliminamos el número de la posición 3: "+listaS.eliminarPosicion(3));
        System.out.println("Mostramos como quedaria la lista:\n"+listaS.mostrarLista());
        System.out.println("Ingresamos el número 5 en la posicion 3:\n");
        listaS.insrtarPorPosicion(3,5);
        System.out.println(listaS.mostrarLista());
        System.out.println("Ordenamos la lista de menor a mayor y lo mostramos con un recursivo.\n");
        listaS.ordenarLista();
        System.out.println(listaS.llamarRecursivo());
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("\n\nEJEMPLO DE LISTA DOBLE: ");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        ListasDobles<Integer> listaD = new ListasDobles<>();

        listaD.insertarInicio(65);
        listaD.insertarInicio(34);
        listaD.insertarInicio(5);
        listaD.insertarInicio(3);
        listaD.insertarInicio(38);
        listaD.insertarInicio(43);
        listaD.insertarFin(9);

        System.out.println(listaD.mostrarLista());
        System.out.println("Eliminamos el inicio de la lista: "+listaD.eliminarInicio());
        System.out.println(listaD.mostrarLista());
        System.out.println("Eliminamos el final de la lista: "+listaD.eliminarFin());
        System.out.println(listaD.mostrarLista());
        System.out.println("Eliminamos el 65 de la lista: "+listaD.eliminarX(65));
        System.out.println(listaD.mostrarLista());
        System.out.println("Buscamos en que posicion esta el elemento 4: "+listaD.buscarX(3));
        System.out.println("Eliminamos el número de la posición 3: "+listaD.eliminarPosicion(3));
        System.out.println("Mostramos como quedaria la lista:\n"+listaD.mostrarLista());
        System.out.println("Ingresamos el número 5 en la posicion 3:\n");
        listaD.insrtarPorPosicion(3,9);
        System.out.println(listaD.mostrarLista());
        System.out.println("Ordenamos la lista de menor a mayor y lo mostramos con un recursivo.\n");
        listaD.ordenarLista();
        System.out.println(listaD.llamarRecursivo());
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("\n\nEJEMPLO DE LISTA CIRCULAR SIMPLE:");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");

        ListaCircular<Integer>listaCs = new ListaCircular<>();

        listaCs.insertarFinal(80);
        listaCs.insertarInicio(5);
        listaCs.insertarInicio(6);
        listaCs.insertarInicio(12);
        listaCs.insertarInicio(2);
        listaCs.insertarInicio(54);
        listaCs.insertarInicio(98);

        System.out.println("Mostramos la lista con un recursivo: \n"+listaCs.llamarRecursivo());
        System.out.println("Eliminamos el primer elemento: "+ listaCs.eliminarInicio());
        System.out.println(listaCs.recorrerListaCircular());
        System.out.println("Eliminamos el ultimo elemento: "+ listaCs.eliminarFin());
        System.out.println(listaCs.llamarRecursivo());
        System.out.println("Eliminamos el 12 de la lista: "+listaCs.eliminarX(12));
        System.out.println(listaCs.llamarRecursivo());
        System.out.println("Buscamos en la lista la posicion del numero 2: "+listaCs.getPosicion(2));
        System.out.println("Eliminamos el número en la posicion 2: "+listaCs.removerPorPosicion(2));
        System.out.println(listaCs.llamarRecursivo());
        System.out.println("Insertamos el número 42 en la posicion 3: ");
        listaCs.insrtarPorPosicion(3,42);
        System.out.println(listaCs.llamarRecursivo());
        System.out.println("Ordenamos la lista de menor a mayor: ");
        listaCs.Sort_List();
        System.out.println(listaCs.llamarRecursivo());
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("\n\nEJEMPLO DE LISTA CIRCULAR DOBLE:");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");

        ListaCircularDoble<Integer>listaCd = new ListaCircularDoble<>();

        listaCd.insertarFinal(47);
        listaCd.insertarInicio(2);
        listaCd.insertarInicio(56);
        listaCd.insertarInicio(13);
        listaCd.insertarInicio(4);
        listaCd.insertarInicio(63);
        listaCd.insertarInicio(93);

        System.out.println("Mostramos la lista con un recursivo: \n"+listaCd.llamarRecursivo());
        System.out.println("Eliminamos el primer elemento: "+ listaCd.eliminarInicio());
        System.out.println(listaCd.recorrerListaCircular());
        System.out.println("Eliminamos el ultimo elemento: "+ listaCd.eliminarFin());
        System.out.println(listaCd.recorrerListaCircular());
        System.out.println("Eliminamos el 13 de la lista: "+listaCd.eliminarX(13));
        System.out.println(listaCd.llamarRecursivo());
        System.out.println("Buscamos en la lista la posicion del numero 2: "+listaCd.getPosicion(2));
        System.out.println("Eliminamos el número en la posicion 2: "+listaCd.removerPorPosicion(2));
        System.out.println(listaCd.llamarRecursivo());
        System.out.println("Insertamos el número 42 en la posicion 3: ");
        listaCd.insrtarPorPosicion(3,42);
        System.out.println(listaCd.llamarRecursivo());
        System.out.println("Ordenamos la lista de menor a mayor: ");
        listaCd.Sort_List();
        System.out.println(listaCd.llamarRecursivo());
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");

    }
}
