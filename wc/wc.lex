

%%

%%
[^\t \n \ ]+	{ 
                	return new Yytoken(Yytoken.PAL, yytext());
           	}
\n         	{ 
                	return new Yytoken(Yytoken.EOLN, yytext());
           	}  
.         	{ 
                	return new Yytoken(Yytoken.CAR, yytext());
           	}  
