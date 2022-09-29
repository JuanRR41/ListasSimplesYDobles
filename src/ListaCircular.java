public class ListaCircular<T extends Comparable<T>> {
    Nodo <T>inicio;
    Nodo <T>fin;
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
        return dato;
    }
    public Nodo eliminarFin(){
        Nodo r = new Nodo();
        if (inicio == null){
            System.out.println("LISTA VACIA.");
        }
        else{
            if(inicio==fin){
                inicio=fin=null;
            }
            else{
                r = inicio;
                while(r.getSig()!=fin){
                    r=r.getSig();
                }
                fin=r;
                fin.setSig(inicio);
            }
        }
        return r;
    }
    public String recorrerListaCircular(){
        String cadena = "";
        if(inicio==null){
            System.out.println("LISTA VACIA");
        }
        else {
            Nodo r = inicio;
            while(r!=fin) {
                cadena+=r.getInfo()+"\n";
                r=r.getSig();
            }
            cadena+=fin.getInfo().toString();
        }
        return cadena;
    }

//    public Nodo numeroMasGrande(Nodo x, Nodo aux) {
//        Integer o=(Integer)x.getInfo(),p=(Integer)aux.getInfo();
//        if (x==fin)
//            return aux;
//        else if (o >p)
//            aux.setInfo(x.getInfo());
//        return numeroMasGrande(x.getSig(), aux);
//    }


    public String regresarNumeroAlto(Nodo m,Nodo mayor,int posicion){
        if(inicio==null)
            return "No hay elementos";
        else if(inicio == fin)
        return ""+m.getInfo().toString()+ " Pos ="+ posicion;
        else if(m==inicio){
            return ""+mayor.getInfo().toString()+ " Pos ="+ posicion;
        }
        else if((Integer)mayor.getInfo() < (Integer) m.getInfo()){
            m=m.getSig();
            posicion++;
            return regresarNumeroAlto(m,mayor,posicion);
        }
        else if((Integer)mayor.getInfo() > (Integer)m.getInfo()){
            m=m.getSig();
            return regresarNumeroAlto(m,mayor,posicion);
        }
        return "cero";
    }
    public String listaRegresiva(){
        String s = "";
        String[] z;
        Nodo nodo = inicio;
        while(nodo!=fin){
            s += nodo.getInfo() + " ";
            nodo=nodo.getSig();
        }
        s += nodo.getInfo();

        z = s.split(" ");
        s="";
        for(int i=z.length-1;i>=0;i--){
            s+=z[i]+" ";
        }
        return s;
    }
}
