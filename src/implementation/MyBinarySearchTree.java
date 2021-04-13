package implementation;

import myinterface.BinarySearchTreeADT;
import myinterface.Node;

public class MyBinarySearchTree<E extends Comparable<E>> implements BinarySearchTreeADT<E> {
    //complete this class
    private Node<E> root;
    public Node<E> getRoot() {
        return root;
    }

    @Override
    public void insert(E data) {
        Node<E> node = new implementation.Node<>(data);
        if (root == null) {
            root = node;
        }
        else{
            implementation.Node temp = (implementation.Node) root;
            Node<E> parent = null;
            while(temp != null){
                parent = temp;
                if(data.compareTo((E) temp.getData()) <= 0){
                    temp = temp.getLeft();
                }
                else{
                    temp = temp.getRight();
                }
            }
            if(data.compareTo(((implementation.Node<E>) parent).getData()) <= 0){
                ((implementation.Node<E>) parent).setLeft((implementation.Node<E>) node);
            }
            else{
                ((implementation.Node<E>) parent).setRight((implementation.Node<E>) node);
            }
        }
    }


    @Override
    public boolean search(E searchElement) {
        implementation.Node temp = (implementation.Node) root;
        while (temp!=null){
            if (searchElement.compareTo((E) temp.getData())<0){
                temp=temp.getLeft();
            }
            else if (searchElement.compareTo((E) temp.getData())>0){
                temp=temp.getRight();
            }
            else {
                return true;
            }
        }
        return false;
    }

    @Override
    public void inOrder(Node<E> node) {

    }

    @Override
    public void preOrder(Node<E> node) {

    }

    @Override
    public void postOrder(Node<E> node) {

    }

    @Override
    public void reverseInOrder(Node<E> node) {

    }

    @Override
    public void delete(E data) {

    }

    @Override
    public int height(Node<E> node) {
        return 0;
    }
}
