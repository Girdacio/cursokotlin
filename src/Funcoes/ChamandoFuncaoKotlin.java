package Funcoes;

import kotlin.collections.CollectionsKt;

import java.util.ArrayList;

public class ChamandoFuncaoKotlin {
    public static void main(String[] args) {
        ArrayList<String> list = CollectionsKt.arrayListOf("João", "Maria", "Pedro");
        System.out.println(AdicionaMetodoClasseExistenteKt.secondOrNull(list));
    }
}
