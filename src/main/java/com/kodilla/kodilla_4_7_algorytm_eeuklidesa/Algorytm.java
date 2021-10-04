package com.kodilla.kodilla_4_7_algorytm_eeuklidesa;

class Algorytm {

    int a;
    int b;

    public Algorytm(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int countNWD(){
        while(a != b){
            if(a>b){
                a -= b;
            } else {
                b -= a;
            }
        }

        return a;
    }

    public static void main (String[] args) {
        Algorytm nwd = new Algorytm(24, 18);
        int result = nwd.countNWD();
        System.out.println("Największy wspólny dzielnik to: " + result);
    }
}
