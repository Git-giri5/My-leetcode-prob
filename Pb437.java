class Solution {
    int count = 0;

    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> prefix = new HashMap<>();
        prefix.put(0L, 1);

        dfs(root, 0L, targetSum, prefix);
        return count;
    }

    private void dfs(TreeNode node, long currentSum, int target,
                     Map<Long, Integer> prefix) {

        if (node == null) return;

        currentSum += node.val;

        // Check if a previous prefix sum makes the path sum = target
        count += prefix.getOrDefault(currentSum - target, 0);

        prefix.put(currentSum, prefix.getOrDefault(currentSum, 0) + 1);

        dfs(node.left, currentSum, target, prefix);
        dfs(node.right, currentSum, target, prefix);

        // Backtrack
        prefix.put(currentSum, prefix.get(currentSum) - 1);
    }
}