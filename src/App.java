public class App {
    public static int romanToInt(String s) {
        int len = s.length();
        int sum = 0;
        for(int i = 0; i<len;i++){
            if(s.charAt(i) == 'I'){
                if((len!=1)){
                    if(i!=(len-1)){
                        if(s.charAt(i+1) == 'V'){
                            sum += 4;
                        }
                        else if(s.charAt(i+1) == 'X'){
                            sum += 9;
                        }
                        else{
                            sum += 1;
                        }
                    }
                    
                    else{
                        sum += 1;
                    }
                }

                else{
                    sum += 1;
                }
            }

            else if (s.charAt(i) == 'V'){
                if((len!=1)){
                        if(i!= 0){
                            if(s.charAt(i-1) == 'I'){
                            sum += 0;
                            }
                            else {
                                sum += 5;
                            }
                        }
                        
                        else{
                        sum += 5;
                        }
                    }

                else {

                    sum += 5;
                }    
                
            }
                
            else if (s.charAt(i) == 'X'){
                if(len!=1){
                    if(i!=0){
                        if(s.charAt(i-1) == 'I'){
                            sum += 0;
                        }
                        else if(i!=(len-1)){
                            if(s.charAt(i+1) == 'L'){
                            sum += 40;
                        }
                        else if(s.charAt(i+1) == 'C') {
                          sum += 90;
                    }
                    else{
                        sum += 10;
                    }
                            
                }
                        else{
                            sum += 10;
                        }
                        
                    }
                    else{
                        if(s.charAt(i+1) == 'L'){
                            sum += 40;
                        }
                        else if(s.charAt(i+1) == 'C') {
                            
                          sum += 90;
                    }
                    else{
                        sum += 10;
                    }
                    
                    
                    }
                }
            
                else{
                    sum += 10;
                }
            
        }

            else if (s.charAt(i) == 'L'){
                if(len!=1){
                    if(i!=0){
                        if(s.charAt(i-1) == 'X'){
                            sum += 0;
                        }
                        else{
                            sum+=50;
                        }
                    }
                    else{
                        sum+=50;
                    }

                } 
                
                else{
                    sum+=50;
                }
            }
            else if(s.charAt(i) == 'C'){
                if(len!=1){
                    if(i!=0){
                        if(s.charAt(i-1) == 'X'){
                            sum += 0;
                        }
                        else{
                            if(i!=len-1){
                                if(s.charAt(i+1) == 'D'){
                                    sum += 400;
                                }
                                else if(s.charAt(i+1) == 'M') {
                                    
                                sum += 900;
                                }
                                else{
                                    sum += 100;
                                }
                    
                            } 

                            else{
                                sum += 100;
                            }            

                    }
                }
        
                else if(i!=len-1){
                        if(s.charAt(i+1) == 'D'){
                            sum += 400;
                        }
                        else if(s.charAt(i+1) == 'M') {
                            
                          sum += 900;
                        }
                        else{
                            sum += 100;
                        }
                    }   
                }
                else{
                    sum += 100;
                }
            }

            else if(s.charAt(i) == 'D'){
                if(len!=1){
                    if(i!=0){
                        if(s.charAt(i-1) == 'C'){
                            sum += 0;
                        }
                        else{
                            sum += 500;
                        }
                    }
                    else{
                        sum += 500;
                    }
                }
                
                else{
                    sum += 500;
                }
                
            }

            else if(s.charAt(i) == 'M'){
                if(len!=1){
                    if(i!=0){
                        if(s.charAt(i-1) == 'C'){
                            sum += 0;
                        }
                        else{
                            sum += 1000;
                        }
                    }
                    else{
                        sum += 1000;
                    }
                }
                
                else{
                    sum+=1000;
                }
                
            }
        }
        return sum;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(romanToInt("DCCXXXII"));
    }
}
