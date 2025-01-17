class Trie {
    class Node{
        Node[] childrens= new Node[26];
        boolean eow = false;
    
        public Node(){
            for (int i = 0; i < childrens.length; i++) {
                childrens[i]=null;
            }
        }
    }

    public Node root;

    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        Node curr = root;
        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level)-'a';
            if(curr.childrens[idx]==null){
                curr.childrens[idx]= new Node();
            }
            curr = curr.childrens[idx];
        }
        curr.eow=true;
    }
    
    public boolean search(String word) {
        Node curr = root;
        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level)-'a';
            if(curr.childrens[idx]==null){
                return false;
            }
            curr = curr.childrens[idx];
        }
        return curr.eow==true;
    }
    
    public boolean startsWith(String prefix) {
         Node curr = root;
        for(int level=0; level<prefix.length(); level++){
            int idx = prefix.charAt(level)-'a';
            if(curr.childrens[idx]==null){
                return false;
            }
            curr = curr.childrens[idx];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */