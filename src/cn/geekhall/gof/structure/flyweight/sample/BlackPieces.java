package cn.geekhall.gof.structure.flyweight.sample;

import java.awt.*;

/**
 * @author yiny
 * @Type WhitePieces.java
 * @Desc 具体享元角色：黑子
 * @date 4/29/21 1:05 PM
 */
public class BlackPieces implements ChessPieces {
    @Override
    public void downPieces(Graphics g, Point p) {
        g.setColor(Color.BLACK);
        g.fillOval(p.x, p.y, 30, 30);
    }
}
