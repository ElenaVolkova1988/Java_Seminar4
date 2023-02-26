import java.util.LinkedList;
import java.util.Stack;

/*
1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
 */
public class task3 {
    public static void main(String[] args) {
        int[] myArr = createArray(10);

        Stack<Integer> stack = addToStack(myArr);
        showStack(stack);

        LinkedList<Integer> myLinkedList = addToQueue(myArr);
        showLinkedList(myLinkedList);
    }


    public static Stack<Integer> addToStack(int[] array){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        return stack;
    }
    public static LinkedList<Integer> addToQueue(int[] array){
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            linkedList.addLast(array[i]);
        }
        return linkedList;
    }

    public static void showStack(Stack<Integer> stack){
        for (Integer integer : stack) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.println(stack);
        while (stack.size() > 0){
            System.out.print(stack.pop() + " ");
        }
    }

    public static void showLinkedList(LinkedList<Integer> linkedList){
        for (Integer integer : linkedList) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.println(linkedList);
        while (linkedList.size() > 0){
            System.out.print(linkedList.poll() + " ");
        }
    }


    static int[] createArray(int size){
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }
}
