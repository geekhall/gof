package cn.geekhall.gof.structure.flyweight.sample;

import java.awt.*;

/**
 * @author yiny
 * @Type ChessPieces.java
 * @Desc 抽象享元角色：棋子
 * @date 4/29/21 1:03 PM
 */
public interface ChessPieces {
    /**
     * 落子
     * @param g
     * @param p
     */
    void downPieces(Graphics g, Point p );
}
