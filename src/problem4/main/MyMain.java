/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;
import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree MyBinarySearchTree =  new MyBinarySearchTree();
        MyBinarySearchTree.add(500);
        MyBinarySearchTree.add(395);
        MyBinarySearchTree.add(56);
        MyBinarySearchTree.add(56);
        MyBinarySearchTree.add(920);
        MyBinarySearchTree.add(424);
        MyBinarySearchTree.add(20);
        MyBinarySearchTree.add(78);
        MyBinarySearchTree.add(96);
        MyBinarySearchTree.add(63);
        MyBinarySearchTree.add(69);
        MyBinarySearchTree.add(85);
        MyBinarySearchTree.add(72);
        MyBinarySearchTree.add(50);
        MyBinarySearchTree.add(12);
        MyQueue queue = new MyQueue();
        queue.enqueue(MyBinarySearchTree.root);
        queue.printQueue();
    }

}
