
import sys

def main():
    N, K = map(int, sys.stdin.readline().split())
    S = sys.stdin.readline().strip()
    first_time = True
    step = 1

    while K > 0:
        T = S[::-1]
        revU = (S + T)[::-1]
        s_dash = S
        i = N

        while i >= 0:
            tmp = revU[i:i+N]
            if s_dash > tmp:
                s_dash = tmp
            else:
                if not first_time:
                    break
            i -= step

        if first_time:
            first_time = False
            if (2 ** K) > N:
                print(s_dash[0] * N)
                return
        else:
            step *= 2

        K -= 1
        S = s_dash[::-1]

    print(S[::-1])

if __name__ == "__main__":
    main()

