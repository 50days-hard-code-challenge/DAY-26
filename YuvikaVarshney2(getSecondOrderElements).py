def getSecondOrderElements(n: int,  a: [int]) -> [int]:
    # Write your code here.
    l=int(-1e9)
    sl=l
    s=int(1e9)
    ss=s
    for i in range(n):
        l=max(a[i],l)
        s=min(a[i],s)
    for i in range(n):
        if (a[i] < ss and a[i] != s):
            ss = a[i]
        if (a[i] > sl and a[i] != l):
            sl= a[i] 

            
    return [sl,ss]
    """
    a.sort()
    return [a[n - 2], a[1]]
    """
    pass
