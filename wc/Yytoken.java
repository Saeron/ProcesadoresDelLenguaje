public class Yytoken {
    public final static int CAR = 127;
    public final static int PAL = 128;
    public final static int EOLN = 10;

    private int token;
    private String valor;

    public Yytoken(int token, String valor) {
         this.token = token;
         this.valor = valor;
    }
/*
    public Yytoken(int token, String lexema) {
         this(token, Integer.parseInt(lexema));
    }
*/
    public int getToken()  {
         return token;
    }
// devuelve el numero de caracteres
    public int getValor() {
         return valor.length();
    }

    public String toString() {
         return "<"+token+","+valor+">";
    }
}
