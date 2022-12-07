def solve(A,n):
    l=0
    r= n-1
    if A[l]<A[r] or len(A)==0:
        return 0
    while(l<=r):
        m = r+l//2
        if A[m]>A[m+1]:
            return m+1
        elif A[m]>A[l]:
            l=m+1
        else:
            r=m-1
        