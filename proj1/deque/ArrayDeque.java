package deque;

import edu.neu.ccs.XObject;

public class ArrayDeque<item> {
    private int size;
    private int nextFirst = 3;
    private int nextLast = 4;
    private item[] items;
    public ArrayDeque(){
        items = (item[]) new Object[8];
        size = 0;
    }


    public void addFirst(item item){
        items[nextFirst] = item;
        nextFirst--;
        if(nextFirst == 0){
            nextFirst = 7;
        }
        size++;
    }
    public void addLast(item item){
        items[nextLast] = item;
        nextLast++;
        if(nextLast == 7){
            nextLast = 0;
        }
        size++;
    }
    public void removeFirst(item item){
        items[nextFirst+1] = null;
        size--;
    }
    public void removeLast(item item){
        items[nextLast-1] = null;
        size--;
    }

    private void checkIfResize(item[] array){

    }
    public void printDeque(){

    }
    public boolean isEmpty(){
        return size == 0;
    }
    public item get(int index){
        return items[index];
    }
    public int size(){
        return size;
    }
}
