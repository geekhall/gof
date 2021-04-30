package cn.geekhall.gof.structure.flyweight.sample;

import java.util.ArrayList;

/**
 * @author yiny
 * @Type GoFactory.java
 * @Desc
 * @date 4/29/21 1:03 PM
 */
public class GoFactory {
    private ArrayList<ChessPieces> qz;

    public GoFactory() {
        qz = new ArrayList<ChessPieces>();
        ChessPieces w = new WhitePieces();
        qz.add(w);
        ChessPieces b = new BlackPieces();
        qz.add(b);

    }

    public ChessPieces getChessPieces(String type){
        if (type.equalsIgnoreCase("w")){
            return qz.get(0);
        } else if (type.equalsIgnoreCase("b")){
            return qz.get(1);
        } else {
            return null;
        }

    }
}
