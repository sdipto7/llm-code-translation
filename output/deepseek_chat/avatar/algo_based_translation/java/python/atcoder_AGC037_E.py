
import sys

def main():
    data = sys.stdin.read().split()
    N = int(data[0])
    K = int(data[1])
    S = data[2]
    firstTime = True
    step = 1
    
    while K > 0:
        T = S[::-1]
        revU = (S + T)[::-1]
        sDash = S
        
        i = N
        while i >= 0:
            tmp = revU[i:i+N]
            if sDash > tmp:
                sDash = tmp
            else:
                if not firstTime:
                    break
            i -= step
        
        if firstTime:
            firstTime = False
            if 2 ** K > N:
                c = sDash[0]
                print(c * N)
                return
        else:
            step += step
        
        K -= 1
        S = sDash[::-1]
    
    print(S[::-1])

if __name__ == "__main__":
    main()

