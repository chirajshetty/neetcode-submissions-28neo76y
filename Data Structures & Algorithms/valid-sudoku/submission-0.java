class Solution {
    public boolean isValidSudoku(char[][] board) {

        Map<Integer,HashSet<Character>> row = new HashMap<>();
        Map<Integer,HashSet<Character>> col = new HashMap<>();
        Map<Integer,HashSet<Character>> square = new HashMap<>();

        boolean result = true; 
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                System.out.println(row);
                if(board[i][j] == '.'){
                    continue;
                }

                if(row.containsKey(i)){
                    HashSet<Character> list = row.get(i);
                    if(list.contains(board[i][j])){
                        return false;
                    }else{
                        list.add(board[i][j]);
                    }
                }else{
                    HashSet<Character> list = new HashSet<>();
                    list.add(board[i][j]);
                    row.put(i, list);
                }

                if(col.containsKey(j)){
                    HashSet<Character> list = col.get(j);
                    if(list.contains(board[i][j])){
                        return false;
                    }else{
                        list.add(board[i][j]);
                    }
                }else{
                    HashSet<Character> list = new HashSet<>();
                    list.add(board[i][j]);
                    col.put(j, list);
                }

                int index = (i / 3) * 3 + (j / 3);

                if(square.containsKey(index)){
                    HashSet<Character> list = square.get(index);
                    if(list.contains(board[i][j])){
                        return false;
                    }else{
                        list.add(board[i][j]);
                    }
                }else{
                    HashSet<Character> list = new HashSet<>();
                    list.add(board[i][j]);
                    square.put(index, list);
                }
            }
        }
        return true;
        
    }
}
