
import java.util.Scanner;

public class ZombieCypher {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int cases = scnr.nextInt();
        String word = "";
        String newWord = "";
        for(int i = 0; i < cases+1; i++){
            word = scnr.nextLine();
            for(int j = 0; j < word.length(); j++){
                char letter = word.charAt(j);  
                if(letter == 'A'){
                    newWord += "E";
                }
                else if(letter == 'a'){
                    newWord += "e";
                }
                else if(letter == 'E'){
                    newWord += "I";
                }
                else if(letter == 'e'){
                    newWord += 'i';
                }
                else if(letter == 'I'){
                    newWord += "O";
                }
                else if(letter == 'i'){
                    newWord += "o";
                }
                else if(letter == 'O'){
                    newWord += "U";
                }
                else if(letter == 'o'){
                    newWord += "u";
                }
                else if(letter == 'U'){
                    newWord += "A";
                }
                else if(letter == 'u'){
                    newWord += "a";
                }
                else if(letter == 'B'){
                    newWord += 'C';
                }
                else if(letter == 'b'){
                    newWord += 'c';
                }
                else if(letter == 'C'){
                    newWord += 'D';
                }
                else if(letter == 'c'){
                    newWord += 'd';
                }
                else if(letter == 'D'){
                    newWord += 'E';
                }
                else if(letter == 'd'){
                    newWord += 'e';
                }
                else if(letter == 'F'){
                    newWord += 'G';
                }
                else if(letter == 'f'){
                    newWord += 'g';
                }
                else if(letter == 'G'){
                    newWord += 'H';
                }
                else if(letter == 'g'){
                    newWord += 'h';
                }
                else if(letter == 'H'){
                    newWord += 'I';
                }
                else if(letter == 'h'){
                    newWord += 'i';
                }
                else if(letter == 'J'){
                    newWord += 'K';
                }
                else if(letter == 'j'){
                    newWord += 'k';
                }
                else if(letter == 'K'){
                    newWord += 'L';
                }
                else if(letter == 'k'){
                    newWord += 'l';
                }
                else if(letter == 'L'){
                    newWord += 'M';
                }
                else if(letter == 'l'){
                    newWord += 'm';
                }
                else if(letter == 'M'){
                    newWord += 'N';
                }
                else if(letter == 'm'){
                    newWord += 'n';
                }
                else if(letter == 'N'){
                    newWord += 'O';
                }
                else if(letter == 'n'){
                    newWord += 'o';
                }
                else if(letter == 'P'){
                    newWord += 'Q';
                }
                else if(letter == 'p'){
                    newWord += 'q';
                }
                else if(letter == 'Q'){
                    newWord += 'R';
                }
                else if(letter == 'q'){
                    newWord += 'r';
                }
                else if(letter == 'R'){
                    newWord += 'S';
                }
                else if(letter == 'r'){
                    newWord += 's';
                }
                else if(letter == 'S'){
                    newWord += 'T';
                }
                else if(letter == 's'){
                    newWord += 't';
                }
                else if(letter == 'T'){
                    newWord += 'U';
                }
                else if(letter == 't'){
                    newWord += 'u';
                }
                else if(letter == 'V'){
                    newWord += 'W';
                }
                else if(letter == 'v'){
                    newWord += 'w';
                }
                else if(letter == 'W'){
                    newWord += 'X';
                }
                else if(letter == 'w'){
                    newWord += 'x';
                }
                else if(letter == 'X'){
                    newWord += 'Y';
                }
                else if(letter == 'x'){
                    newWord += 'y';
                }
                else if(letter == 'Y'){
                    newWord += 'Z';
                }
                else if(letter == 'y'){
                    newWord += 'z';
                }else if(letter == 'Z'){
                    newWord += 'B';
                }
                else if(letter == 'z'){
                    newWord += 'b';
                }
                else{
                    newWord += letter;
                }
            }
            newWord+="\n";
        }
        System.out.println(newWord);

        scnr.close();
    }
}
