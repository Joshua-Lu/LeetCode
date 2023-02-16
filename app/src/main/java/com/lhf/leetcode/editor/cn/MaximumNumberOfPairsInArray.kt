/**
给你一个下标从 0 开始的整数数组 nums 。在一步操作中，你可以执行以下步骤：


从 nums 选出 两个 相等的 整数
从 nums 中移除这两个整数，形成一个 数对


请你在 nums 上多次执行此操作直到无法继续执行。

返回一个下标从 0 开始、长度为 2 的整数数组 answer 作为答案，其中 answer[0] 是形成的数对数目，answer[1] 是对 nums 尽可
能执行上述操作后剩下的整数数目。



示例 1：

输入：nums = [1,3,2,1,3,2,2]
输出：[3,1]
解释：
nums[0] 和 nums[3] 形成一个数对，并从 nums 中移除，nums = [3,2,3,2,2] 。
nums[0] 和 nums[2] 形成一个数对，并从 nums 中移除，nums = [2,2,2] 。
nums[0] 和 nums[1] 形成一个数对，并从 nums 中移除，nums = [2] 。
无法形成更多数对。总共形成 3 个数对，nums 中剩下 1 个数字。

示例 2：

输入：nums = [1,1]
输出：[1,0]
解释：nums[0] 和 nums[1] 形成一个数对，并从 nums 中移除，nums = [] 。
无法形成更多数对。总共形成 1 个数对，nums 中剩下 0 个数字。

示例 3：

输入：nums = [0]
输出：[0,1]
解释：无法形成数对，nums 中剩下 1 个数字。




提示：


1 <= nums.length <= 100
0 <= nums[i] <= 100


Related Topics 数组 哈希表 计数 👍 57 👎 0

 */

package com.lhf.leetcode.editor.cn

/**
 * 2341. 数组能形成多少数对
 *
 * @author Joshua
 * @date 2023-02-17 00:15:22
 */
class MaximumNumberOfPairsInArray {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun numberOfPairs(nums: IntArray): IntArray {
            // map：key为nums里的数字，value为Boolean变量，表示是否配对成功
            val map = mutableMapOf<Int, Boolean>()
            var res = 0
            // 遍历数组，修改value值，value值为true，说明找到了一对，将结果+1
            nums.forEach {
                map[it] = !map.getOrDefault(it, true)
                if (map[it] == true) {
                    res++
                }
            }
            return intArrayOf(res, nums.size - res * 2)
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}

