
import java.util.*;


class Trie {
    HashMap<Character, TrieNode> neighbors;


    public Trie() {
        neighbors = new HashMap<>();

    }

    public void insert(String word) {
        if (word.isEmpty()) {
            return;
        } else {
            char character = word.charAt(0);
            word = word.substring(1);

            if (neighbors.get(character) == null) {
                // it's not here. it needs to be inserted.
                TrieNode node = new TrieNode(character);
                neighbors.put(character, node);
                if (word.isEmpty()) {
                    node.neighbors.put('*',new TrieNode());

                }
                else{
                    node.insert(word);

                }
            } else {
                TrieNode node = neighbors.get(character);
                if (word.isEmpty()) {
                    node.neighbors.put('*',new TrieNode());

                }
                else{
                        node.insert(word);

                    }
                }


            }
        }
    public boolean search(String word) {
        boolean search_result = true;
        if (word.isEmpty()){
            search_result = false;
        }
        else {
            char character = word.charAt(0);
            word = word.substring(1);
            if (neighbors.get(character) == null) {
                // it's not here. it needs to be inserted.
                search_result = false;
            }
            else {
                TrieNode node = neighbors.get(character);
                if (word.isEmpty()) {
                    if (node.neighbors.get('*') != null) {
                        search_result = true;
                    }
                    else {
                        search_result = false;
                    }

                }
                else {
                    search_result = node.search(word);
                }
            }


        }
        return search_result;

    }

    public boolean startsWith(String word) {
        boolean search_result = true;
        if (word.isEmpty()){
            search_result = true;
        }
        else {
            char character = word.charAt(0);
            word = word.substring(1);

            if (neighbors.get(character) == null) {
                // it's not here. it needs to be inserted.
                search_result = false;
            }
            else {
                TrieNode node = neighbors.get(character);
                search_result = node.startsWith(word);
            }


        }
        return search_result;


    }
    class TrieNode {
        char character;
        HashMap<Character, TrieNode> neighbors;

        public TrieNode() {
        }
        public TrieNode(char character) {;
            this.character = character;
            this.neighbors = new HashMap<>();

        }

        public void insert(String word) {
            if (word.isEmpty()) {
                return;
            } else {
                char character = word.charAt(0);
                word = word.substring(1);

                if (neighbors.get(character) == null) {
                    // it's not here. it needs to be inserted.
                    TrieNode node = new TrieNode(character);
                    neighbors.put(character, node);
                    if (word.isEmpty()) {
                        node.neighbors.put('*',new TrieNode());

                    }
                    else{
                        node.insert(word);

                    }
                } else {
                    TrieNode node = neighbors.get(character);
                    if (word.isEmpty()) {
                        node.neighbors.put('*',new TrieNode());

                    }
                    else{
                        node.insert(word);

                    }
                }


            }

        }
        public boolean search(String word) {
            boolean search_result = true;
            if (word.isEmpty()){
                search_result = false;
            }
            else {
                char character = word.charAt(0);
                word = word.substring(1);
                if (neighbors.get(character) == null) {
                    // it's not here. it needs to be inserted.
                    search_result = false;
                }
                else {
                    TrieNode node = neighbors.get(character);
                    if (word.isEmpty()) {
                        if (node.neighbors.get('*') != null) {
                            search_result = true;
                        }
                        else {
                            search_result = false;
                        }

                    }
                    else {
                        search_result = node.search(word);
                    }
                }


            }
            return search_result;

        }

        public boolean startsWith(String word) {
            boolean search_result = true;
            if (word.isEmpty()){
                search_result = true;
            }
            else {
                char character = word.charAt(0);
                word = word.substring(1);

                if (neighbors.get(character) == null) {
                    // it's not here. it needs to be inserted.
                    search_result = false;
                }
                else {
                    TrieNode node = neighbors.get(character);
                    search_result = node.startsWith(word);
                }


            }
            return search_result;


        }


    }
}