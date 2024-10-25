public class MyNode<T> extends Card {  //B00793227
//This class is created to test out and to get a plan to create the game.
    private T data;
    private MyNode<T> next;
   // Want to get the program to show five cards.
    public MyNode(T dataValue) {
        data = dataValue;
        next = null;

    }// To get started.  

    public T getData() {
        return data;

    }
    public void setData(T dataValue) {
        data = dataValue;

    }
    public MyNode getNext() {
        return next;

    }
    public void setNext(MyNode<T> nextNode) {
        next = nextNode;

    }
    public static void main(String[] args) {
        MyNode<Integer> Card1 = new MyNode<Integer>(  1);
        MyNode<Integer> Card2 = new MyNode<Integer>(  2);
        MyNode<Integer> Card3 = new MyNode<Integer>(  3);
        MyNode<Integer> Card4 = new MyNode<Integer>(  4);
        MyNode<Integer> Card5 = new MyNode<Integer>(  5);

        Card1.setNext(Card1);
        Card2.setNext(Card2);
//Starting with a five card deal and how I would want it different every deal.
        System.out.println("Value of Card 1 " + Card1.getData());
        System.out.println("Value of Card 2 " + Card2.getNext().getData());
        System.out.println("Value of Card 3 " + Card3.getNext().getNext().getData());
        System.out.println("Value of Card 4 " + Card4.getNext().getNext().getNext().getData());
        System.out.println("Value of Card 5 " + Card5.getNext().getNext().getNext().getNext().getData());



    }


}