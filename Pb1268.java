class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);

        List<List<String>> ans = new ArrayList<>();
        String prefix = "";

        for (char c : searchWord.toCharArray()) {
            prefix += c;

            List<String> list = new ArrayList<>();

            for (String p : products) {
                if (p.startsWith(prefix)) {
                    list.add(p);
                    if (list.size() == 3)
                        break;
                }
            }

            ans.add(list);
        }

        return ans;
    }
}
