package week2.task2;

public final class Fraction {
    private int numerator;
    private int denominator;

    void setNumerator( int n ) {
        this.numerator = n;
    }
   
    void setDenominator( int d ) {
        this.denominator = d;
    }
  
    int getNumerator() {
        return numerator;
    }
  
    int getDenominator() {
        return denominator;
    }
  

    public Fraction(int numerator, int denominator) {
        this.setNumerator(numerator);
        this.setDenominator(denominator);
    }

    public Fraction add(Fraction other) {
     
        Fraction add = new Fraction(0,1); 
        
        int a = this.getDenominator(); 
        
        this.setNumerator( this.getNumerator()* other.getDenominator()); 
        
        this.setDenominator(a*other.getDenominator()); 
        
        add.setNumerator(this.getNumerator() + a*other.getNumerator()); 
        
        add.setDenominator(this.getDenominator());    
        
        return add;
    }

    public Fraction subtract(Fraction other) {
       
        Fraction sub = new Fraction(0,1); 
        
        int a = this.getDenominator(); 
        
        this.setNumerator( this.getNumerator()* other.getDenominator()); 
        
        this.setDenominator(a* other.getDenominator()); 
        
        sub.setNumerator(this.getNumerator() - a*other.getNumerator());
        
        sub.setDenominator(this.getDenominator());   
        return sub;
    }

    public Fraction multiply(Fraction other) {

        Fraction mul = new Fraction(0,1); 
        
        mul.setNumerator(this.getNumerator()*other.getNumerator()); 
        
        mul.setDenominator(this.getDenominator()*other.getDenominator());
        
        return mul;
    }

    public Fraction divide(Fraction other) {
    
        Fraction div = new Fraction(0,1); 
        
        div.setNumerator(this.getNumerator()*other.getDenominator()); 
        
        div.setDenominator(this.getDenominator()*other.getNumerator()); 
        
        return div;
    }
    
   
    public boolean equals( Fraction other ) {
        boolean check = false;
        if( this.getNumerator() == other.getNumerator() && this.getDenominator() == other.getDenominator() ) check = true; 
        return check;
    }
}