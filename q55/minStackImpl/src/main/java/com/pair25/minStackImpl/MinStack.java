package com.pair25.minStackImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MinStack {
    private int stk[];
    private int top;
    private int capacity;

    private Integer minIndex;

    public MinStack(){

    }
    MinStack(int size){
        stk=new int[size];
        capacity=size;
        top=-1;
        minIndex =null;
    }

    public int[] getStk() {
        return stk;
    }

    public void setStk(int[] stk) {
        this.stk = stk;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Integer getMinIndex() {
        return minIndex;
    }

    public void setMinIndex(Integer minIndex) {
        this.minIndex = minIndex;
    }


    public boolean isFull(){
        return top==capacity-1;
    }
    public boolean isEmpty() {
        return top == -1;
    }

    public int top(){
        if(isEmpty()){
            System.out.println("Stack Empty");
        }
        else {
            return stk[top];
        }
        return -1;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Empty");
        }
        else {
            int popedValue=stk[minIndex];
            for (int i = minIndex; i<top; i++){
                stk[i]=stk[i+1];
            }
            top--;
            return popedValue;
        }
        return -1;
    }

    public void show(){
        for (int i=0;i<=top;i++){
            System.out.print(stk[i]+" ");
        }
    }
    public void push(int x)
    {
        if (isFull()){
            System.out.println("Overflow");
            System.exit(-1);
        }
        if(minIndex ==null || x<= stk[minIndex]){
            minIndex =top+1;
        }
        stk[++top] = x;

    }
    public static void main(String[] args) {
        SpringApplication.run(MinStack.class, args);
    }

}
