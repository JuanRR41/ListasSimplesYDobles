public class MainListas {
    public static void main(String[] args) {


        ListaSimple<Integer> lista = new ListaSimple<>();

        lista.insertarInicio(1);
        lista.insertarInicio(5);
        lista.insertarInicio(2);
        lista.insertarInicio(7);

        System.out.println(lista.mostrarLista());
        System.out.println(lista.eliminarX(5));
//        System.out.println(lista.eliminarPosicion(3));
        System.out.println(lista.mostrarLista());


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
