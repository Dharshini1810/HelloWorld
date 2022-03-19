import java.util.ArrayList;

public class HelloWorld {
    public void printloader(int c){
        System.out.println("Loading "+c+"%...");
    }
    public void loadingpercent() throws IllegalStateException{ 
        ArrayList<Character> a=new ArrayList<Character>();
        int[] charposition={8,5,12,12,15,23,15,18,12,4}; 
            int ch=1; 
            // Stack<Character> s=new Stack<>();
            for(int i=0;i<26;i++){
                switch(ch){
                    case 1:
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        printloader(1);
                        break;
                    case 2:
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        printloader(4);
                        break;  
                    case 3: 
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        printloader(9);
                        break; 
                    case 4:
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        printloader(12);
                        break; 
                    case 5:
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        printloader(14);
                        break; 
                    case 6:
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } 
                        printloader(18);
                        break; 
                    case 7:
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } 
                        printloader(22);
                        break; 
                    case 8:
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } 
                        printloader(25);
                        break; 
                    case 9:
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        printloader(30); 
                        break; 
                    case 10:
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        printloader(35);
                        break; 
                    case 11:
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        printloader(39);
                        break; 
                    case 12:
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        printloader(43);
                        break; 
                    case 13:
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        printloader(55);
                        break; 
                    case 14:
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        printloader(61);
                        break; 
                    case 15:
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        printloader(67);
                        break; 
                    case 16:
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        printloader(70);
                        break; 
                    case 17:
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        printloader(73);
                        break; 
                    case 18:
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        printloader(76);
                        break; 
                    case 19:
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        printloader(79);
                        break; 
                    case 20:
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        printloader(81);
                        break; 
                    case 21:
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        printloader(83);
                        break; 
                    case 22:
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        printloader(87);
                        break; 
                    case 23:
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        printloader(90);
                        break;     
                    case 24:
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        printloader(92);
                        break; 
                    case 25:
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        printloader(96);
                        break; 
                    case 26: 
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } 
                        printloader(100);
                        break;   
                    }             
                    ch+=1;    
                    for(int j=0;j<10;j++){
                        if(ch == charposition[j]){
                            char c=(char)(97+(ch-1));
                            a.add(c);
                        }
                    }
            }    
                ArrayList<Character> wordqueue = new ArrayList<Character>();   
                String finalstring = "helloworld";
                for(int k=0;k<finalstring.length();k++){
                    for(int l=0;l<a.size();l++){ 
                        if(finalstring.charAt(k) == a.get(l)){
                            wordqueue.add(a.get(l)); 
                            break;
                        }
                    }
                }  
                for(int i=0;i<wordqueue.size()/2;i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print(wordqueue.get(i));
                } 
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(" ");
                for(int i=wordqueue.size()/2;i<wordqueue.size();i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print(wordqueue.get(i));
                } 
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print("!");
            } 
    public static void main(String[] args){
        System.out.println("Loading 0%...");
        HelloWorld h=new HelloWorld();
        h.loadingpercent();
    }    
}
