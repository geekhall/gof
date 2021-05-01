package cn.geekhall.gof.creation.singleton;

import java.util.Objects;

/**
 * @author yiny
 * @Type NormalClass.java
 * @Desc
 * @date 4/22/21 8:30 PM
 */
public class NormalClass {
    private String name;

    NormalClass(){

    }
    public NormalClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        NormalClass that = (NormalClass) o;
//        return Objects.equals(name, that.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }
}
