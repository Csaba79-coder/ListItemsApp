package bootstrap;

import model.MyLinkedList;
import model.Node;

import java.util.ListIterator;

public class DataLoader {

    public void load() {

        MyLinkedList linkedList = new MyLinkedList(null);
        linkedList.traverse(linkedList.getRoot());

        System.out.println("-----------------");

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        linkedList = splitArrayToString(stringData);

        linkedList.traverse(linkedList.getRoot());

        System.out.println("-----------------");

        String stringDataNums = "5 7 3 9 8 2 1 0 4 6";

        linkedList = splitArrayToString(stringDataNums);

        linkedList.traverse(linkedList.getRoot());

        linkedList.removeItem(new Node("3"));
        linkedList.traverse(linkedList.getRoot());

        linkedList.removeItem(new Node("4"));
        linkedList.removeItem(new Node("0"));
        linkedList.removeItem(new Node("6"));
        linkedList.traverse(linkedList.getRoot());

        System.out.println("-----------------");

        linkedList.removeItem(new Node("1"));
        linkedList.removeItem(new Node("2"));
        linkedList.removeItem(new Node("5"));
        linkedList.removeItem(new Node("7"));
        linkedList.removeItem(new Node("8"));
        linkedList.removeItem(new Node("9"));
        linkedList.traverse(linkedList.getRoot());

        System.out.println("-----------------");

        linkedList.removeItem(linkedList.getRoot());
        linkedList.traverse(linkedList.getRoot());
    }

    private MyLinkedList splitArrayToString(String stringData) {
        MyLinkedList linkedList = new MyLinkedList(null);
        String[] data = stringData.split(" ");
        for (String s : data) {
            // create new item with value set to the string s
            linkedList.addItem(new Node(s));
        }
        return linkedList;
    }
}
