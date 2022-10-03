public class ListaCircular<T extends Comparable<T>> {
    Nodo <T>inicio;
    Nodo <T>fin;
    int tamanio=0;
    public ListaCircular(){
    }

    public void insertarInicio(T dato){
        Nodo n = new Nodo();
        n.setInfo((Comparable) dato);
        if(inicio==null){
            inicio=fin=n;
            n.setSig(inicio);
        }
        else{
            n.setSig(inicio);
            inicio=n;
            fin.setSig(inicio);
        }
        tamanio++;
    }

    public void insertarFinal(T dato){
        Nodo n = new Nodo();
        n.setInfo(dato);
        if(inicio==null){
            inicio=fin=n;
            n.setSig(inicio);

        }
        else{
            n.setSig(inicio);
            fin.setSig(n);
            fin=n;
        }
        tamanio++;
    }
    public T eliminarInicio(){
        T dato = null;
        if(inicio==null){
            System.out.println("LILSTA VACIA.");
        }
        else if(inicio==fin){
            dato=inicio.getInfo();
            inicio=fin=null;
        }
        else {
            dato = inicio.getInfo();
            inicio=inicio.getSig();
            fin.setSig(inicio.getSig());
        }
        tamanio--;
        return dato;
    }
    public T eliminarFin(){
        T dato = null;
        Nodo r = new Nodo();
        if (inicio == null){
            System.out.println("LISTA VACIA.");
        }
        else{
            if(inicio==fin){
                dato= (T) inicio.getInfo();
                inicio=fin=null;
            }
            else{
                r = inicio;
                while(r.getSig()!=fin){
                    r=r.getSig();
                    dato= (T) r.getSig().getInfo();
                }
                fin=r;
                fin.setSig(inicio);
            }
        }
        tamanio--;
        return dato;
    }
    public String recorrerListaCircular(){
        String cadena = "";
        if(inicio==null){
            System.out.println("LISTA VACIA");
        }
        else {
            Nodo r = inicio;
            while(r!=fin) {
                cadena+=r.getInfo()+" ";
                r=r.getSig();
            }
            cadena+=fin.getInfo().toString();
        }
        return cadena;
    }

    private String recursivo(Nodo x){
        if(x.getSig()==inicio){
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

    public boolean buscar(T referencia){
        // Crea una copia de la lista.
        Nodo aux = inicio;
        // Bandera para indicar si el valor existe.
        boolean encontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta
        // llegar al primer nodo nuevamente.
        do{
            // Consulta si el valor del nodo es igual al de referencia.
            if (referencia == aux.getInfo()){
                // Canbia el valor de la bandera.
                encontrado = true;
            }
            else{
                // Avansa al siguiente. nodo.
                aux = aux.getSig();
            }
        }while(aux != inicio && encontrado != true);
        // Retorna el resultado de la bandera.
        return encontrado;
    }

    public T eliminarX(T referencia){
        T dato=null;
        // Consulta si el valor de referencia existe en la lista.
        if (buscar(referencia)) {
            // Consulta si el nodo a eliminar es el pirmero
            if (inicio.getInfo() == referencia) {
                // El primer nodo apunta al siguiente.
                inicio = inicio.getSig();
                // Apuntamos con el ultimo nodo de la lista al inicio.
                fin.setSig(inicio);
            } else{
                // Crea ua copia de la lista.
                Nodo aux = inicio;
                // Recorre la lista hasta llegar al nodo anterior
                // al de referencia.
                while(aux.getSig().getInfo() != referencia){
                    aux = aux.getSig();
                    dato=(T)aux.getSig().getInfo();
                }
                if (aux.getSig() == fin) {
                    aux.setSig(inicio);
                    fin = aux;
                } else {
                    // Guarda el nodo siguiente del nodo a eliminar.
                    Nodo siguiente = aux.getSig();
                    // Enlaza el nodo anterior al de eliminar con el
                    // sguiente despues de el.
                    aux.setSig(siguiente.getSig());
                    // Actualizamos el puntero del ultimo nodo
                }
            }
            // Disminuye el contador de tamaño de la lista.
            tamanio--;
        }
        return dato;
    }

    public int getPosicion(T referencia) throws Exception{
        // Consulta si el valor existe en la lista.
        if (buscar(referencia)) {
            // Crea una copia de la lista.
            Nodo aux = inicio;
            // COntado para almacenar la posición del nodo.
            int cont = 0;
            // Recoore la lista hasta llegar al nodo de referencia.
            while(referencia != aux.getInfo()){
                // Incrementa el contador.
                cont ++;
                // Avansa al siguiente. nodo.
                aux = aux.getSig();
            }
            // Retorna el valor del contador.
            return cont;
            // Crea una excepción de Valor inexistente en la lista.
        } else {
            throw new Exception("Valor inexistente en la lista.");
        }
    }

    public T removerPorPosicion(int posicion){
        T dato = null;
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y < que el numero de elementos del la lista.
        if(posicion>=0 && posicion<tamanio){
            // Consulta si el nodo a eliminar es el primero
            if(posicion == 0){
                dato=(T)inicio.getInfo();
                // Elimina el primer nodo apuntando al siguinte.
                inicio = inicio.getSig();
                // Apuntamos con el ultimo nodo de la lista al inicio.
                fin.setSig(inicio);
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
                if (aux.getSig() == fin) {
                    aux.setSig(inicio);
                    fin = aux;
                } else {
                    dato=(T)aux.getSig().getInfo();
                    // Guarda el nodo siguiente del nodo a eliminar.
                    Nodo siguiente = aux.getSig();
                    // Enlaza el nodo anterior al de eliminar con el
                    // sguiente despues de el.
                    aux.setSig(siguiente.getSig());
                    // Actualizamos el puntero del ultimo nodo
                }
            }
            // Disminuye el contador de tamaño de la lista.
            tamanio--;
        }
        return dato;
    }
    public void Sort_List(){

        // current pointer pointing to the head of the list
        Nodo current = inicio;

        // a temp pointer
        Nodo temp = null;

        // variable value helps in swap of the values
        int value;

        // this is the Algorithm discussed above
        if (inicio == null) {
            System.out.println("La Lista esta vacia.");
        }
        else {
            while (current.getSig() != inicio) {
                temp = current.getSig();
                while (temp != inicio) {
                    if ((Integer)current.getInfo() > (Integer)temp.getInfo()) {
                        value = (Integer)current.getInfo();
                        current.setInfo(temp.getInfo());
                        temp.setInfo(value);
                    }
                    temp = temp.getSig();
                }
                current = current.getSig();
            }
        }
    }
    public void insrtarPorPosicion(int posicion, T valor){
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y <= que el numero de elementos del la lista.
        if(posicion>=0 && posicion<=tamanio){
            Nodo nuevo = new Nodo();
            nuevo.setInfo(valor);
            // Consulta si el nuevo nodo a ingresar va al inicio de la lista.
            if(posicion == 0){
                // Une el nuevo nodo con la lista existente.
                nuevo.setSig(inicio);
                // Renombra al nuevo nodo como el inicio de la lista.
                inicio = nuevo;
                // El puntero del ultimo debe apuntar al primero.
                fin.setSig(inicio);
            }
            else{
                // Si el nodo a inserta va al final de la lista.
                if(posicion == tamanio){
                    // Apuntamos con el ultimo nodo de la lista al nuevo.
                    fin.setSig(nuevo);
                    // Apuntamos con el nuevo nodo al inicio de la lista.
                    nuevo.setSig(inicio);
                    // Como ahora como el nuevo nodo es el ultimo se actualiza
                    // la variable ultimo.
                    fin = nuevo;
                }
                else{
                    // Si el nodo a insertar va en el medio de la lista.
                    Nodo aux = inicio;
                    // Recorre la lista hasta llegar al nodo anterior
                    // a la posicion en la cual se insertara el nuevo nodo.
                    for (int i = 0; i < (posicion-1); i++) {
                        aux = aux.getSig();
                    }
                    // Guarda el nodo siguiente al nodo en la posición
                    // en la cual va a insertar el nevo nodo.
                    Nodo siguiente = aux.getSig();
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

/*   public Nodo numeroMasGrande(Nodo x, Nodo aux) {
//        Integer o=(Integer)x.getInfo(),p=(Integer)aux.getInfo();
//        if (x==fin)
//            return aux;
//        else if (o >p)
//            aux.setInfo(x.getInfo());
//        return numeroMasGrande(x.getSig(), aux);
//    }


//    public String regresarNumeroAlto(Nodo m,Nodo mayor,int posicion){
//        if(inicio==null)
//            return "No hay elementos";
//        else if(inicio == fin)
//        return ""+m.getInfo().toString()+ " Pos ="+ posicion;
//        else if(m==inicio){
//            return ""+mayor.getInfo().toString()+ " Pos ="+ posicion;
//        }
//        else if((Integer)mayor.getInfo() < (Integer) m.getInfo()){
//            m=m.getSig();
//            posicion++;
//            return regresarNumeroAlto(m,mayor,posicion);
//        }
//        else if((Integer)mayor.getInfo() > (Integer)m.getInfo()){
//            m=m.getSig();
//            return regresarNumeroAlto(m,mayor,posicion);
//        }
//        return "cero";
//    }
//
//    public String listaRegresiva(){
//        String s = "";
//        String[] z;
//        Nodo nodo = inicio;
//        while(nodo!=fin){
//            s += nodo.getInfo() + " ";
//            nodo=nodo.getSig();
//        }
//        s += nodo.getInfo();
//
//        z = s.split(" ");
//        s="";
//        for(int i=z.length-1;i>=0;i--){
//            s+=z[i]+" ";
//        }
//        return s;
//    }
*/

}
