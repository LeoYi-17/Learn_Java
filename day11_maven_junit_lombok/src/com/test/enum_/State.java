package com.test.enum_;

public enum State {
    WEIFUKUAN("未付款"), //State WEIFUKUAN  = new State("未付款")
    YIFUKUAN("已付款"), //State YIFUKUAN  = new State("已付款")
    WEISHOUHUO("未收货"), //State  WEISHOUHUO  = new State("未收货")
    YISHOUHUO("已收货"); //State YISHOUHUO  = new State("已收货")
    private String name;
    private State(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
