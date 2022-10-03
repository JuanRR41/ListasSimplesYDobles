public class ListasDobles <T>
{
    NodoDoble inicio;
    int tamanio=0;

    public void insertarInicio(T dato){
        NodoDoble n = new NodoDoble();
        n.setInfo(dato);
        n.setSig(inicio);
        n.setAnt(null);
        if(inicio!=null)
            inicio.setAnt(n);
        inicio = n;
        tamanio++;
    }

    public void insertarFin(T dato){
        NodoDoble n = new NodoDoble();
        n.setInfo(dato);
        n.setSig(null);
        if(inicio==null){
            n.setAnt(inicio);
            inicio=n;
        }
        else{
            NodoDoble r = inicio;
            while(r.getSig()!=null){
                r=r.getSig();
            }
            r.setSig(n);
            n.setAnt(r);
        }
        tamanio++;

    }

    public T eliminarInicio(){
        T dato = null;
        if(inicio==null){
            System.out.println("LISTA VACIA");
        }
        else {
            if(inicio.getSig()==null) {
                inicio=null;
            }
            else {
                dato=(T)inicio.getInfo();
                inicio=inicio.getSig();
                inicio.setAnt(null);
            }
        }
        tamanio--;
        return dato;
    }

    public T eliminarFin(){
        T dato=null;
        NodoDoble r = new NodoDoble();
        NodoDoble a = new NodoDoble();
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
                    dato=(T)r.getInfo();
                }
                a.setSig(null);
                this.tamanio--;
            }
        }
        return dato;
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
            NodoDoble actual = inicio;
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

    public String recorrer(){
        String cadena = "";
        if(inicio==null){
            System.out.println("LISTA VACIA");
        }
        else {
            NodoDoble r = inicio;
            while(r!=null) {
                cadena+=r.getInfo()+"\n";
                r=r.getSig();
            }

        }
        return cadena;
    }

    private String recursivo(NodoDoble x){
        if(x.getSig()==null){
            return " "+x.getInfo();
        }
        else
            return " "+x.getInfo()+recursivo(x.getSig());
    }

    public String llamarRecursivo(){
        NodoDoble nAux = inicio;
        String cadena = "";
        if(nAux!=null){
            cadena = recursivo(nAux);

        }
        else cadena="VACIO";
        return cadena;
    }

    public String mostrarLista(){
        NodoDoble r = inicio;
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
        NodoDoble n = inicio;
        int i=0;
        while(n.getInfo()!=x){
            i++;
            n=n.getSig();
        }
        return i;
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
                NodoDoble aux = inicio;
                NodoDoble r =aux;
                // Recorre la lista hasta lleger al nodo anterior al eliminar.
                for (int i = 0; i < posicion-1; i++) {
                    r=aux;
                    aux = aux.getSig();
                    dato=(T)aux.getSig().getInfo();
                }
                // Guarda el nodo siguiente al nodo a eliminar.
                // Elimina la referencia del nodo apuntando al nodo siguiente.
                aux.setAnt(r);
                aux.setSig(aux.getSig().getSig());
            }
            // Disminuye el contador de tamaño de la lista.
            tamanio--;
        }
        return dato;
    }
    public void insrtarPorPosicion(int posicion, T valor){
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y <= que el numero de elementos del la lista.
        if(posicion>=0 && posicion<=tamanio){
            NodoDoble nuevo = new NodoDoble();
            nuevo.setInfo(valor);
            // Consulta si el nuevo nodo a ingresar va al inicio de la lista.
            if(posicion == 0){
                // Inserta el nuevo nodo al inicio de la lista.
                nuevo.setSig(inicio);
                inicio = nuevo;
            }
            else{
                // Si el nodo a inserta va al final de la lista.
                if(posicion == tamanio){
                    NodoDoble aux = inicio;
                    ;
                    // Recorre la lista hasta llegar al ultimo nodo.
                    while(aux.getSig() != null){
                        aux = aux.getSig();
                    }
                    // Inserta el nuevo nodo despues de del ultimo.
                    aux.setSig(nuevo);
                }
                else{
                    // Si el nodo a insertar va en el medio de la lista.
                    NodoDoble aux = inicio;
                    // Recorre la lista hasta llegar al nodo anterior
                    // a la posicion en la cual se insertara el nuevo nodo.
                    for (int i = 0; i < (posicion-1); i++) {
                        aux = aux.getSig();
                    }
                    // Guarda el nodo siguiente al nodo en la posición
                    // en la cual va a insertar el nevo nodo.
                    NodoDoble siguiente = aux.getSig();
                    // Inserta el nuevo nodo en la posición indicada.
                    aux.setSig(nuevo);
                    // Une el nuevo nodo con el resto de la lista.
                    nuevo.setSig(siguiente);
                }
            }
            // Incrementa el contador de tamaño de la lista.
            tamanio++;
        }
    }

    public void ordenarLista(){
        if (tamanio > 1) {
            boolean cambio;
            do {
                NodoDoble actual = inicio;
                NodoDoble anterior = null;
                NodoDoble siguiente = inicio.getSig();
                cambio = false;
                while ( siguiente != null ) {
                    if ((Integer)actual.getInfo() > (Integer) siguiente.getInfo()) {
                        cambio = true;
                        if ( anterior != null ) {
                            NodoDoble sig = siguiente.getSig();
                            anterior.setSig(siguiente);
                            siguiente.setSig(actual);
                            actual.setSig(sig);
                        } else {
                            NodoDoble sig = siguiente.getSig();
                            inicio = siguiente;
                            siguiente.setSig(actual);
                            actual.setSig(sig);
                        }
                        anterior = siguiente;
                        siguiente = actual.getSig();
                    } else {
                        anterior = actual;
                        actual = siguiente;
                        siguiente = siguiente.getSig();
                    }
                }
            } while( cambio );
        }
    }



}
