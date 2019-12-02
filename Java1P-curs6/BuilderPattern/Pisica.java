package BuilderPattern;

public class Pisica{
    String nume;
    int gerutate;
    int varsta;
    
    public static class Builder{
        private Pisica p = new Pisica();
        
        public Builder setNume(String nume){
            p.nume = nume;
            return this; 
        }
        
        public Builder setGreutate(int greutate){
            p.gerutate = greutate;
            return this;
        }
        
        public Builder setVarsta(int varsta){
            p.varsta = varsta;
            return this;
        }
        
        public Pisica build(){
            return p;
        }
    }
}

/*
    In loc de constructor, folosim clasa inner Builder cu care construim instante de Pisica.
*/