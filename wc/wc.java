import java.io.FileReader;
import java.io.IOException;

public class wc {
/*
    protected static int suma = 0;
    
    public static void add(int x) {
    	suma += x;
    }
    
    public static int getSuma() {
    	return suma;
    }
    
    public static void reset() {
        suma = 0;	
    }
 */  
   
private static int caracteres,palabras,lineas = 0;
 
    public static void main(String arg[]) {

        if (arg.length>0) {
            try {
                Yylex lex = new Yylex(new FileReader(arg[0]));
                Yytoken yytoken = null;
		while (  (yytoken = lex.yylex()) != null  ) {
                    if (yytoken.getToken() == Yytoken.CAR)  {
                       caracteres++;
                    } else if (yytoken.getToken() == Yytoken.PAL) {
			palabras++;
			caracteres = caracteres + yytoken.getValor();
                    } else if (yytoken.getToken() == Yytoken.EOLN) {
			caracteres++;
			lineas++;;
                    } 
                }
	    } catch (IOException e) {
	    }
        }
	System.out.println( lineas + " "+ palabras + " " + caracteres + " " + arg[0]);
    }

}
