# 🧮 LeetCode 1: Two Sum
## 🔹 Problem Statement
Given an array of integers `nums` and an integer `target`, return indices of the two numbers that add up to `target`.

## ✅ Approach 1: Brute Force (O(n^2))
- Check all pairs.

## ✅ Approach 2: HashMap (O(n))
- Store values in a hashmap to find complements faster.

```java
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}




📌 **Benefits:**
- Future **you will thank you** for writing down **why** you chose a certain approach.
- If you revisit a problem months later, you’ll **instantly understand your solution**.
- Edge cases & optimizations **are documented**.

---

## **📌 Step 3: Automate a LeetCode Index**
Instead of manually updating your list, **automate it**.

🔹 **Script: `update_index.sh`**
```bash
#!/bin/bash

cd /path/to/leetcode-journal

echo "# 🚀 LeetCode Progress Tracker" > index.md
echo "" >> index.md

for category in */ ; do
    echo "## 📌 ${category%/}" >> index.md
    for problem in "$category"*/ ; do
        if [ -d "$problem" ]; then
            name=$(basename "$problem")
            echo "- [$name]($problem/README.md)" >> index.md
        fi
    done
    echo "" >> index.md
done

echo "Index updated!"
