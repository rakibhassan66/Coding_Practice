import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner col = new Scanner (System.in);
            System.out.println("Please Insert your desire one character");
            char nal = col.next().charAt(0);
            if(nal=='a'||nal=='e'||nal=='i'||nal=='o'||nal=='u'){
                System.out.printf(" %c is a smaller letter vowel",nal);
            }
    else if(nal=='A'||nal=='E'||nal=='I'||nal=='O'||nal=='U'){
                System.out.printf(" %c is a Capital letter vowel",nal);
            }
    else if(nal=='b'||nal=='c'||nal=='d'||nal=='f'||nal=='i'||nal=='j'||nal=='k'||nal=='l'||nal=='m'||nal=='n'||nal=='p'||nal=='q'||nal=='r'||nal=='s'||nal=='t'||nal=='v'||nal=='w'||nal=='x'||nal=='y'||nal=='z'){
                System.out.printf("%c a consonent smaller letter",nal);
            }
    else if (nal == 'B' || nal == 'C' || nal == 'D' || nal == 'F' || nal == 'G' || nal == 'H' || nal == 'J' || nal == 'K' || nal == 'L' || nal == 'M' || nal == 'N' || nal == 'P' || nal == 'Q' || nal == 'R' || nal == 'S' || nal == 'T' || nal == 'V' || nal == 'W' || nal == 'X' || nal == 'Y' || nal == 'Z') {
                System.out.printf("%c is a Capital letter consonant%n", nal);
            }
    else{
            System.out.println("You've inserted wrong input");
        }
    }
}
