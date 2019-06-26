public class E657 {
    public boolean judgeCircle(String moves) {
        int countUD = 0;
        int countLR = 0;
        for(int i =0; i< moves.length();i++){
            if(moves.charAt(i) == 'U'){
                countUD +=1;
            }
            if(moves.charAt(i) == 'D'){
                countUD -=1;
            }
            if(moves.charAt(i) == 'L'){
                countLR +=1;
            }
            if(moves.charAt(i) == 'R'){
                countLR -=1;
            }
        }
        if(countUD == 0 && countLR ==0){
            return true;
        }
        return false;
    }
}
