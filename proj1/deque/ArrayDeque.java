package deque;

import edu.neu.ccs.XObject;

public class ArrayDeque<item> {
    private int size
    private int nextFirst = 3;
    private int nextLast = 4;
    private item[] item;
    public ArrayDeque(){
        item[] item = (item[]) new Object(8);
        size = 0;
    }


    public void addFirst(item item){
        item[nextFirst] = item;
        nextFirst--;
        if(nextFirst == 0){
            nextFirst = 7;
        }
        size++;
    }
    public void addLast(item item){
        item[nextLast] = item;
        nextLast++;
        if(nextLast == 7){
            nextLast = 0;
        }
        size++;
    }
    public void removeFirst(item item){
        item[nextFirst+1] = null;
        size--;
    }
    public void removeLast(item item){
        item[nextLast-1] = null
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
        return item[index];
    }
    public int size(){
        return size;
    }
}
