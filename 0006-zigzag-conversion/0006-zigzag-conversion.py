class Solution(object):
    def convert(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        if numRows == 1 or numRows >= len(s):
            return s

        rows = [''] * numRows #list of rows(strings)
        flag = 1 # changes when moving up or down
        row = 0

        for char in s:
            rows[row] += char

            # Change direction at the top and bottom rows
            if row == 0:
                flag = 1
            elif row == numRows - 1:
                flag = -1

            row += flag
            
        # Join all rows to get the final string
        return ''.join(rows)