package com.w.designPattern.create.singleton;

/**
 * @ClassName target
 * @Description [目标产出类]
 * @Author ANGLE0
 * @Date 2020/4/29 19:34
 * @Version V1.0
 **/
public class Target {

    private Integer id;
    private String name;

    public Target() {
    }

    public Target(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
