public class MainListas {
    public static void main(String[] args) {
        ListasDobles<Integer>lista = new ListasDobles<>();

        lista.insertarInicio(9);
        lista.insertarInicio(5);
        lista.insertarInicio(4);
        lista.insertarInicio(6);
        lista.insertarFin(12);

        System.out.println(lista.mostrarLista());

//        System.out.println(lista.eliminarFin());
        System.out.println(lista.eliminarPosicion(4));
        lista.ordenarLista();
        System.out.println(lista.mostrarLista());
//        System.out.println(lista.mostrarLista());

//        ListaSimple<Integer> lista = new ListaSimple<>();
//
//        lista.insertarInicio(6);
//        lista.insertarInicio(4);
//        lista.insertarInicio(7);
//        lista.insertarInicio(1);
//
//        System.out.println(lista.mostrarLista());
////        System.out.println(lista.eliminarPosicion(3));
////        System.out.println(lista.mostrarLista());
//        lista.insrtarPorPosicion(0,5);
//        System.out.println(lista.mostrarLista());
//        lista.ordenarLista();
//        System.out.println(lista.mostrarLista());
//

//        ListaCircular<Integer> nombres = new ListaCircular<>();
//        Nodo<Integer> n = new Nodo();
//        nombres.insertarInicio(1);
//        nombres.insertarInicio(9);
//        nombres.insertarFinal(675);
//
////        System.out.println(nombres.recorrerListaCircular());
////
//        System.out.println(nombres.listaRegresiva());
    }
}
