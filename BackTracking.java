public class BackTracking {
    static int count=0;
    public static void main(String[] args) {
        int []arr=new int[5];
        printArray(arr);
        onArray(arr,0);
        printArray(arr);
        subSets("abc","",0);
        System.out.println();
        permutation("abc","");
        char [][]chessboard=new char[8][8];
        for(int i=0;i<chessboard.length;i++){
            for(int j=0;j<chessboard.length;j++){
                chessboard[i][j]='.';
            }
        }
        nQueens(chessboard,0);
        System.out.println("no of ways to place queens are : "+count);
    }
    public static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void onArray(int []arr,int index){
        if(index == arr.length){
            return ;
        }
        arr[index]=index+1;
        onArray(arr,index+1);
        arr[index]=index-1;
    }
    public static void subSets(String str,String ans,int i){
        //base case for
        if(i == str.length()){
            if(ans.length()!=0){
                System.out.print(ans + "  ");
            }else{
                System.out.print("null");
            }
            return;
        }
        //recursion
        //yes
        subSets(str,ans+str.charAt(i),i+1);
        //no
        subSets(str,ans,i+1);
    }
    public static void permutation(String str,String ans){
        if(0 == str.length()){
            System.out.print(ans+" ");
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            permutation(newStr,ans+curr);
        }
    }
    //nqueens
    public static void nQueens(char [][]board,int row){
        if(board.length == row){
            printBoard(board);
            count++;
            return;
        }
        for(int i=0;i<board.length;i++){
            if(isSafe(board,row,i)){
                board[row][i]='Q';
                nQueens(board,row+1);
                board[row][i]='.';
            }
        }
    }
    public static boolean isSafe(char [][]board,int row,int col){
        //vertical
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //diagonal right
        for(int i=row-1,j=col+1; i>=0 && j<board.length ;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void printBoard(char [][]board){
        System.out.println("---chess board---");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
