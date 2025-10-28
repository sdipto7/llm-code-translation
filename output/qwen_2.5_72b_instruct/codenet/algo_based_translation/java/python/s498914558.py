import sys

def main():
    import sys
    from array import array
    from bisect import insort
    
    n = int(input().strip())
    m = int(input().strip())
    po = array('i')
    
    for i in range(n):
        value = int(input().strip())
        po.append(value)
        m -= value
    
    po = sorted(po)
    print(n + m // po[0])

if __name__ == "__main__":
    main()
