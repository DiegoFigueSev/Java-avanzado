package org.diegofigueroa.tema_01_datosgenericos.clase_00_introduccion.clase_04_listapersonalizada;

public class MyLinkedList<T> {
    private Node<T> root;

    public void add(T data){
        Node<T> newNode = new Node<>(data, null);
        if (root==null) root = newNode;
        else {
            Node<T> aux = root;
            while (aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(newNode);
        }
    }

    public void update(T oldData, T newData){
        Node<T> current = root;
        while (current != null){
            if (current.getData().equals(oldData)) {
                current.setData(newData);
                return;
            }else{
                current = current.getNext();
            }
        }
    }

    public void delete(T data){
        if (root == null) return;

        if (root.getData().equals(data)) root = root.getNext();

        Node<T> current = root.getNext();
        Node<T> previous =  root;
        while (current != null && !current.getData().equals(data)){
            previous = current;
            current = current.getNext();
        }

        if (current == null) return;

        previous.setNext(current.getNext());
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder("[");
        Node<T> current = root;
        while (current != null){
            text.append(current.getData());
            current = current.getNext();
            if (current != null) text.append(", ");
        }
        text.append("]");
        return text.toString();
    }
}
