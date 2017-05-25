public class ProcessNumbers {
    double doCalc(double num1,double num2,String opr) {
        double res = 0;
        switch (opr) {
            case  "+":
                res = num1 + num2 ;
                break;
            case  "*":
                res = num1 * num2 ;
                break;
            case  "-":
                res = num1 - num2 ;
                break;
            case  "/":
                if (num2 == 0) {
                    res = 0;
                    break;
                } 
                else {
                    res = num1 / num2;
                    break;
                }
        }
    return res;                
    }
}