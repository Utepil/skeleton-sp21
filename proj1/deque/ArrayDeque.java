package deque;

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
    public item removeFirst(item item){
        item temp = items[nextFirst+1];
        items[nextFirst+1] = null;
        size--;
        return temp;
    }
    public item removeLast(item item){
        item temp = items[nextLast-1];
        items[nextLast-1] = null;
        size--;
        return temp;
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
