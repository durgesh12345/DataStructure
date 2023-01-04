package Tries;
class TriesNode{
    char data;
    boolean isTerminal;
    int childcount = 0;
    TriesNode chidren[];
    public TriesNode (char data) {
        this.data = data;
        this.isTerminal = false;
        this.chidren = new TriesNode[26];
        this.childcount = 0;
    }
}
public class Tries {
    private TriesNode root;
    public Tries(){
        root =  new TriesNode('\0');
    }

    private void addHelper(TriesNode root, String word){
      if (word.length() == 0){
          root.isTerminal = true;

          return;
      }

        int childIndex = word.charAt(0) - 'A';
        TriesNode child = root.chidren[childIndex];
        if (child == null){
            child = new TriesNode(word.charAt(0));
            root.chidren[childIndex] = child;
           child.childcount++;

        }
        addHelper(child,word.substring(1));
    }
    public  void add(String word){
addHelper(root,word);

    }
    public boolean search(String word){

  return searchHelper(root,word);
    }

    private boolean searchHelper(TriesNode root, String word) {
        if (word.length() == 0){
            return root.isTerminal;
        }
        int childIndex = word.charAt(0) -'A';
   TriesNode child = root.chidren[childIndex];
   if (child == null){
       return false;
   }
   return searchHelper(child,word.substring(1));
    }

    public void remove(String word){
        removeHelper(root,word);

    }

    private void removeHelper(TriesNode root, String word) {
        if (word.length() == 0){
            root.isTerminal = false;
            return;
        }
   int childIndex = word.charAt(0) - 'A';
   TriesNode child = root.chidren[childIndex];
   if (child == null){
       return;
   }
   removeHelper(child,word.substring(1));
   if (!child.isTerminal && child.childcount==0){
       root.chidren[childIndex] = null;
       root.childcount--;
   }
    }
}
