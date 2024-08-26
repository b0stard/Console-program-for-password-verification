package org.hgwards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пароль:");
        String password = scanner.nextLine();
        String strength = checkPasswordStrength(password);

        System.out.println("Уровень пароля" + strength);

    }

    public static String checkPasswordStrength(String password) {
        int score = 0;
        if (password.length() >= 8){
            score += 2;
        } else {
            System.out.println("Пароль слишком короткий(минимум 8 символов");
        }
        if (password.matches(".*[A-Z].*")) {
            score += 2;
        }
        if (password.matches(".*[a-z].*")) {
            score += 2;
        }
        if (password.matches(".*[0-9].*")) {
            score += 2;
        } if (score >= 8){
            return ":Сильный ";
        }else if (score >=4){
            return ": Средний ";
        } else {
            return " : Слабый ";
        }
    }
}
