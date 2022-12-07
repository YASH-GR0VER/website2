class Solution:
    def reverseWords(self, s: str) -> str:
        lst=s.split()
        print(lst)
        for word in lst:
            i=0
            j=len(word)-1
            while(i<j):
                if word[i]