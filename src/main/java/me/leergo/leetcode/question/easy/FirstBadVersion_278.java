//278 - 第一个错误的版本	 

// 你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。
// 由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。
//
// 假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。 
//
// 你可以通过调用 bool isBadVersion(version) 接口来判断版本号 version 是否在单元测试中出错。
// 实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。
//
// 示例: 
//
// 给定 n = 5，并且 version = 4 是第一个错误的版本。
//
//调用 isBadVersion(3) -> false
//调用 isBadVersion(5) -> true
//调用 isBadVersion(4) -> true
//
//所以，4 是第一个错误的版本。
// Related Topics 二分查找
// 👍 200 👎 0

package me.leergo.leetcode.question.easy;

public class FirstBadVersion_278 {
    public static void main(String[] args) {
        Solution solution = new FirstBadVersion_278().new Solution();
        System.out.println(solution.firstBadVersion(2 ^ 32 - 1));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    /*
    The isBadVersion API is defined in the parent class VersionControl.
    boolean isBadVersion(int version);
    */
    
    public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int low = 1;
            int hight = n;
            while (low < hight) {
                // 一般 mid = (left+right)/2
                // 为了防止溢出，可以使用下式替代
                int mid = low + (hight - low) / 2;
                if (isBadVersion(mid)) {
                    // isBadVersion(mid) 返回 false，
                    // 因此我们知道 mid 右侧侧（包括自身）的所有版本都是错误的。
                    hight = mid;
                } else {
                    // isBadVersion(mid) 返回 false，
                    // 因此我们知道 mid 左侧（包括自身）的所有版本都是正确的。
                    // 所以我们令 low=mid+1，把下一次的搜索空间变为 [mid+1, height]。
                    low = mid + 1;
                }
            }
            return low;
        }
    }
    
    //leetcode submit region end(Prohibit modification and deletion)
    public class VersionControl {
        boolean isBadVersion(int version) {
            return version >= 1;
        }
    }
}