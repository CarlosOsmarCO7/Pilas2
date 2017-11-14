package com.company;

public class pilas
{
    private Nodo top;
    int i=1;int max = 0, min = 10000;//Se inicializan la variables que se utilizarán en lso demás métodos
    public pilas(){
        top = null;
    }//método pilas para inicializar que la pila no tiene elementos.
    public boolean vacia(){//método vacio que sirve para saber si el número de elementos de la pila es nulo dice que la pila esta vacia.
        return (top==null);
    }
    public void push(int valor){//este método Push sirve para insertarle valores a la pila y lo inserta antes de el último número
        Nodo nuevoNodo;
        if(vacia()){
            top = new Nodo(valor);
        }else{
            nuevoNodo = new Nodo(valor);
            nuevoNodo.setProx(top);
            top = nuevoNodo;
            i++;
        }
    }
    public void peek(){//Este método peek sirve para mostrar los valores que exixten en la pila
        Nodo temp = top;
        if(temp!=null){
            System.out.println("La pila es: ");
            while(temp!=null){
                System.out.println(temp.getValor());
                temp= temp.getProx();
            }
        }
        else
            System.out.println("Pila Vacía");
    }
    public void cima (){//Este método devuelve el valor que esta a la cima
        if(!vacia()){
            System.out.println("Cima: "+top.getValor());
        }
            else{
            System.out.println("La pila esta vacia");
        }
    }
    public void buscar (int busqueda ){//método que sirve para buscar el elemento que recibe comom parámetro el valor que se desea buscar
        try {
            Nodo temp = top;
            int posicion = 1;
            if (temp.getValor() == busqueda) {//si el primer valor es igual a el número buscado la pocición es 0
                System.out.println("Valor en la Posicion 0 ");
            } else
            {
                while (temp != null) {
                    if (temp.getProx().getValor() == busqueda) {//hasta que se cumpla la condición de el número encontrado el sistema imprime
                        System.out.println("Valor encontrado en la posicion " + posicion);//la pocisión en que se encuentra el elemento
                        break;
                    }
                    posicion++;
                    temp = temp.getProx();
                }

            }
        }
        finally {
            System.out.println("\n");
        }
    }
    public void pop(){//Este método elimina el valor que se encuentra a la cima
            top = top.getProx();
    }
    public void tamaño(){//método tamaño para devolver el de la pila
        System.out.println("El tamaño es: "+i);
    }
    public void MaxMin(){//Sirve para comparar los valores y determinar cual es el máximo y mínimo de la pila
        Nodo temp = top;
        if(temp!=null){
            while(temp!=null){
                if (temp.getValor()<min){//Si el número insertado es menor que min
                    min=temp.getValor();//significa que ese número es el mínimo
                }else
                if (temp.getValor()>max){//Si el número insertado es mayor que max
                    max=temp.getValor();//El mayor de la pila es este
                }
                temp= temp.getProx();
            }
        }
    }
    public void min(){
        MaxMin();//Se invoca el método MaxMin para saber el mínimo
        System.out.println("El mínimo es: "+min);
    }
    public void max(){
        MaxMin();//Se invoca el método MaxMin para saber el máximo
        System.out.println("El máximo es: "+max);
    }
}
