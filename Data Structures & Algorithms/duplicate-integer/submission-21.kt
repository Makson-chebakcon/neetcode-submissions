class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var elemNum = 0
        var secElemNum = 1
        while (elemNum < nums.size)
        {
            val hasDublicate = nums[elemNum]
            while (secElemNum < nums.size)
            {
                if (hasDublicate == nums[secElemNum])
                {
                    return true
                }
                secElemNum+=1
            }
            elemNum+=1
            secElemNum = elemNum+1
        }
        return false
    }
}
