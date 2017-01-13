public class Caesar
{
    char[][]Caesar;
    String Sentence;
    int root;
    public Caesar(String sentence)
    {
        Sentence = sentence;
        int Root =(int) Math.sqrt(sentence.length());
        root = Root;
        Caesar = new char [root][root];        
    }

    public void createArray(){
        int y = 0;
        if(root*root==Sentence.length()){
            for(int r = 0; r<root; r++){
                for(int c = 0;c<root;c++){
                    Caesar[r][c] =  Sentence.charAt(y++);
                    System.out.print(" " + Caesar[r][c]);

                }
                System.out.println();
            }
        }else{
            System.out.println("you messed up, try again");
        }
    }   

    public void message()
    {
        for(int r = 0; r<root; r++){
            for(int c = 0;c<root;c++){
                System.out.print(Caesar[c][r]);
            }
        }
    }
}