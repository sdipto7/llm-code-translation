
import sys

def main():
    import sys
    input = sys.stdin.read().split()
    
    a = int(input[0])
    b = int(input[1])
    
    ju = [False] * 100001
    pe = [0] * 100001
    wa = 0
    ac = 0
    
    index = 2
    for i in range(b):
        n = int(input[index])
        res = input[index + 1]
        index += 2
        
        if res == "WA" and not ju[n-1]:
            pe[n-1] += 1
        
        if res == "AC":
            ju[n-1] = True
    
    for i in range(a):
        if ju[i]:
            ac += 1
            wa += pe[i]
    
    print(ac, wa)

if __name__ == "__main__":
    main()

