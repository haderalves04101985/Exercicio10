
public class TestaPessoa {

        public static void main(String[] args){
            
            try{
                Pessoa p1=new Pessoa("Lukas", -22);
            }
            
            catch(IdadeInvalidaException ex)
            {
                System.out.println(ex.getMessage());
            }
            
            
            
        }
    
    
    
}
