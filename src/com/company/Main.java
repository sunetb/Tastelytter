package com.company;

public class Main {

    public static void main(String[] args) {
	//Her et eksempel på hvordan tastelytteren kan bruges til at flytte et dyr
    // Det er ikke en del af nogen af opgavene, men skal illustrere hvordan den kan bruges
        Animal a = new Animal();

        Tastelytter t = new Tastelytter(){
            @Override
            void op() {
                a.flyt("op");
                opdaterBræt();
            }

            @Override
            void ned() {
                a.flyt("ned");
                opdaterBræt();
            }

            //Hvis du vil lytte til andre end piletasterne, fx awsd, prøv dig frem:

            @Override
            void andenTast(int x) {
                System.out.println(x);
                System.out.println((char) x);
                if(x == 87) System.out.println("Der blev trykket W");
            }
        };

    }

 static void opdaterBræt(){
        //
 }


}


class Animal {
    int x,y;
    void flyt(String retning){
        if (retning.equals("op")){
            y--;
            System.out.println("Jeg flytter op");
        }
        else if (retning.equals("ned")){
            y++;
            System.out.println("Jeg flytter ned");
        }
    }
}