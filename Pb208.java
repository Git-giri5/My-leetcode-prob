class Trie {
    Trie[] child = new Trie[26];
    boolean end = false;

    public Trie() {
    }

    public void insert(String word) {
        Trie cur = this;

        for (char c : word.toCharArray()) {
            int i = c - 'a';

            if (cur.child[i] == null)
                cur.child[i] = new Trie();

            cur = cur.child[i];
        }

        cur.end = true;
    }

    public boolean search(String word) {
        Trie cur = this;

        for (char c : word.toCharArray()) {
            int i = c - 'a';

            if (cur.child[i] == null)
                return false;

            cur = cur.child[i];
        }

        return cur.end;
    }

    public boolean startsWith(String prefix) {
        Trie cur = this;

        for (char c : prefix.toCharArray()) {
            int i = c - 'a';

            if (cur.child[i] == null)
                return false;

            cur = cur.child[i];
        }

        return true;
    }
}
