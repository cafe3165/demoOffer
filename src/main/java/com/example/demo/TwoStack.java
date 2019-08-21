package com.example.demo;
import java.util.Stack;

public class TwoStack {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(!stack2.empty()){
            return stack2.pop();
        }
        else {
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }

    public static void main(String args[]){
        TwoStack test=new TwoStack();
        test.push(1);
        test.push(2);
        System.out.println(test.pop());
        System.out.println(test.pop());


    }


}
