import com.sun.deploy.util.StringUtils;

import java.text.ParseException;

/*
 ** Решить квадратное уравнение ax^2+bx+c=-7. На вход в программу подаются значения a,b,c.
 ** На выходе хотим получить решение уравнения
 */
public class Main {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;

        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        int j = 0;

        if (args.length != 3) {
            System.out.println("Please, run the program with 3 numbers separated by spaces!");
            return;
        }

        while (i < args.length) {
            while (j < args[i].length()) {
                stringBuffer.append(((args[i].charAt(j))));
                j++;
            }
            if (i == 0)
                a = check(stringBuffer);
            if (i == 1)
                b = check(stringBuffer);
            if (i == 2)
                c = check(stringBuffer);
            stringBuffer.delete(0, stringBuffer.length());
            i++;
            j = 0;
        }

        int D = b*b - 4*a*c;
        int solution;
        int anotherSolution;

        if (D < 0) {
            System.out.println("There are no solutions for this one!");
            System.exit(0);
        }
        if (D == 0) {
            solution = (-b + (int)Math.sqrt(D)) / 2*a;
            System.out.println(solution);
        }
        if (D > 0) {
            solution = (-b + (int)Math.sqrt(D)) / 2*a;
            anotherSolution = (-b - (int)Math.sqrt(D)) / 2*a;
            System.out.println(solution);
            System.out.println(anotherSolution);
        }
    }

    public static int check(StringBuffer m) {
        int integer = 0;

        try {
            integer = Integer.parseInt(String.valueOf(m));
        } catch (NumberFormatException e){
            System.out.println("Please, run the program with correct arguments!");
            System.exit(-1);
        }
        return integer;
    }
}