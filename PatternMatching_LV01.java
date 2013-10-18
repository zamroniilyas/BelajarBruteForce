public class PatternMatching_LV01 {
    public static void main(String[] args) {
        boolean force = new PatternMatching_LV01("beli ayam", "Ibu membeli ayam").isDitemukan();
        System.out.println(force);
    }
    
    private boolean ditemukan;
    int i = 0, j = 0;
    short cari=0;
    
    public PatternMatching_LV01(String pattern, String teks) {
        System.out.println("Pattern : "+pattern+", Panjang : "+pattern.length());
        System.out.println("Teks : "+teks+", Panjang : "+teks.length());
        
        char p;
        char t;
                
        outer : do {                        
            p = pattern.charAt(i);
            i++;
            inner : do{                
                t = teks.charAt(j);                
                j++;
                
                if(p != t){
                    System.out.println(p+" - "+t+" = 0 , ");
                    i=0;
                    cari=0;
                    continue outer;
                }else if(p == t){
                    System.out.println(p+" - "+t+" = 1 , ");
                    cari++;
                    if(cari == pattern.length()){                        
                        ditemukan=true;
                    }else{                        
                        ditemukan=false;
                    }                                        
                    continue outer;
                }                
            }while(j<teks.length());
            System.out.println("");
            j=0;
        } while (i<pattern.length());        
    }        

    public boolean isDitemukan() {
        return ditemukan;
    }    
}
