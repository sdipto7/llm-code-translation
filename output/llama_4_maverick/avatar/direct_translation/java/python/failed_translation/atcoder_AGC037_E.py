
import sys

def main():
    try:
        N = int(sys.stdin.readline().strip())
        K = int(sys.stdin.readline().strip())
        S = sys.stdin.readline().strip()
        S = S[::-1]
        firstTime = True
        step = 1
        while K > 0:
            T = S[::-1]
            revU = (S + T)[::-1]
            sDash = S
            for i in range(N, -1, -step):
                tmp = revU[i:i+N]
                if sDash > tmp:
                    sDash = tmp
                else:
                    if not firstTime:
                        break
            if firstTime:
                firstTime = False
                if 2 ** K > N:
                    print(sDash[0] * N)
                    sys.exit(0)
            else:
                step += step
            K -= 1
            S = sDash[::-1]
        print(S[::-1])
    finally:
        sys.stdin.close()

if __name__ == "__main__":
    main()

