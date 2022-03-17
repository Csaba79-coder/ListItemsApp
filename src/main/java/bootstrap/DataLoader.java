package bootstrap;

import model.MyLinkedList;
import model.Node;
import model.SearchTree;

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

        System.out.println("------------------------");
        System.out.println("---Binary Search Tree---");
        System.out.println("------------------------");

        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        tree = splitArrayToStringForTree(stringDataNums);
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("2"));
        tree.removeItem(new Node("3"));
        tree.removeItem(new Node("4"));
        tree.removeItem(new Node("5"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("9"));
        tree.removeItem(new Node("1"));
        tree.removeItem(new Node("8"));
        tree.removeItem(new Node("0"));
        tree.removeItem(new Node("7"));
        tree.removeItem(new Node("6"));
        tree.traverse(tree.getRoot());
        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());

        System.out.println("------------------------");
        tree = splitArrayToStringForTree(stringData);
        tree.traverse(tree.getRoot());

        System.out.println("------------------------");

        System.out.println("--------------------------");
        System.out.println("---Recursive LinkedList---");
        System.out.println("--------------------------");

        linkedList = splitArrayToString(stringData);
        linkedList.traverseRecursive(linkedList.getRoot());
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

    private SearchTree splitArrayToStringForTree(String stringData) {
        SearchTree tree = new SearchTree(null);
        String[] data = stringData.split(" ");
        for (String s : data) {
            // create new item with value set to the string s
            tree.addItem(new Node(s));
        }
        return tree;
    }
}
