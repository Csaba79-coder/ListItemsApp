package bootstrap;

import model.MyLinkedList;
import model.Node;

public class DataLoader {

    public void load() {

        MyLinkedList linkedList = new MyLinkedList(null);
        linkedList.traverse(linkedList.getRoot());

        System.out.println("-----------------");

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String[] data = stringData.split(" ");
        for (String s : data) {
            // create new item with value set to the string s
            linkedList.addItem(new Node(s));
        }

        linkedList.traverse(linkedList.getRoot());

        System.out.println("-----------------");
    }
}
