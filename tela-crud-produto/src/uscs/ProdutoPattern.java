package uscs;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ProdutoPattern {
    
    private static final String DECIMAL_PATTERN = "#,##0.00";
    DecimalFormatSymbols symbols;
    NumberFormat numberFormat; 

    public ProdutoPattern() {
        symbols = new DecimalFormatSymbols(new Locale("pt", "BR"));
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        numberFormat = NumberFormat.getInstance(new Locale("pt", "BR"));
        
    }
    
    
    
    public String formatarDoubleParaString(double valor) {
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        String valorFormatado = numberFormat.format(valor);
        return valorFormatado;
    }
    
    public double formatarStringParaPattern(String s) throws ParseException {
        int ultimoPonto = s.lastIndexOf(".");
        if (ultimoPonto != -1) {
            s = s.substring(0, ultimoPonto) + ',' + s.substring(ultimoPonto + 1);
        }
        DecimalFormat df = new DecimalFormat(DECIMAL_PATTERN, symbols);
        Number num = df.parse(s);
        return num.doubleValue();
    }
}
