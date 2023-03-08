/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jorman
 */
public class Parrafo {
    
    private String texto;

    //constructor
    public Parrafo() {
        this.texto = "";
    }
    
    public Parrafo(String texto) {
        this.texto = texto;
    }
    //getter
    public String getTexto() {
        return texto;
    }
    //setter
    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int nVocales() {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < texto.length(); i++) {
            if (vowels.indexOf(texto.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    public int nConsonantes() {
        int count = 0;
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        for (int i = 0; i < texto.length(); i++) {
            if (consonants.indexOf(texto.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    public int nSimbolos() {
        int count = 0;
        String symbols = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        for (int i = 0; i < texto.length(); i++) {
            if (symbols.indexOf(texto.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }



    public char vocalModa() {
        int[] vowels = new int[5];
        String vowelsStr = "aeiou";
        for (int i = 0; i < texto.length(); i++) {
            int index = vowelsStr.indexOf(texto.charAt(i));
            if (index != -1) {
                vowels[index]++;
            }
        }
        int maxIndex = 0;
        for (int i = 1; i < vowels.length; i++) {
            if (vowels[i] > vowels[maxIndex]) {
                maxIndex = i;
            }
        }
        return vowelsStr.charAt(maxIndex);
    }

    public int nPalabras() {
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        return count;
    }


    public boolean compararTexto(String txt) {
        return texto.equals(txt);
    }
}
