import java.util.*;

public class Connect4 {

    public static String[][] createPattern(){
        String[][] f = new String[7][15];
        for (int i=0; i<f.length;i++ )
        {
            for (int j=0; j<f[i].length;j++ )
            {
                if (j% 2 ==0) f[i][j] = "|";
                else f[i][j] = " ";

                if (i == 6) f[i][j] = "-";
            }
        }
      return f;
    }

    public static void printPattern (String[][] f)
    {
        for (int i=0; i<f.length;i++ )
        {
            for (int j=0; j<f[i].length;j++ )
            {
                System.out.print(f[i][j]);
            }
            System.out.println();
        }
    }

    public static void dropRedPattern(String[][] f){
        System.out.println(" drop a red disk 0-6");
        Scanner scan = new Scanner(System.in);
        int c = 2*scan.nextInt()+1;
        for (int i =5;i>=0;i--)
        {
            if (f[i][c] == " ")
            {
                f[i][c] = "R";
                break;
            }
        }
    }

    public static void dropYellowPattern(String[][] f){
        System.out.println(" drop a Yellow disk 0-6");
        Scanner scan = new Scanner(System.in);
        int c = 2*scan.nextInt()+1;
        for (int i =5;i>=0;i--)
        {
            if (f[i][c] == " ")
            {
                f[i][c] = "Y";
                break;
            }
        }
    }

    public static String checkWinner(String[][] f)
    {
        for (int i = 0; i<6; i++)
        {
            for (int j=0; j<7;j+=2)
            {
                if ((f[i][j+1] != " ")
                && (f[i][j+3] != " ")
                    && (f[i][j+5] != " ")
                    && (f[i][j+7] != " ")
                    && ((f[i][j+1] == f[i][j+3])
                        && (f[i][j+3] == f[i][j+5])
                        && (f[i][j+5] == f[i][j+7])))

                    return f[i][j+1];
            }
        }
        return null;
    }

    public static void main(String[] args) {

        String[][] f = createPattern();

        boolean loop = true;
        int count = 0;
        printPattern(f);
        while (loop)
        {
            if (count %2 == 0) dropRedPattern(f);
                else dropYellowPattern(f);
                count++;
                printPattern(f);
            if (checkWinner(f) != null)
            {
                if (checkWinner(f) == "R")
                System.out.println("R wins");
                else if (checkWinner(f) == "Y")
                    System.out.println("Y Wins");
                loop = false;

            }

        }
    }

}
