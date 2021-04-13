package implementation;

public class Node<E extends Comparable<E>> implements myinterface.Node<E> {
    E data;
    Node<E> right;
    Node<E> left;
    public Node(E data){
        this.data=data;
        this.right=null;
        this.left=null;

    }
    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getLeft() {
        return left;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public Node<E> getRight() {
        return right;
    }

    public void setRight(Node<E> right) {
        this.right = right;
    }
}
