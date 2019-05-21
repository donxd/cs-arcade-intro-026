boolean evenDigitsOnly(int n) {

    String numeroTexto = String.valueOf( n );
    char [] digitos = numeroTexto.toCharArray();

    String letra;
    int numero;

    boolean resultado = true;
    for ( char digito : digitos ){
        letra = String.valueOf( digito );
        numero = Integer.parseInt( letra );
        if ( numero % 2 != 0 ){
            resultado = false;
            break;
        }
    }

    return resultado;
}