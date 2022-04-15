class Solution {
    public boolean isValidSudoku(char[][] board) {
        System.out.println("================ row/col ================");
        for (int i = 0; i < 9; i++) {

            List<Character> rowCheck = new ArrayList<>();
            List<Character> colCheck = new ArrayList<>();

            for (int j = 0; j < 9; j++) {

                char row = board[i][j];
                char col = board[j][i];

                // row
                if (row != '.' && rowCheck.contains(row)) {
                    System.out.println("invalid: " + row);
                    return false;
                } else {
                    rowCheck.add(row);
                }

                // col
                if (col != '.' && colCheck.contains(col)) {
                    System.out.println("invalid: " + col);
                    return false;
                } else {
                    colCheck.add(col);
                }
            }
        }

        System.out.println("================ grid ================");
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {

                List<Character> gridCheck = new ArrayList<>();

                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        char gridNum = board[i + k][j + l];
                        if (gridNum != '.' && gridCheck.contains(gridNum)) {
                            System.out.println("invalid: " + gridNum);
                            return false;
                        } else {
                            gridCheck.add(gridNum);
                        }
                    }
                }
            }
        }
        return true;
    }
}