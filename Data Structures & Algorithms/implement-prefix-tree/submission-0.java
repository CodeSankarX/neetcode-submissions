class PrefixTree {

    Node root;
    class Node {
        Map<Character,Node> val;

        boolean isEnd=false;

        public Node(){
            val=new HashMap();
        }
    }

    public PrefixTree() {
        root=new Node();
    }

    public void insert(String word) {
        Node ref=root;
        for(char c:word.toCharArray()){
            if(!ref.val.containsKey(c))
            {
                ref.val.put(c,new Node());
            }
            ref=ref.val.get(c);
        }
        ref.isEnd=true;
    }

    public boolean search(String word) {
        Node ref=root;
        for(char c:word.toCharArray()){
            if(!ref.val.containsKey(c))
            {
                return false;
            }
            ref=ref.val.get(c);
        }
        return ref.isEnd;

    }

    public boolean startsWith(String prefix) {
         Node ref=root;
        for(char c:prefix.toCharArray()){
            if(!ref.val.containsKey(c))
            {
                return false;
            }
            ref=ref.val.get(c);
        }
        return true;
    }
}
