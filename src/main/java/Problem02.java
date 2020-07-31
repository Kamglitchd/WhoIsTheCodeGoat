public class Problem02 {

    public static String magicSquare(int n) {
//        String table = "";
        String square="";
        int[][] table = new int[n][n];
        int row = n / 2;
        int col = n - 1;
//        for (int row = n/2; row <= n; row++) {
//            for (int col = n-1; col <= n; col++){
        table[row][col] = 1;
        for (int i = 2; i <= n * n; i++) {
            if (table[(row + 1) % n][(col + 1) % n] == 0) {
                row = (row + 1) % n;
                col = (col + 1) % n;
            } else {
                col= (col - 1 + n) % n;
            }
            table[row][col] = i;
            // }

            //}
//                int product = col * (row+1);
//                String partial_row = String.format("%4d", product);
//
//                table+= partial_row;
//
//            }
            //table = table + "\n";
        }
        square+="Magic Square of size " + n +"\n";
        square+="----------------------"+"\n";
//        System.out.println(table);
        for(row=n-1; row>=0; row--) {
            for(col=0; col<n; col++) {
                square+=table[row][col] + "   ";
            }
            square+="\n";
        }
        square+="Sum in each row & each column = " + n +
                "*(" + n + "^2"+ "+1)/2 = " + n * (n * n + 1) / 2;
        //System.out.println(square);
        return square;
    }
    public static void main (String[] args) {
        magicSquare(3);
        magicSquare(5);
        magicSquare(7);
    }
}

