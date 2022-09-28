public class ListaSimple <T> {
    //Nodo tiene 2 atributos que es la info y sig. sig tiene null y info tiene todos los datos quese
    //deben de guardar
    Nodo inicio;// siempre inicio se debe iniciar en null
    int tamanio =0;

    public ListaSimple(){
        inicio=null;
    }

    public void insertarInicio(Object dato){
        Nodo n = new Nodo<>();
        n.setInfo(dato);
        n.setSig(inicio);
        inicio=n;
        tamanio++;
    }

    public void insertarFin(Object dato){
        Nodo n=new Nodo<>(dato);
        Nodo r;
        if(inicio==null){
            n.setSig(inicio);
            inicio=n;
            this.tamanio++;
        }
        else {
            r = new Nodo<>();
            r=inicio;
            while (r.getSig()!=null){
                r=r.getSig();
            }
            r.setSig(n);
            n.setSig(null);
            this.tamanio++;
        }
    }
    public T eliminarInicio(){
        T dato = null;
        if (inicio == null){
            dato=null;
        }
        else{
            dato=(T)inicio.getInfo();
            inicio=inicio.getSig();
            this.tamanio--;
        }
            return dato;
    }
    public void eliminaFin(T dato){
        Nodo n = new Nodo(dato); Nodo r;
        if (inicio==null){
            n.setSig(inicio);
            inicio=n;
            this.tamanio--;
        }
        else{
            r = inicio;
            while (r.getSig()!=null){
                r=r.getSig();
            }
            r.setSig(n);
            n.setSig(null);
            this.tamanio--;
        }
    }
    public T eliminarFin(){
        T dato=null;
        Nodo r = new Nodo<>();
        Nodo a = new Nodo<>();
        if(inicio==null){
            System.out.println("Lista vacia");
        }
        else{
            if(inicio.getSig()==null){
                dato=(T)inicio.getInfo();
                inicio = null;
                this.tamanio--;
            }
            else{
                r = inicio;
                a=r;
                while (r.getSig()!=null){
                    a=r;
                    r=r.getSig();
                }
                a.setSig(null);
                this.tamanio--;
            }
        }
        return dato;
    }

    private String recursivo(Nodo x){
        if(x.getSig()==null){
            return " "+x.getInfo();
        }
        else
            return " "+x.getInfo()+recursivo(x.getSig());
    }

    public String llamarRecursivo(){
        Nodo nAux = inicio;
        String cadena = "";
        if(nAux!=null){
            cadena = recursivo(nAux);

        }
        else cadena="VACIO";
        return cadena;
    }

    public String mostrarLista(){
        Nodo r = inicio;
        String cadena = "";
        if(inicio==null){
            cadena = "Lista vacia";
        }
        else {
            while (r != null) {
                cadena += r.getInfo().toString()+" ";
                r = r.getSig();
            }
        }
        return cadena;
    }

    public int buscarX(T x){
        Nodo n = inicio;
        int i=0;
        while(n.getInfo()!=x){
            i++;
            n=n.getSig();
        }
        return i;
    }


    public T eliminarX(T elem){
        T dato= null;
        if (inicio == null)
            System.out.println("lista vacía");
        else
        if (inicio.getInfo()== elem){
            dato=(T)inicio.getInfo();
            inicio = inicio.getSig();
            tamanio--;
        }
        else {
            Nodo actual = inicio;
            while (actual.getSig()!=null && actual.getSig().getInfo() != elem) {
                actual = actual.getSig();

                dato=(T)actual.getSig().getInfo();
            }
            if (actual.getSig()== null )
                System.out.println ("elemento "+elem+" no esta en la lista");
            else{
                actual.setSig(actual.getSig().getSig());
                tamanio--;
            }
        }
        return dato;
    }

    public boolean buscar(int referencia){
        // Crea una copia de la lista.
        Nodo aux = inicio;
        // Bandera para indicar si el valor existe.
        boolean encontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta
        // llegar al final de la lista.
        while(aux != null && encontrado != true){
            // Consulta si el valor del nodo es igual al de referencia.
            if (referencia == aux.getValor()){
                // Canbia el valor de la bandera.
                encontrado = true;
            }
            else{
                // Avansa al siguiente. nodo.
                aux = aux.getSig();
            }
        }
        // Retorna el resultado de la bandera.
        return encontrado;
    }

    public T eliminarPosicion(int posicion){
        T dato=null;
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y < que el numero de elementos del la lista.
        if(posicion>=0 && posicion<tamanio){
            // Consulta si el nodo a eliminar es el primero
            if(posicion == 0){
                dato=(T)inicio.getInfo();
                // Elimina el primer nodo apuntando al siguinte.
                inicio = inicio.getSig();
            }
            // En caso que el nodo a eliminar este por el medio
            // o sea el ultimo
            else{
                // Crea una copia de la lista.
                Nodo aux = inicio;
                // Recorre la lista hasta lleger al nodo anterior al eliminar.
                for (int i = 0; i < posicion-1; i++) {
                    aux = aux.getSig();
                    dato=(T)aux.getSig().getInfo();
                }
                // Guarda el nodo siguiente al nodo a eliminar.
                Nodo siguiente = aux.getSig();
                // Elimina la referencia del nodo apuntando al nodo siguiente.
                aux.setSig(siguiente.getSig());
            }
            // Disminuye el contador de tamaño de la lista.
            tamanio--;
        }
        return dato;
    }


}
