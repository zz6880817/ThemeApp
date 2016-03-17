package com.example.administrator.mvpdemo;

/**
 * Created by Administrator on 2016/3/15.
 */
public class IBean {
    private String name;
    private int id;
    public IBean(String name,int id){
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
