#include <stdio.h>

int main() {
    char input;
    printf("Enter a character: ");
    scanf("%c", &input);

    if (input >= 'a' && input <= 'z') {
        if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u')
            printf("%c is a Small Vowel.\n", input);
        else
            printf("%c is a Consonant.\n", input);
    } else if (input >= 'A' && input <= 'Z') {
        if (input == 'A' || input == 'E' || input == 'I' || input == 'O' || input == 'U')
            printf("%c is a Capital Vowel.\n", input);
        else
            printf("%c is a Consonant.\n", input);
    } else {
        printf("%c is not an alphabet character.\n", input);
    }

    return 0;
}
