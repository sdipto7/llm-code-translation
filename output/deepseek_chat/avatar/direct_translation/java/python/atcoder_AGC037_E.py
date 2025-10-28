
import sys

def main():
    sc = sys.stdin
    N = int(sc.readline())
    K = int(sc.readline())
    S = list(sc.readline().strip())
    firstTime = True
    step = 1
    while K > 0:
        T = S[::-1]
        revU = (S + T)[::-1]
        sDash = ''.join(S)
        for i in range(N, -1, -step):
            tmp = ''.join(revU[i:i+N])
            if sDash > tmp:
                sDash = tmp
            else:
                if not firstTime:
                    break
        if firstTime:
            firstTime = False
            if 2 ** K > N:
                c = sDash[0]
                print(c * N)
                return
        else:
            step += step
        K -= 1
        S = list(sDash[::-1])
    print(''.join(S[::-1]))

if __name__ == "__main__":
    main()

