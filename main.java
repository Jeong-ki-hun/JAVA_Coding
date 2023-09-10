import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] map = new char[N][N];

        for(int n =0; n<N;n++){
            map[n] = br.readLine().toCharArray();
        }
        boolean sign = false;
        int x = 0;
        int y = 0;
        for (int i=0; i<map.length;i++){
            for (int j =0; j<map[i].length; j++) {
                if (map[i][j] != '*') {
                    x = i+2;
                    y = j+1;
                    System.out.print(x);
                    System.out.print(y);
                    break;
                }
            }
            if (sign)
            break;

            }
        }

    }
