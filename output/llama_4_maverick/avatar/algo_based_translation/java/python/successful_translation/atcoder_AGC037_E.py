
def main():
    N, K = map(int, input().split())
    S = input()
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
            elif not firstTime:
                break
        if firstTime:
            firstTime = False
            if 2 ** K > N:
                print(sDash[0] * N)
                return
        else:
            step *= 2
        K -= 1
        S = sDash[::-1]
    print(S[::-1])

if __name__ == "__main__":
    main()

