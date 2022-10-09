package org.etsntesla.it.math.exceptions;

import org.etsntesla.it.math.Line;

public class MathGeometryException extends  Exception{

    String msg;


    public MathGeometryException(Line line1, Line line2) {
        msg = "Linije "+line1.toString()+ " i "+line2.toString();
        if(line1.getCoefficient()==line2.getCoefficient())
            msg+=" imaju beskonacno mnogo resenja!";
        else
            msg+= " nemaju zajednickih resenja!";
    }


    @Override
    public String getMessage() {
        return msg;
    }
}
