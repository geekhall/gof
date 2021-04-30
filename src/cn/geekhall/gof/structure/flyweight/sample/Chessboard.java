package cn.geekhall.gof.structure.flyweight.sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author yiny
 * @Type Chessboard.java
 * @Desc
 * @date 4/29/21 1:00 PM
 */
public class Chessboard extends MouseAdapter {
    GoFactory goFactory;
    JFrame f;
    Graphics g;
    JRadioButton wz;
    JRadioButton bz;

    private final int x = 50;
    private final int y = 50;
    private final int w = 40;
    private final int rw = 400;

    Chessboard(){
        goFactory = new GoFactory();
        f = new JFrame("享元模式在五子棋游戏中的应用");
        f.setBounds(100,100,500,500);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel SouthJP = new JPanel();
        f.add("South", SouthJP);
        wz = new JRadioButton("白子");
        bz = new JRadioButton("黑子", true);
        ButtonGroup group = new ButtonGroup();
        group.add(wz);
        group.add(bz);
        SouthJP.add(wz);
        SouthJP.add(bz);
        JPanel CenterJP = new JPanel();
        CenterJP.setLayout(null);
        CenterJP.setSize(500,500);
        CenterJP.addMouseListener(this);
        f.add("Center", CenterJP);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        g = CenterJP.getGraphics();
        g.setColor(Color.BLUE);
        g.drawRect(x,y, rw,rw);
        for (int i = 0; i< 10; i++){
            // 绘制第i条竖直线
            g.drawLine(x + (i*w), y, x + (i*w), y + rw);

            // 绘制第i条水平线
            g.drawLine(x, y+(i*w), x+rw, y+(i*w));
        }

    }
    public void mouseClicked(MouseEvent mouseEvent){
        Point pt = new Point(mouseEvent.getX() - 15, mouseEvent.getY() - 15);
        if (wz.isSelected()){
            ChessPieces c1 = goFactory.getChessPieces("w");
            c1.downPieces(g, pt);
        } else if (bz.isSelected()){
            ChessPieces c2 = goFactory.getChessPieces("b");
            c2.downPieces(g, pt);
        }
    }
}
